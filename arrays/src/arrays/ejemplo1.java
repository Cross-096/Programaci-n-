package arrays;

public class ejemplo1 {

	public static void main(String[] args) {
		
		/*
		int [] numeros = {3, 2, 7};
		System.out.println("tamaño: " + numeros.length);
		System.out.println("segundo elemento: " + numeros[1]);
		System.out.println("ultimo elemento: " + numeros[numeros.length - 1]);
		
		numeros[0] *= 2;
		System.out.println("cambio de valor (0): " + numeros[0]); 
		 */
		
		
		/*
		 int [] numeros= {1, 2, 3, 4, 5, 6};
		 
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] *= 2;
			System.out.printf("el valor de los numeros es %d%n", numeros[i]);
		}
		*/
		int [] numeros4 = {1, 2, 3, 4};
		int [] numeros0 = {0, 0, 0, 0};
		for (int i = 0; i < numeros4.length; i++) {
			numeros0[i] = numeros4[i] * 2;
			System.out.printf("el valor de los numeros es %d%n", numeros0[i]);
		}
	}

}
