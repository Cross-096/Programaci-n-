package escaneres;

	import java.util.Scanner; 
	public class ejemplo1 {
		public static void main(String[] args) {

		 Scanner teclado = new Scanner(System.in);

	        System.out.print("¿Cómo te llamas? ");
	        String nombre = teclado.nextLine();

	        System.out.print("¿Cuántos años tienes? ");
	        int edad = teclado.nextInt();

	        System.out.println("Hola, " + nombre.toUpperCase() + ". El año que viene tendrás " + (edad + 1) + " años.");

	        teclado.close();
	        
	}

	}
