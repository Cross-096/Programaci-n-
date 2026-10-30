package objetos;

public class ejemplo2 {

	public static void main(String[] args) {
		String correo = "ana.garcia@instituto.es";
		System.out.println(correo.toUpperCase());
		System.out.println(correo.contains("@"));
		System.out.println(correo.indexOf("@"));
		System.out.println(correo.substring(0, correo.indexOf("@")));
	}

}
