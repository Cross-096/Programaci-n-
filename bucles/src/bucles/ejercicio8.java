package bucles;

public class ejercicio8 {

	public static void main(String[] args) {
		int resultado = 0;
		for (int i = 5; i <= 100; i += 5) {
			resultado += i;
		}
		System.out.printf("la suma de los multiplos de 5 entre 1 y 100 es %d%n", resultado);
	}

}
