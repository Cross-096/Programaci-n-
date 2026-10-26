package practica;

public class ejemploClaseExcepciones {

	public static void main(String[] args) {
		int caso = 3;
		switch (caso) {
		case 1:
			
			try {
				byte j = 1;
				j = (byte)(j / j);
			} catch (Exception e) {
				System.out.print("A");
			} finally {
				System.out.print("B");
			}
			break;
		case 2:
			
			try {
				int [] numeros = {};
				System.out.println(numeros[0]);
			} catch (Exception e) {
				System.out.print("A");
			} finally {
				System.out.print("B");
			}
			break;
	case 3:
			
			try {
				int i = 1;
				i = (i / 0);
			} catch (Exception e) {
				System.out.print("A");
			} finally {
				System.out.print("B");
			}
			break;
	case 4:
		
		try {
			int i = 1;
			i = i / 2;
		} finally {
			System.out.print("B");
		}
		break;
		
		
		
		
		}
	}

}
