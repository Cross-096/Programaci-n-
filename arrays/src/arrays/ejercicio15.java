package arrays;

public class ejercicio15 {

	public static void main(String[] args) {
		int [] num = {1, 2, 3, 4, 5};
		int ub = 0;
		for (int i = 0; i < num.length; i++) {
			ub++;
		}
		int [] num2 = new int [ub];
		for (int i = 0; i < num2.length; i++) {
			num2 [i]= num[ub - 1 - i];
		}
		for (int n : num2) {
			System.out.print(n + " ");
		}
		
	}

}
