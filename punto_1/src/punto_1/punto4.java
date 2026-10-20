package punto_1;

public class punto4 {
	public static void main(String[] args) {
		
		/*Dada una nota ( double ), calcula su letra (A ≥ 9, B ≥ 7, C ≥ 5, D en otro caso) con if /
		else-if . A continuación, con un switch clásico sobre esa letra, imprime el comentario
		correspondiente (Sobresaliente / Notable / Suficiente / Insuficiente) usando
		System.out.printf .*/
		int nota = 10;
		char calificacion;
		
		
		if (nota >= 9) {
			calificacion = 'A';
		} else if (nota >= 7) {
			calificacion = 'B';
		} else if (nota >= 5) {
			calificacion = 'B';
		} else {
			calificacion = 'D';
		}
		
		switch (calificacion) {
		case 'A':
			System.out.println("tu nota es un sobresaliente");
			break;
		case 'B':
			System.out.println("tu nota es un notable");
			break;
		case 'C':
			System.out.println("tu nota es un suficiente");
			break;
		case 'D':
			System.out.println("tu nota es un insuficiente");
			break;
		}
		
		
		
	}
}
