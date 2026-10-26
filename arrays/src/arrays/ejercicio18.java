package arrays;

public class ejercicio18 {

	public static void main(String[] args) {
		int [] valores = {7, 8, 9, 10}; 
		int [] veces = {1, 2, 3, 1};
		int repite = 0;
		for (int vez : veces) {
			repite += vez;
		}
		
		int [] nuevo = new int [repite];
		int pos = 0;
		for(int i = 0; i < veces.length; i++) {
			for(int b = 0; b < veces[i]; b++) {
				nuevo[pos] = valores[i];
				pos++;
			}
		}
			for(int nuevos : nuevo) {
				System.out.print(nuevos + " ");
			}
		}
		}
		

