package ejerciciosBuilders;

public class ejercicio2 {

	public static void main(String[] args) {
		StringBuilder compra = new StringBuilder("Pan");
		compra		
			.append(", Leche")
			.insert(0, "Compra: ")
			.append(".");	
		System.out.printf("la lista es %s y su longitud es %d%n", compra, compra.length());
		}

}
