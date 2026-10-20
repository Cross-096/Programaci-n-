package punto_1;

public class Punto1 {
	public static void main(String[] args) {
		/*Dado un precio ( double ) y un pago en efectivo ( double ), calcula el cambio, cuántos billetes
		de 10 € caben en él y cuántos euros y céntimos sueltos quedan. Usa división entera y módulo,
		sin bucles.*/
			double precio = 59.99, pago;
		
		pago = 60;
			double cambio = pago - precio;
			System.out.printf("el cambio es %.2f%n", cambio);
		
		//1. billetes de 10
			int billetes10 = (int) cambio / 10;
			System.out.printf("tienes %d billetes de 10 euros %n", billetes10);
		
		//2. Euros y centimos sueltos
			double DineroSuelto = cambio % 10;
			System.out.printf("tienes %.2f euros sueltos %n", DineroSuelto);
		
		
		
		
		
		
		
		
		
		
	}

}
