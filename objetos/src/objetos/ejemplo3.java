package objetos;

public class ejemplo3 {

	public static void main(String[] args) {
		String s = "Probando";
		if(s.length() >= 4) {
			char original = s.charAt(3);
			int distancia = 'A' - 'a';
			char transformado = 0;
			
			if (original >= 'a' && original <= 'z') {
				transformado = (char) (original + distancia);
				s = s.replace(original, transformado);
	}
			System.out.println(s);

		} else {
	System.out.println("longitud insuficiente");
		}
	}
	}