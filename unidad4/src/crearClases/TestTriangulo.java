package crearClases;

public class TestTriangulo {

	public static void main(String[] args) {
		Triangulo hola = new Triangulo("Rojo", 20, 15);
		System.out.printf("el triangulo es de color %s, su base es de %d, su altura es %d%n",
				hola.color, hola.base, hola.altura);
		Triangulo adios = new Triangulo();
		System.out.printf("el triangulo es de color %s, su base es de %d, su altura es %d%n",
				adios.color, adios.base, adios.altura);
		Triangulo adioh = new Triangulo(11 , 15);
		System.out.printf("el triangulo es de color %s, su base es de %d, su altura es %d%n",
				adioh.color, adioh.base, adioh.altura);
		Triangulo[] trifuerza = {hola, adios, adioh};
		for (int i = 0; i < trifuerza.length; i++) {
			System.out.println(trifuerza[i].color + " " + trifuerza[i].base + "x" + trifuerza[i].altura);
		}
		
	}

}
