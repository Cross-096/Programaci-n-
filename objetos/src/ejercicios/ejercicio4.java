package ejercicios;

public class ejercicio4 {

	public static void main(String[] args) {
		String correo = "luis.perez@gmail.com";
		System.out.printf("tiene @? %b, de ser asi, su posicion es %d y el nombre de usuario (antes del @) es %s%n  ", 
							correo.contains("@"), correo.indexOf("@"), correo.substring(0, correo.indexOf("@")));
	}

}
