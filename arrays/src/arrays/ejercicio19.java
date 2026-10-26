package arrays;

public class ejercicio19 {

	public static void main(String[] args) {
		int [] array = {12, 45, 7, 45, 30, 9};
		int mayor = 0;
		int mayor2 = 0;
		for (int corre : array) {
			if (mayor < corre) {
				mayor = corre;
			} 
			if (mayor2 < corre  && corre != mayor) {
				mayor2 = corre;
			};
		}
		System.out.printf("el numero mayor es %d y el segundo mayor es %d%n", mayor, mayor2);
	}

}
