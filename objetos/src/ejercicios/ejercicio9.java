package ejercicios;

public class ejercicio9 {

	public static void main(String[] args) {
		String u = "  https://www.ejemplo.es/inicio  ";
		String jiji = u.trim();
		System.out.println(jiji.substring(jiji.indexOf("www.") + 4, jiji.indexOf(".es")));
	}

}
