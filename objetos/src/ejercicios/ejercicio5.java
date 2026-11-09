package ejercicios;

public class ejercicio5 {

	public static void main(String[] args) {
		String fr = "El veloz murcielago";
		System.out.printf("el texto en mayusculas es [%s], el trozo entre las posiciones 3 y 8 es [%s], murcielago empieza en la posicion [%d], y cambiando veloz por rapido es [%s]%n", 
							fr.toUpperCase(), fr.substring(3, 8), fr.indexOf("murcielago"), fr.replace("veloz", "rapido"));
	}

}
