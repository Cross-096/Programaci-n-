package practica;

public class ejercicio18 {

	public static void main(String[] args) {
		int A = 0;
		int C = 0;
		for (int B = 10; B <= 50; B++) {
			if (B % 10 == 0) {
				C += B;
				A++;
		}
		}
		System.out.printf("%.2f", (double) C / A);
	}
	

}
