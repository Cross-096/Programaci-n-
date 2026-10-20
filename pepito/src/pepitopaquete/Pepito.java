package pepitopaquete;

public class Pepito {
	
	
	public static void main(String[] args) {
		
		int a = 8, b = 3, c = -5;
		
		System.out.printf("Hola, me llamo pepito %n");
		
		System.out.printf("1) a + b + c = %d%n"										, (a + b + c));
		System.out.printf("2) 2 * b + 3 * (a - c) = %d%n" 							, (2 * b + 3 * (a - c)));
		System.out.printf("3) a / b = %d%n" 										, (a / b));
		System.out.printf("4) a %% b = %d%n" 										, (a % b));
		System.out.printf("5) a / c = %d%n" 										, (a / b));
		System.out.printf("6) a %% c = %d%n" 										, (a % c));
		System.out.printf("7) a * b / c = %d%n" 									, (a * b / c));
		System.out.printf("8) a * (b / c) = %d%n" 									, (a * (b / c)));
		System.out.printf("9) (a * c) %% b = %d%n" 									, ((a * c) % b));
		System.out.printf("10) a * (c %% b) = %d%n" 								, (a * (c % b)));
		System.out.printf("11) (3 * a - 2 * b) %% (2 * a - c) = %d%n" 				, ((3 * a - 2 * b) % (2 * a - c)));
		System.out.printf("12) 2 * ( a / 5 + (4 - b * 3)) %% (a + c - 2) = %d%n"  	, (2 * ( a / 5 + (4 - b * 3)) % (a + c - 2)));
		System.out.printf("13) (a - 3 * b) %% (c + 2 * a) / (a - c) = %d%n" 		, ((a - 3 * b) % (c + 2 * a) / (a - c)));
		System.out.printf("14) a - b - c * 2 = %d%n" 								, (a - b - c * 2));

	}
	
}
