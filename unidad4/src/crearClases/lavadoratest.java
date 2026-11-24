package crearClases;

public class lavadoratest {

	public static void main(String[] args) {
		Lavadora c1 = new Lavadora("H2458", "LG");
		Lavadora c2 = new Lavadora("H2459", "LG");
		c1.show();
		System.out.println(c1.lavarDelicado());
		c2.show();
	}

}
