package ejercicios;

public class ejercicio10 {

	public static void main(String[] args) {
		String cod = "  ab-1234-xy  ";
		System.out.println(cod.trim().toUpperCase().replace("-", ""));
		System.out.println(cod.substring(cod.indexOf("1234"), cod.indexOf("-xy")));
	}

}
