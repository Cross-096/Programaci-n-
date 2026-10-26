package practica;

public class repaso {

	public static void main(String[] args) {
		int mes = 1;
		String respuesta = "";
		switch (mes) {

		case 1:
			respuesta = "Enero";
			break;
		case 2:
			respuesta = "Febrero";
			break;
		case 3:
			respuesta = "Marzo";
			break;
		case 4:
			respuesta = "Abril";
			break;
		case 5:
			respuesta = "Mayo";
			break;
		case 6:
			respuesta = "Junio";
			break;
		case 7:
			respuesta = "Julio";
			break;
		case 8:
			respuesta = "Agosto";
			break;
		case 9:
			respuesta = "Septiembre";
			break;
		case 10:
			respuesta = "Octubre";
			break;
		case 11:
			respuesta = "Noviembre";
			break;
		case 12:
			respuesta = "Diciembre";
			break;
		default:
			respuesta = "no es un mes";
			break;
		}
		System.out.printf("El valor es %s%n", respuesta);
	}

}
