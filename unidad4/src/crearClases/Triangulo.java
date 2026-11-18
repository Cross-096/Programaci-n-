package crearClases;

public class Triangulo {
	String color;
	int base;
	int altura;

	public Triangulo(String color, int base, int altura) {

		this.color = "Azul".equals(color) 
				|| "Rojo".equals(color) 
				|| "Verde".equals(color) ? color : "Blanco";
		this.base = base > 0 ? base : 1;
		this.altura = altura > 0 ? altura : 1;
	}

	public Triangulo(int base, int altura) {
		color = "Blanco";
		this.base = base > 0 ? base : 1;
		this.altura = altura > 0 ? altura : 1;
	}

	public Triangulo() {
		this("Blanco", 1, 1);
	}
}
