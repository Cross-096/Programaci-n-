package examenPruba;

public class ejercicio2 {

	public static void main(String[] args) {
		int hasta = 30, suma = 0;
		for (int a = 1; a <= hasta; a++) {
			suma += a * a;
		}
		System.out.printf("la seuma de los cuadrados d los primeros 30 numeros naturales es %d", suma);
	}

}
