package practica;

public class ejercicio19 {

	public static void main(String[] args) {
		int b = 1;
		for (int i = 1; i <= 10; i++) {
			b*= 3;
			System.out.print(b);
			if (i != 10) {
			System.out.print(", ");}
		}
	}

}
