package arrays;

public class portapapeles {

	public static void main(String[] args) {
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = (i + 1) * 5;
		}
		int ub = 0;
		for (int i : num) {
			if (i % 10 == 0) {
				ub++;
			}

		}
		int[] num2 = new int[ub];
		int b = 0;
		for (int i : num) {
			if (i % 10 == 0) {
				num2[b] = i;
				b++;
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
