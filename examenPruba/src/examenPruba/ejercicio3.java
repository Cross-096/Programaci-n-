package examenPruba;

public class ejercicio3 {

	public static void main(String[] args) {
		int hasta = 60;
		for(int a = 1; a <= hasta; a++) {
			if (a % 4 == 0 && a % 12 != 0) {
				System.out.printf("%d ", a);
			}
		}

	}

}
