package arrays;

public class ejemplo2 {

	public static void main(String[] args) {
		int [] numeros = {1, 2, 3, 4, 5};
		int suma = 0;
			for (int i = 0; i <= 4; i++) {
				suma += numeros[i];
			}
			System.out.printf("la suma es %d", suma);
	}

}
