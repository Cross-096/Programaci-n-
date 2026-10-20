package arrays;

public class ejercicio4 {

	public static void main(String[] args) {
		double suma = 0;
		double[] numeros = {6.5, 8.0, 4.5, 9.0, 7.0};
		for (double numero : numeros) {
			suma += numero;
			
		}
		System.out.printf("la media es %.2f", suma / numeros.length);
	}

}
