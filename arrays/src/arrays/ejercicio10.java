package arrays;

public class ejercicio10 {

	public static void main(String[] args) {
		int [] numeros = {3, 5, 7, 2, 8};
		int maximo = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maximo) {
				maximo = numeros[i];
			}
		}
		System.out.printf("el maximo es %d", maximo);
	}

}
