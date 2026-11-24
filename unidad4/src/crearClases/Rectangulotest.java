package crearClases;

public class Rectangulotest {

	public static void main(String[] args) {
		Rectandulo p1 = new Rectandulo(4, 2, "cyan");
		p1.pintar("rojo");
		System.out.println(p1.color);
		p1.show();
		System.out.println(p1.area());
		p1.duplicar();
		p1.show();
		System.out.println(p1.area());
		p1.agrandar(3);
		p1.show();
		Rectandulo p2 = new Rectandulo(p1);
		p2.show();
	}

}
