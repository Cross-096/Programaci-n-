package objetos;


public class ejemplo1 {

	public static void main(String[] args) {
		
		//========================declaracion_de_una_variable_de_tipo_String=======================//
		String saludo = "hola mundo";
		System.out.println("string: " + saludo);
		System.out.println("tamaño: " + saludo.length());
		System.out.println("mayusculas: " + saludo.toUpperCase());
		System.out.println("minusculas: " + saludo.toLowerCase());
		System.out.println("sin espacio en extremos: [" + saludo.trim() + "]");
		System.out.println("posicion 2: " + saludo.charAt(2));
		System.out.println("posicion de mundo: " + saludo.indexOf("mundo") );
		System.out.println("subcadena (2, 6): " + saludo.substring(2, 6));
		System.out.println("reemplaza: " + saludo.replace("mundo", "java"));
		System.out.println("¿contiene hola?: " + saludo.contains("hola"));
		System.out.println("¿es igual a hola?: " + saludo.equals("hola"));
		System.out.println("igual ignorando mayusculas: " + saludo.trim().equalsIgnoreCase("hola mundo"));
		for (int i = 0; i < saludo.length(); i++) {
			System.out.print(saludo.charAt(i) + " ");
		}
		System.out.println();
		
		for (int i = saludo.length() - 1; i >= 0; i--) {
			System.out.print(saludo.charAt(i) + " ");
		}
		System.out.println();
		
		//====================================array_con_strings====================================//
		
		String csv = "manzana,pera,platano";
		String[] frutas = csv.split(",");
		System.out.println("primera fruta: " + frutas[0]);
		System.out.println("numero de frutas: " + frutas.length);
		
		//=====================================otro_ejercicio=====================================//
		String nombre = "     Hola, me llamo Juan";
		System.out.print(nombre.trim().replace("Juan", "David").toUpperCase());
		
	}

}
