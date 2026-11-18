package examen;

public class cuadrado {

	public static void main(String[] args) {
		int altura = 5;
		for (int i = 0; i <= altura; i++) {
			for (int b = 0; b <= altura; b++) {
				if (i == 0 || i == altura || b == 0 || b == altura) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
