package practica;

public class ejercicio17 {

	public static void main(String[] args) {
		int B = 0;
		for (int A = 15; A <= 85; A++) {
			if (A % 3 == 0 && A % 5 == 0) {
				B++;
			}
		}
		System.out.printf("Hay %d números entre 15 y 85 divisibles por 3 y por 5.%n", B);
	}

}
