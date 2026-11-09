package Builders;

public class ejemplo1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hola");
		System.out.println(sb);
		sb.append(" mundo!");
		System.out.println(sb);
		
		String s = "hola";
		s = s + " mundo!";
		System.out.println(s);

	}

}
