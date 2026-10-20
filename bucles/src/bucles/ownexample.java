package bucles;

public class ownexample {

	public static void main(String[] args) {
		int base = 15;
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
		for (int b = alt - 1; b >= 1; b--) {
				for (int h = 1; h <= alt - b; h++) {
					System.out.print(" ");
				}
				for (int m = 1; m <= (2 * b - 1); m++) {
				System.out.print("*");
				}
				System.out.println();
	}
	}
}


