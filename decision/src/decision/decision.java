package decision;

public class decision {
	public static void main(String[] args) { 
		/*
	
		int num = 10;
		String trocito;
		
		if (num < -1000000) {
		trocito = "muy negativo";
		
		} else if (num < 0){
			
		trocito = "negativo";
		
		} else if (num < 1000000) {
			
		trocito = "positivo";
		} else {
			
			trocito = "muy positivo";
		}
		 System.out.printf("el numero %d es %s.%n", num, trocito);
		*/
		
		int num = 30;
		if (num % 2 == 0) {
			System.out.printf("%d es par %n", num);
		} else {
			System.out.printf("%d es impar %n", num);
		}
		
		if (num > 0) {
			System.out.printf("%d es positivo %n", num);
		}
		
		if (num % 5 == 0) {
			System.out.printf("%d es divisible entre 5 %n", num);
		} else {
			System.out.printf("%d no es divisible entre 5 %n", num);
		}
		
		if ((num % 2 == 0) && (num > 0) && (num % 5 == 0)) {
			System.out.println("todas las condiciones se cumplen");
		} else {
			System.out.println("no todas las condiciones se cumplen");
		}
		
		
		
	}

}
