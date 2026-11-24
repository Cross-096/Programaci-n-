package crearClases;

public class PostIt {
	int alto;
	int ancho;
	String color;
	String mensaje;

	public PostIt(int alto, int ancho, String color, String mensaje) {

		this.alto = alto;
		this.ancho = ancho;
		this.color = color;
		this.mensaje = mensaje;
	}

	public PostIt(String mensaje) {
		this(80, 80, "Amarillo", mensaje);
	}

	public PostIt(PostIt p) {
		alto = p.alto;
		ancho = p.ancho;
		color = p.color;
		mensaje = p.mensaje;
	}

	void show() {
		System.out.printf("Post-It %s de %dx%d: %s%n", color, alto, ancho, mensaje);
	}
}
