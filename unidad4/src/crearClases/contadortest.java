package crearClases;

public class contadortest {

	public static void main(String[] args) {
		Contador c1 = new Contador();
		Contador c2 = new Contador(500, 42);
		Contador c3 = new Contador(3, "Modelo A");
		c2.setValue(42);
		Contador c4 = new Contador(c2);
		c2.setValue(99);

		Contador[] Contadores = { c1, c2, c3, c4 };
		for (Contador c : Contadores) {
			System.out.printf("Contador %s: %d de %d%n", c.getModel(), c.getValue(), c.getMaxValue());
		}
	}
}
