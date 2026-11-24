package practicasejemplos;

public class tercero {

	public static void main(String[] args) {
		String texto = "  Aprender java es divertido  ";
		System.out.println(texto.trim().toUpperCase());
		System.out.println(texto.indexOf("java"));
		System.out.println(texto.replace("divertido", "facil").trim());
	}

}
