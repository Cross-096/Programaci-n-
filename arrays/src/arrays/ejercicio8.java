package arrays;

public class ejercicio8 {

	public static void main(String[] args) {
		int [] numeros = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for (int i = 0; i <= numeros.length - 1; i++) {
			if (numeros[i] % 2 == 0 ) {
				numeros[i] += 2;
			} else {
				numeros[i] -= 2;
			}
			System.out.printf("%d ", numeros[i]);
			
		}
	}

}
