package ejercicios;

public class ejercicio6 {

	public static void main(String[] args) {
		String foto = "foto_playa.jpg";
		System.out.printf("el nombre de la foto sin la extension es [%s], tiene la extension jpg? [%b]%n", foto.substring(0, foto.indexOf(".")), foto.contains("jpg"));
	}

}
