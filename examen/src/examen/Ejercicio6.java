package examen;

public class Ejercicio6 {

	public static void main(String[] args) {
		int [] array = {2, 4, 6, 8, 10, 12};
		int auxiliar = 0;
		for (int i = 0; i < array.length / 2; i++) {
			auxiliar = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = auxiliar;
		}
		for (int b : array) {
			System.out.print( b + " ");
		}
	}

}
