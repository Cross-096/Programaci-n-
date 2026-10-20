package arrays;

public class ejercicio13 {

	public static void main(String[] args) {
		String [] nombres = {"Ana", "Guillermo", "Luis", "Marta" };
		String Nlargo = nombres[0];
		for (int i = 0; i < nombres.length; i++) {
			if (Nlargo.length() < nombres[i].length()) {
				Nlargo = nombres[i];
			}
		}
		System.out.printf("el nombre mas largo es %s", Nlargo);
	}

}
