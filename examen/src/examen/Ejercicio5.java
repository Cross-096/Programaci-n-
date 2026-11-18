package examen;

public class Ejercicio5 {

	public static void main(String[] args) {
		int [] array = {14, 3, 29, 8, 17};
		int mayor = 0;
		for (int i = 0; i < array.length; i++) {
			if (mayor < array[i]) {
				mayor = array[i];
			}
		}
		System.out.print("El máximo del array es el " + mayor + ".");
	}

}
