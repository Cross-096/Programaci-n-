package examen;

public class Ejercicio4 {

	public static void main(String[] args) {
		int [] array = {7, -2, -8, 5, -6, 3};
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				array[i] = 0;
			}
		}
		for (int b : array) {
			System.out.print(b + " ");
		}
	}

}
