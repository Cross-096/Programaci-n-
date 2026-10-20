package punto_1;

public class punto5 {
	public static void main(String[] args) {
		
		/*Dados dos números ( double ) y un operador ( char : + , - , * , / ), calcula el resultado con un
		switch . Si el operador es / y el segundo número es 0, evita el error y muestra "División por
		cero" en lugar del resultado (ayúdate del operador ternario).*/
		double numero1 = 4, numero2 = 6;
		char operator = '/';
		switch (operator) {
		case '+': 
			System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, numero1 + numero2);
			break;
		case '-': 
			System.out.printf("%.2f - %.2f = %.2f%n", numero1, numero2, numero1 - numero2);
			break;
		case '/':
			String Dividir = (numero2 ==0)? "Division por cero": String.format("%.2f", numero1 / numero2);
			System.out.printf("%.2f / %.2f = %s%n", numero1, numero2, Dividir);
			break;
		case '*': 
			System.out.printf("%.2f * %.2f = %.2f%n", numero1, numero2, numero1 * numero2);
			break;
		
		
		}
		
		
		
		
		
		
	}
}
