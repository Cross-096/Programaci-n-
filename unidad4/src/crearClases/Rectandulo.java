package crearClases;

public class Rectandulo {
	int base;
	int altura;
	String color;
	String[] coloresPermitidos = { "azul", "rojo", "verde", "blanco" };

	public Rectandulo(int base, int altura, String color) {
		this.base = base;
		this.altura = altura;
		this.color = "blanco";
		for (String colores : coloresPermitidos) {
			if (colores.equalsIgnoreCase(color)) {
				this.color = color;
				break;
			}
		}
	}

	public Rectandulo(int base, int altura) {
		this(base, altura, "Blanco");
	}

	public Rectandulo() {
		this(2, 2, "Blanco");
	}

	public Rectandulo(Rectandulo p) {
		base = p.base;
		altura = p.altura;
		color = p.color;
	}

	void show() {
		System.out.printf("Rectangulo %s de %dx%d%n", color, base, altura);
	}

	public int area() {
		return base * altura;
	}

	public int perimetro() {
		return (base + altura) * 2;
	}

	public void duplicar() {
		base = base * 2;
		altura = altura * 2;
	}

	public void agrandar(int n) {
		base = base * n;
		altura = altura * n;
	}

	public void pintar(String color) {
		for (String colores : coloresPermitidos) {
			if (colores.equalsIgnoreCase(color))
				this.color = color;
			break;
		}
	}

}
