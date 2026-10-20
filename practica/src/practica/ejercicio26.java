package practica;

public class ejercicio26 {

	public static void main(String[] args) {
		int base = 10;
		int alt = (base / 2) - 1;
		for (int i = 1; i <= alt; i++) {
			for (int f = 1; f <= alt - i; f++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
			System.out.print("*");
		}
			
			System.out.println();
	}
		
	}
}
	
