package arrays;

public class ejemplo3 {

	public static void main(String[] args) {
		int [] numeros = {4, 7, 10, 3, 8, 6};
		int suma = 0;
		for (int i = 0; i <= 5; i++) {
			if (numeros[i] % 2 == 0) {
				suma++;
			}
		}
		System.out.printf("hay %d numeros pares", suma);
	}

}
