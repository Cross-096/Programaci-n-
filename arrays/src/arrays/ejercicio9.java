package arrays;

public class ejercicio9 {

	public static void main(String[] args) {
		int [] numeros = {1, 3, 5, 7};
		int [] Nnumeros = {0, 0, 0, 0};
		for (int i = 0; i <= 3; i++) {
			Nnumeros[i] = numeros[i] * 2;
			System.out.printf("%d ", Nnumeros[i]);
		}
	}

}
