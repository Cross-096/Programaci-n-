package punto_1;

public class Punto2 {
	
	public static void main(String[] args) {
		
		/*Dadas las variables edad ( int ), esSocio y vaConAdulto ( boolean ), decide con una sola
		expresión lógica si la persona puede entrar a una sala: mayor de 18 años, o mayor de 14 si es
		socia y va acompañada de un adulto. Usa el operador ternario para construir el mensaje final
		("Acceso permitido" / "Acceso denegado").*/
		
		int edad = 14;
		boolean vaConAdulto = false;
		boolean esSocio = true;
			boolean PuedeEntrar = (edad >= 18) || (edad >= 14 && vaConAdulto && esSocio);
		System.out.printf("acceso %s%n", PuedeEntrar? "permitido" : "denegado");
		
		
		
		
		
	}

}
