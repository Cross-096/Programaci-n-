package arrays;


public class ejercicio14 {

	public static void main(String[] args) {
		int [] num = new int [10];
		for (int i = 0; i < num.length; i++) {
			num[i] = (i + 1) * 5;
		}
		int ub1 = 0;
		for (int m : num) {
			if (m % 10 == 0) {
				ub1++;
				}
			}
		int [] num2 = new int [ub1];
		int ub2 = 0;
		for (int m : num) {
			if (m % 10 == 0) {
				num2[ub2] = m;
				ub2++;
			}
		}
		for (int m : num) {
			System.out.print(m + " ");
		}
		System.out.println();
		for (int m : num2) {
			System.out.print(m + " ");
		}
	}

}
