package arrays;

public class ejercicio17 {

	public static void main(String[] args) {
		int [] pares = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22};
		int [] impares = {1, 3, 5, 7, 9, 11, 13, 15, 17};
		int [] suma = new int [pares.length + impares.length];
		int pos = 0;
		for (int i = 0;i < pares.length; i++) {
			suma[i] = pares[i];
			 
		}
		for (int i = pares.length;i < suma.length; i++) {
			suma[i] = impares[pos];
			pos++;
		}
		for(int s : suma) {
		System.out.print(s + " ");
		}
	}

}
