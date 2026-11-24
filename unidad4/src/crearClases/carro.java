package crearClases;

public class carro {
	String Color;
	double Potencia;
	int Precio;
	int Kmh;
	boolean Funciona;

	public carro(String Color, double Potencia, int Precio, int Kmh, boolean Funciona) {
		this.Color = Color;
		this.Potencia = Potencia;
		this.Precio = Precio;
		this.Kmh = Kmh;
		this.Funciona = Funciona;
	}

	public carro() {
		Color = "Blanco";
		Potencia = 100;
		Precio = 1000;
		Kmh = 200;
		Funciona = true;
	}

	void show() {
		System.out.printf("su color es %s, su potencia es de %f, su precio es %d, su velocidad es %d y %s", Color,
				Potencia, Precio, Kmh, Funciona ? "si funciona" : "no funciona");
	}

}
