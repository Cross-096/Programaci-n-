package excepciones;

public class ejercicio2 {

	public static void main(String[] args) {
		int[] ejemplo = { 1, 2, 3, 4, 5 };
		int[] otro = new int[ejemplo.length];
		for (int i = 0; i < ejemplo.length; i++) {
			otro[i] = ejemplo[i];
		}
		for (int o : otro) {
			System.out.print(o + " ");
		}

	}

}
