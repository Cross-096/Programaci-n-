package practica;

public class ejercicio23 {

	public static void main(String[] args) {
		int a = 5;
		for (int i = 0; i < a; i++) {
			for (int b = 0; b < a; b++) {
				if (i == 0 || i == a - 1 || b == 0 || b == a - 1) {
					System.out.print("*");
					} else {
					System.out.print(" ");
					}
			}
			System.out.println();
		}
	}

}
