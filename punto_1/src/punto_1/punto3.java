package punto_1;

public class punto3 {
	public static void main(String[] args) {
		
		/*Dados tres lados de un triángulo ( double ), comprueba primero si forman un triángulo válido (la
			suma de dos lados cualesquiera debe ser mayor que el tercero). Si es válido, indica de qué tipo
			es: equilátero (los tres lados iguales), isósceles (dos lados iguales) o escaleno (los tres
			distintos).*/
		double ladoA = 10, ladoB = 6, ladoC = 5;
		boolean triangulo = (ladoA + ladoB > ladoC) &&
							(ladoA + ladoC > ladoB) &&
							(ladoB + ladoC > ladoA);
		if (triangulo) {
			
			
			if (ladoA == ladoB && ladoB == ladoC) {
				System.out.println("es un triangulo equilátero");
			} else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
				System.out.println("es un triangulo isóseles");
			}else {
				System.out.println("es un triangulo escaleno");
			}
		} else {
			System.out.println("no es un triangulo");
		}
		
		
		
		
		
		
		
	}

}
