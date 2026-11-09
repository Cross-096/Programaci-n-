package pruebasjsjsjsjs;

public class superbucle {

	public static void main(String[] args) {
		/*int altura = 10;
		int repetir = 5;
		for (int p = 0; p <= repetir; p++) {
		for (int b = 0; b <= altura * 2; b++){
		if(b <= altura){
		for(int a = 0; a <= b; a++){
		System.out.print(" ");
		} for(int c = (b * 2) - 1; c <= (altura * 2) - 1; c++){
		System.out.print("#");
		}System.out.println();
		} else if (b >= altura){
		for(int d = b; d <= (altura * 2); d++) {
		System.out.print(" ");}
		 for (int e = (altura * 2) - 1; e <= (b * 2) - 1 ; e++){
		System.out.print("#");}
		System.out.println();
		}
		}
		}*/
		int [] z = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int posicion= 0;
		int altura = 10;
		int repetir = 5;
		for (int p = 0; p <= repetir; p++) {
			for (int b = 0; b <= altura * 2; b++){
				if(b <= altura){
					for(int a = 0; a <= b; a++){
						System.out.print(" ");
					} for(int c = (b * 2) - 1; c <= (altura * 2) - 1; c++){
						System.out.print(z[posicion]);
						posicion++;
						if (posicion == z.length) {
							posicion = 0;
						}
					}System.out.println();
				} else if (b >= altura){
					for(int d = b; d <= (altura * 2); d++) {
						System.out.print(" ");}
						for (int e = (altura * 2) - 1; e <= (b * 2) - 1 ; e++){
							System.out.print(z[posicion]);
							posicion++;
							if (posicion == z.length) {
								posicion = 0;
						}
					}
				System.out.println();
			}
		}
	}

}
}
