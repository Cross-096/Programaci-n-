package asserts;

public class ejemplo1 {

	public static void main(String[] args) {
		int n1 = -10;
		assert n1 >= 0: "el valor de n es negativo :P";
		int mitad1 = n1 / 2;
		System.out.printf("mitad de %d = %d%n", n1, mitad1);
	}

}
