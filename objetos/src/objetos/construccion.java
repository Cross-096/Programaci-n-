package objetos;

public class construccion {

	public static void main(String[] args) {
		/* 
		String a = "hola";
		String b = "hola";
		String c = new String("hola");
		
		System.out.println(a == c); 		 //no son el mismo objeto
		System.out.println(a.equals(c));	 //pero su contenido si es igual */
		
		String ContrasenaGuardada = "Clave123";
		String ContrasenaIntroducida = new String ("Clave123");
		System.out.println(ContrasenaGuardada == ContrasenaIntroducida);  	  //no son el mismo objeto
		System.out.println(ContrasenaGuardada.equals(ContrasenaIntroducida)); //pero su contenido si es igual
		
		
		
		
		
		
		
		
	}

}
