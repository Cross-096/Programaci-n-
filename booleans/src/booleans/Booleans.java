package booleans;

public class Booleans {
	
	public static void main(String[] args) {
		
		/*
		boolean x = true, y = false, z = true;
		
			System.out.printf("a) (X && Y) || (X && Z) => %b%n", (x && y) || (x && z)); 			//true
			System.out.printf("b) (X || !Y) && (!X || Z) => %b%n", (x || !y) && (!x || z)); 		//true
			System.out.printf("c) X || Y && Z => %b%n", x || y && z); 								//true
			System.out.printf("d) !(X || Y) && Z => %b%n", !(x || y) && z); 						//false
			System.out.printf("e) X || Y || X && !Z && !Y => %b%n", x || y || x && !z && !y); 		//true
			System.out.printf("f) !X || !Y || Z && X && !Y => %b%n", !x || !y || z && x && !y);		//true
		*/
		/*
		boolean w = false, x = true, y = true, z = false;
		 
		 	System.out.printf("a) W || Y && X && W || Z => %b%n", w || y && x && w || z);			//false
		 	System.out.printf("b) X && !Y && !X || !W && Y => %b%n", x && !y && !x || !w && y);		//true
		 	System.out.printf("c) !(W || !Y) && X || Z => %b%n", !(w || !y) && x || z);				//true
		 	System.out.printf("d) X && Y && W || Z || X => %b%n", x && y && w || z || x);			//true
		 	System.out.printf("e) Y || !(Y || Z && W) => %b%n", y || !(y || z && w));				//true
		 	System.out.printf("f) !X && Y && (!Z || !X) => %b%n", !x && y && (!z || !x));			//false
		 */
		
		boolean x = true, y = false;
		System.out.println("======================");
		System.out.println("Tabla de verdad de and");
		System.out.println("======================");
		System.out.printf("%b  && %b  = %b%n", x, x, x && x);
		System.out.printf("%b  && %b = %b%n", x, y, x && y);
		System.out.printf("%b && %b  = %b%n", y, x, y && x);
		System.out.printf("%b && %b = %b%n", y, y, y && y);
		System.out.println("======================");
		System.out.println("Tabla de verdad de or");
		System.out.println("======================");
		System.out.printf("%b  || %b  = %b%n", x, x, x || x);
		System.out.printf("%b  || %b = %b%n", x, y, x || y);
		System.out.printf("%b || %b  = %b%n", y, x, y || x);
		System.out.printf("%b || %b = %b%n", y, y, y || y);
		System.out.println("======================");
		System.out.println("Tabla de verdad de not");
		System.out.println("======================");
		System.out.printf("!%b  = %b%n", x, !x);
		System.out.printf("!%b = %b%n", y, !y);
		
		
		
		
		
		
		
		
	}
}
