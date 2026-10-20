package clase;

public class clase {

	public static void main(String[] args) {
		int i = 1, j = 1, k = 1;
		i = ++j;
		System.out.printf("a) i = ++j => i = %d, j = %d, k = %d%n", i, j, k);
			i = 1; j = 1; k = 1;
		i = k++;
		System.out.printf("b) i = k++ => i = %d, j = %d, k = %d%n", i, j, k);		
			i = 1; j = 1; k = 1;
		i = k + ++j;
		System.out.printf("c) i = k + ++j => i = %d, j = %d, k = %d%n", i, j, k);
			i = 1; j = 1; k = 1;
		i = i + j++;
		System.out.printf("d) i = i + j++ => i = %d, j = %d, k = %d%n", i, j, k);
			i = 1; j = 1; k = 1;
		i = j + ++k;
		System.out.printf("e) i = j + ++k => i = %d, j = %d, k = %d%n", i, j, k);
			i = 1; j = 1; k = 1;
		i = ++j + k++;
		System.out.printf("f) i = ++j + k++ => i = %d, j = %d, k = %d%n", i, j, k);
			i = 1; j = 1; k = 1;
		j = k-- + --i;
		System.out.printf("g) j = k-- + --i => i = %d, j = %d, k = %d%n", i, j, k);
			i = 1; j = 1; k = 1;
		i = k + 1 + ++j;
		System.out.printf("h) i = k + 1 + ++j => i = %d, j = %d, k = %d%n", i, j, k);
			i = 1; j = 1; k = 1;
		i = ++i + --j + k--;
		System.out.printf("i) i = ++i + --j + k-- => i = %d, j = %d, k = %d%n", i, j, k);
			i = 1; j = 1; k = 1;
		k = j-- + ++k;
		System.out.printf("j) k = j-- + ++k => i = %d, j = %d, k = %d%n", i, j, k);

		

	}

}
