package bucles;

public class ejercicio6 {

	public static void main(String[] args) {
		/*
		int resultado = 0;
		for (int suma = 1; suma <= 20; suma++) {
			resultado = resultado + suma;
			
			
		}
		System.out.printf("el resultado es %d", resultado); 
		*/
		
		//tambien se puede hacer esto
		
		int resultado = 0;
		int suma = 20;
		for (int i = 1; i <= suma; i++) {
			resultado = resultado + i;
		}
		System.out.printf("el resultado es %d", resultado);
		
	}

}
