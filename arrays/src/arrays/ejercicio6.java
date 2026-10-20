package arrays;

public class ejercicio6 {

	public static void main(String[] args) {
		int [] numeros = {1, 101, 201, 301, 401, 501, 601, 701, 801, 901};
		for (int i = numeros.length - 1; i>= 0; i--) {
			if (i == 0) {
				System.out.printf("%d", numeros[i]);
			} else {
				System.out.printf("%d-", numeros[i]);
			}
		}
	}

}
