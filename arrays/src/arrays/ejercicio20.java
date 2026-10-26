package arrays;

public class ejercicio20 {

	public static void main(String[] args) {
		int [] numeros= {1, 4, 7, 4, 1};
		boolean capicua = true;
		for (int i = 0; i < numeros.length / 2; i++) {
			if (numeros[i] != numeros[numeros.length-1-i]) {
				capicua = false;
			}
		}
		System.out.println(capicua);
	}

}
