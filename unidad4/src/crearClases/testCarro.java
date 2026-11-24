package crearClases;

public class testCarro {

	public static void main(String[] args) {
		carro tesla = new carro("Negro", 40.5, 10_000, 50, true);
		System.out.printf(
				"el color del tesla es %s, su potencia es de %.1f, su precio es %d$, su velocidad es %d y %s%n",
				tesla.Color, tesla.Potencia, tesla.Precio, tesla.Kmh, tesla.Funciona ? "si funciona" : "no funciona");
		carro ferrari = new carro("rojo", 70.8, 25_000, 90, false);
		System.out.printf(
				"el color del ferrari es %s, su potencia es de %.1f, su precio es %d$, su velocidad es %d y %s%n",
				ferrari.Color, ferrari.Potencia, ferrari.Precio, ferrari.Kmh,
				ferrari.Funciona ? "si funciona" : "no funciona");
		carro Audi = new carro();
		System.out.printf(
				"el color del Audi es %s, su potencia es de %.1f, su precio es %d$, su velocidad es %d y %s%n",
				Audi.Color, Audi.Potencia, Audi.Precio, Audi.Kmh, Audi.Funciona ? "si funciona" : "no funciona");

		Audi.show();
	}

}
