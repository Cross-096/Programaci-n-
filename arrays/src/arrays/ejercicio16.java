package arrays;

public class ejercicio16 {

	public static void main(String[] args) {
		int [] numeros = {5, 4, 3, 2, 1};
		int b = numeros.length;
		for (int i = 0; i < b / 2; i++) {
			int temp = numeros[i];
			numeros[i] = numeros[b - 1 - i];
			numeros[b - 1 - i] = temp; 
			
		}
		for (int num : numeros) {
			System.out.print(num + " ");
		}
	}

}
