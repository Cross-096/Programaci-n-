package arrays;

public class ejercicio12 {

	public static void main(String[] args) {
		int[] numeros = { 12, 7, 25, 3, 18 };
		int lugar = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] != 3) {
				lugar++;
			} else {
				System.out.printf("el numero esta en la posicion %d%n", lugar);
			}
		}
	}

}
