package examen;

public class Ejercicio2 {

	public static void main(String[] args) {
		int desde = 1;
		int hasta = 80;
		for (int i = desde; i <= hasta; i++) {
			if (i % 5 == 0 && i % 15 != 0) {
				System.out.printf("%d ", i);
			}
		}
	}

}
