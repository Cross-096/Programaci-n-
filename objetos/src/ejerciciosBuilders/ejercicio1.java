package ejerciciosBuilders;

public class ejercicio1 {

	public static void main(String[] args) {
		StringBuilder lista = new StringBuilder();
		lista
			.append("Pan")
			.append(", ")
			.append("Leche")
			.append(", ")
			.append("Huevos");
		System.out.printf("%s y %d", lista, lista.length());
	}

}
