package arrays;

public class ejercicio21 {

	public static void main(String[] args) {
		int[] numeros = { 3, 1, 3, 2, 1, 3 };
		for (int i = 0; i < numeros.length; i++) {
			int valor = numeros[i];
			boolean nuevo = true;
			for (int b = 0; b < i; b++) {
				if (valor == numeros[b]) {
					nuevo = false;
				}
			}
			if (nuevo) {
				int veces = 0;
				for (int numero : numeros) {
					if (numero == valor) {
						veces++;
					}
				}
				System.out.printf("valor %d, veces: %d%n", valor, veces);
			}
		}
	}

}
