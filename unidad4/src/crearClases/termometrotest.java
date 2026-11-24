package crearClases;

public class termometrotest {

	public static void main(String[] args) {
		Termometro c1 = new Termometro(22.5);
		Termometro c2 = new Termometro(150);
		System.out.printf("%.2f%n", c1.getGrados());
		System.out.println(c2.getGrados());

	}

}
