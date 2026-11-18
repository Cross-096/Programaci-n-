import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Batalla estilo "bullet hell por turnos" (inspirada en la mecanica de Undertale).
 * Jefe original: Faro, el farero fantasma.
 *
 * Controles: Flechas = mover / elegir, Z o ENTER = confirmar.
 * Eclipse: File > New > Java Project, pegar este archivo en src (paquete por defecto) y Run.
 */
public class BatallaFaro extends JPanel implements ActionListener, KeyListener {

    enum Estado { MENU, BARRA, TEXTO, ESQUIVA, VICTORIA, DERROTA }

    static final int W = 800, H = 600;
    static final int BX = 250, BY = 250, BW = 300, BH = 140; // caja de combate
    static final String[] OPCIONES = { "FIGHT", "ACT", "ITEM", "MERCY" };

    final Random rnd = new Random();
    final boolean[] teclas = new boolean[256];
    final List<float[]> balas = new ArrayList<>(); // {x, y, vx, vy, w, h}

    Estado estado = Estado.MENU;
    Runnable despuesTexto;
    String mensaje = "* Faro apaga su linterna y te mira.";
    int hp = 20, hpJefe = 100, sel = 0, turno = 0, pociones = 3, amistad = 0;
    float px, py;
    int invul = 0, ticks = 0, tickAtaque = 0;
    float barraX = 0, barraDir = 7;
    float angulo = 0;

    public BatallaFaro() {
        setPreferredSize(new Dimension(W, H));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);
        new Timer(16, this).start();
    }

    // ---------- Logica ----------
    void mostrar(String texto, Runnable despues) {
        mensaje = texto;
        despuesTexto = despues;
        estado = Estado.TEXTO;
    }

    void iniciarEsquiva() {
        estado = Estado.ESQUIVA;
        ticks = 0;
        balas.clear();
        px = BX + BW / 2f;
        py = BY + BH / 2f;
        angulo = 0;
    }

    void finTurnoJugador(String texto) {
        mostrar(texto, () -> iniciarEsquiva());
    }

    void confirmar() {
        switch (estado) {
            case MENU:
                if (sel == 0) {
                    estado = Estado.BARRA;
                    barraX = 0;
                    barraDir = 7;
                } else if (sel == 1) {
                    amistad++;
                    String[] frases = {
                        "* Le hablas de las olas. Faro parece escuchar.",
                        "* Le ofreces una vela nueva. Sus ojos brillan.",
                        "* Le preguntas por los barcos. Faro suspira.",
                        "* Faro ya no quiere pelear..." };
                    finTurnoJugador(frases[Math.min(amistad - 1, 3)]);
                } else if (sel == 2) {
                    if (pociones > 0) {
                        pociones--;
                        hp = Math.min(20, hp + 10);
                        finTurnoJugador("* Bebes un te caliente. +10 HP. (" + pociones + " restantes)");
                    } else {
                        mostrar("* No te quedan objetos.", () -> estado = Estado.MENU);
                    }
                } else {
                    if (amistad >= 3) {
                        mostrar("* Perdonas a Faro. Enciende su luz y te guia a casa.", () -> estado = Estado.VICTORIA);
                    } else {
                        finTurnoJugador("* Faro no esta listo para que le perdones.");
                    }
                }
                break;
            case BARRA:
                float centro = BW / 2f + 100;
                float ancho = centro; // la barra mide 2*centro
                int dano = Math.max(1, (int) (30 * (1 - Math.abs(barraX - centro) / ancho)));
                hpJefe -= dano;
                if (hpJefe <= 0) {
                    hpJefe = 0;
                    mostrar("* Faro se desvanece como una vela al viento.", () -> estado = Estado.VICTORIA);
                } else {
                    finTurnoJugador("* Golpeas a Faro. -" + dano + " HP.");
                }
                break;
            case TEXTO:
                if (despuesTexto != null) despuesTexto.run();
                break;
            case VICTORIA:
            case DERROTA:
                reiniciar();
                break;
            default:
        }
    }

    void reiniciar() {
        hp = 20; hpJefe = 100; turno = 0; pociones = 3; amistad = 0; sel = 0;
        mensaje = "* Faro apaga su linterna y te mira.";
        estado = Estado.MENU;
    }

    void bala(float x, float y, float vx, float vy, float w, float h) {
        balas.add(new float[] { x, y, vx, vy, w, h });
    }

    void actualizarEsquiva() {
        ticks++;
        // movimiento del alma
        float v = 3.2f;
        if (teclas[KeyEvent.VK_LEFT]) px -= v;
        if (teclas[KeyEvent.VK_RIGHT]) px += v;
        if (teclas[KeyEvent.VK_UP]) py -= v;
        if (teclas[KeyEvent.VK_DOWN]) py += v;
        px = Math.max(BX + 8, Math.min(BX + BW - 8, px));
        py = Math.max(BY + 8, Math.min(BY + BH - 8, py));

        // patrones segun el turno
        int patron = turno % 4;
        float cx = BX + BW / 2f, cy = BY + BH / 2f;
        switch (patron) {
            case 0: // lluvia de chispas
                if (ticks % 8 == 0) bala(BX + rnd.nextInt(BW - 10), BY - 10, 0, 3.2f, 10, 10);
                break;
            case 1: // barras con hueco
                if (ticks % 45 == 0) {
                    float hueco = BX + 20 + rnd.nextInt(BW - 100);
                    bala(BX, BY - 12, 0, 2.6f, hueco - BX, 12);
                    bala(hueco + 70, BY - 12, 0, 2.6f, BX + BW - hueco - 70, 12);
                }
                break;
            case 2: // rafagas circulares desde el centro de la caja
                if (ticks % 30 == 0) {
                    for (int i = 0; i < 8; i++) {
                        double a = angulo + i * Math.PI / 4;
                        bala(cx, cy, (float) Math.cos(a) * 2.2f, (float) Math.sin(a) * 2.2f, 9, 9);
                    }
                    angulo += 0.3f;
                }
                break;
            default: // disparos apuntados desde los lados
                if (ticks % 28 == 0) {
                    boolean izq = rnd.nextBoolean();
                    float sx = izq ? BX : BX + BW;
                    float sy = BY + rnd.nextInt(BH);
                    double a = Math.atan2(py - sy, px - sx);
                    bala(sx, sy, (float) Math.cos(a) * 3.4f, (float) Math.sin(a) * 3.4f, 10, 10);
                }
        }

        // mover balas y colisiones
        if (invul > 0) invul--;
        for (int i = balas.size() - 1; i >= 0; i--) {
            float[] b = balas.get(i);
            b[0] += b[2];
            b[1] += b[3];
            if (b[0] < BX - 40 || b[0] > BX + BW + 40 || b[1] < BY - 40 || b[1] > BY + BH + 40) {
                balas.remove(i);
                continue;
            }
            boolean choca = px + 6 > b[0] && px - 6 < b[0] + b[4] && py + 6 > b[1] && py - 6 < b[1] + b[5];
            if (choca && invul == 0) {
                hp -= 3;
                invul = 50;
                if (hp <= 0) {
                    hp = 0;
                    estado = Estado.DERROTA;
                    return;
                }
            }
        }

        if (ticks > 60 * 7) { // 7 segundos
            turno++;
            balas.clear();
            String[] frases = {
                "* La llama de Faro tiembla.", "* El mar ruge a lo lejos.",
                "* Faro te observa con calma.", "* Huele a sal y a cera." };
            mensaje = frases[turno % 4];
            estado = Estado.MENU;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (estado == Estado.BARRA) {
            barraX += barraDir;
            float max = (BW / 2f + 100) * 2;
            if (barraX < 0 || barraX > max) {
                barraDir = -barraDir;
                barraX = Math.max(0, Math.min(max, barraX));
            }
        } else if (estado == Estado.ESQUIVA) {
            actualizarEsquiva();
        }
        repaint();
    }

    // ---------- Dibujo ----------
    @Override
    protected void paintComponent(Graphics g0) {
        super.paintComponent(g0);
        Graphics2D g = (Graphics2D) g0;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setFont(new Font("Monospaced", Font.BOLD, 20));

        dibujarJefe(g);

        // barra de vida del jefe
        g.setColor(Color.DARK_GRAY);
        g.fillRect(300, 20, 200, 10);
        g.setColor(Color.YELLOW);
        g.fillRect(300, 20, hpJefe * 2, 10);

        // caja de combate
        g.setColor(Color.WHITE);
        g.setStroke(new BasicStroke(4));
        g.drawRect(BX, BY, BW, BH);

        if (estado == Estado.ESQUIVA) {
            g.setColor(new Color(255, 200, 80));
            for (float[] b : balas) g.fillOval((int) b[0], (int) b[1], (int) b[4], (int) b[5]);
        }
        if (estado == Estado.BARRA) dibujarBarra(g);

        // texto
        g.setColor(Color.WHITE);
        if (estado == Estado.MENU || estado == Estado.TEXTO) dibujarTexto(g, mensaje);
        if (estado == Estado.VICTORIA) dibujarTexto(g, "* ¡HAS GANADO! (Z para reiniciar)");
        if (estado == Estado.DERROTA) dibujarTexto(g, "* Tu determinacion se apaga... (Z para reiniciar)");

        // alma
        if (estado == Estado.ESQUIVA && (invul / 4) % 2 == 0) dibujarAlma(g, px, py);
        if (estado == Estado.MENU) dibujarAlma(g, 70 + sel * 175 - 18, 541);

        // HUD
        g.setColor(Color.WHITE);
        g.drawString("TU   LV 1", 70, 500);
        g.setColor(Color.RED);
        g.fillRect(260, 485, 20 * 4, 16);
        g.setColor(Color.YELLOW);
        g.fillRect(260, 485, hp * 4, 16);
        g.setColor(Color.WHITE);
        g.drawString(hp + " / 20", 360, 500);

        // botones
        for (int i = 0; i < 4; i++) {
            g.setColor(i == sel && estado == Estado.MENU ? Color.YELLOW : new Color(255, 140, 0));
            g.setStroke(new BasicStroke(3));
            g.drawRect(70 + i * 175, 520, 150, 45);
            g.drawString(OPCIONES[i], 100 + i * 175, 550);
        }
    }

    void dibujarTexto(Graphics2D g, String t) {
        g.setColor(Color.WHITE);
        g.drawString(t, 80, 285);
    }

    void dibujarAlma(Graphics2D g, float x, float y) {
        g.setColor(Color.RED);
        int[] xs = { (int) x, (int) x + 8, (int) x, (int) x - 8 };
        int[] ys = { (int) y - 8, (int) y, (int) y + 8, (int) y };
        g.fillPolygon(xs, ys, 4);
        g.fillOval((int) x - 8, (int) y - 8, 9, 9);
        g.fillOval((int) x - 1, (int) y - 8, 9, 9);
    }

    void dibujarBarra(Graphics2D g) {
        int x0 = 100, y0 = 300, ancho = 600, alto = 50;
        g.setColor(new Color(40, 40, 40));
        g.fillRect(x0, y0, ancho, alto);
        g.setColor(new Color(60, 160, 60));
        g.fillRect(x0 + ancho / 2 - 30, y0, 60, alto);
        g.setColor(Color.WHITE);
        g.drawRect(x0, y0, ancho, alto);
        float max = (BW / 2f + 100) * 2;
        int cursor = (int) (x0 + barraX / max * ancho);
        g.fillRect(cursor - 4, y0 - 6, 8, alto + 12);
        g.drawString("Pulsa Z para golpear", 280, y0 + 85);
    }

    // Jefe original: Faro, un farero fantasma con linterna por cabeza
    void dibujarJefe(Graphics2D g) {
        int cx = W / 2;
        int bob = (int) (Math.sin(System.currentTimeMillis() / 400.0) * 5);
        // capa
        g.setColor(new Color(40, 60, 110));
        g.fillRoundRect(cx - 50, 120 + bob, 100, 110, 40, 40);
        // linterna (cabeza)
        g.setColor(new Color(255, 220, 120, 70));
        g.fillOval(cx - 70, 30 + bob, 140, 140);
        g.setColor(new Color(255, 230, 140));
        g.fillRoundRect(cx - 35, 50 + bob, 70, 80, 20, 20);
        g.setColor(new Color(90, 60, 30));
        g.fillRect(cx - 40, 42 + bob, 80, 10);
        g.fillRect(cx - 40, 128 + bob, 80, 10);
        // ojos
        g.setColor(Color.BLACK);
        boolean enojado = amistad < 3;
        g.fillOval(cx - 20, 80 + bob, 12, 16);
        g.fillOval(cx + 8, 80 + bob, 12, 16);
        g.setStroke(new BasicStroke(3));
        if (enojado) g.drawArc(cx - 14, 108 + bob, 28, 12, 0, 180);
        else g.drawArc(cx - 14, 104 + bob, 28, 14, 180, 180);
    }

    // ---------- Teclado ----------
    @Override
    public void keyPressed(KeyEvent e) {
        int k = e.getKeyCode();
        if (k < teclas.length) teclas[k] = true;
        if (estado == Estado.MENU) {
            if (k == KeyEvent.VK_LEFT) sel = (sel + 3) % 4;
            if (k == KeyEvent.VK_RIGHT) sel = (sel + 1) % 4;
        }
        if (k == KeyEvent.VK_Z || k == KeyEvent.VK_ENTER) confirmar();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() < teclas.length) teclas[e.getKeyCode()] = false;
    }

    @Override
    public void keyTyped(KeyEvent e) { }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame f = new JFrame("Batalla contra Faro");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setContentPane(new BatallaFaro());
            f.pack();
            f.setResizable(false);
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        });
    }
}
