package ejercicios;

public class ejercicio3 {

	public static void main(String[] args) {
		String ciudad = "Sevilla";
		System.out.printf("el texto en mayusculas es %s, en minusculas es %s, su primera letra es %s y la ultima es %s%n",
							ciudad.toUpperCase(), ciudad.toLowerCase(), ciudad.charAt(0), ciudad.charAt(ciudad.length()-1));
	}

}
