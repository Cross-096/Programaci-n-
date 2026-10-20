package arrays;

public class ejercicio5 {

	public static void main(String[] args) {
		int [] numeros = {2, -3, 4, -1, 6};
		for (int i = 0; i <= 4; i++) {
			if (numeros[i] < 0) {
				numeros[i] = 0; 
			}
		System.out.printf("%d ", numeros[i]);}
		
	}

}
