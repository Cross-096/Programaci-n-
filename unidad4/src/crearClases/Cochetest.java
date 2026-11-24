package crearClases;

public class Cochetest {

	public static void main(String[] args) {
		Coche p1 = new Coche("Volkswagen", 100, "gasolina");
		p1.show();
		System.out.println(p1.estaParado()? "esta parado" : "no esta parado");
		System.out.println(p1.tiempoRecorrer(150));
		p1.repostar("electrico");
		p1.show();
		p1.frenar(150);
		System.out.println(p1.velocidad);
	}

}
