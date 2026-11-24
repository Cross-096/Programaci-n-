package crearClases;

public class Circulo {
	private int id;
	private final static String clase = "Circulo";
	private String color;
	private int radio;
	
	public static String dameNombre() {
		return clase;
	}
	private static int nextId = 1;
	public Circulo(String color, int radio) {
		id = nextId++;
		this.color = color;
		this.radio = radio;
	}
	public void show() {
		System.out.printf("%s (id = %d), %s de %d %n", clase, id, color, radio);
		
	}
}
