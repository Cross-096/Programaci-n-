package wrappers;

public class ejemplo1 {

	public static void main(String[] args) {
		Integer edad = 250;
		Integer edad2 = 250;
		System.out.println(edad);
		System.out.println(edad.equals(edad));
		System.out.println(edad == edad2);
		System.out.println(edad.compareTo(edad2));
		System.out.println(Integer.MAX_VALUE); 
		
		/* int x = 1500000000;
		int y = 1500000000;
		long suma = (long) x + y;
		if (suma > Integer.MAX_VALUE || suma < Integer.MIN_VALUE) {
			System.out.println("el numero es muy grande");
		} else {
			System.out.println(x + y); 
		}*/
			
	}

}
