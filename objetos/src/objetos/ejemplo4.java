package objetos;

public class ejemplo4 {

	public static void main(String[] args) {
		String nombre = "    manolo   el del   bombo    ";
		String nombrebueno = "";
		String apellido1 = "Optimus    albertus     anus";
		String apellidobueno = "";
		String apellido2 = "  Elver     galarga      ";
		String apellido2bueno = "";
		
		
		
		String [] nombrepalabras = nombre.split(" ");
		String [] apellidopalabras = apellido1.split(" ");
		String [] apellido2palabras = apellido2.split(" ");
		for (String jiji : nombrepalabras) {
			if (jiji.length() >= 2) {
			nombrebueno = jiji;
			break;
		}
	}
		System.out.println(nombrebueno);
		
		
		for (String jiji : apellidopalabras) {
			if (jiji.length() >= 2) {
				apellidobueno = jiji;
				break;
			}
		}
		System.out.println(apellidobueno);
		
	}

}
