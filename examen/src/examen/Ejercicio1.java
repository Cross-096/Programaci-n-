package examen;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Primero creo 3 variables, una sera el numero desde donde empiezo
		 * (numeroDesde), la otra el numero hasta el que voy a llegar (numeroHasta) y la
		 * ultima es la cantidad de decremento que va a tener i (la variable dentro del
		 * bucle) en cada vuelta (numeroDe), el bucle basicamente usa la ya dicha
		 * variable i, le da el mismo valor que numeroDesde, se va a repetir siempre que
		 * i sea mayor o igual a numeroHasta y cada vez que se repita el bucle se le va
		 * a restar el valor de numeroDe (en este caso 5), por ultimo cada vez que el
		 * bucle se ejecute va a mostrar el valor de i
		 */
		int numeroDesde = 120; //desde donde empieza
		int numeroHasta = 80; //hasta donde llega
		int numeroDe = 5;
		for (int i = numeroDesde; i >= numeroHasta; i -= numeroDe) {
			System.out.println(i);
		}
	}

}
