package practicasejemplos;

public class cuarto {

	public static void main(String[] args) {
		StringBuilder hola = new StringBuilder("Java");
		System.out.println(hola.append(" 17").insert(0, "<").append(">"));
		System.out.println(hola.length());
		String s1 = "12", s2 = "30";
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		System.out.println(Math.max(n1, n2));
		System.out.println(Math.abs(n1 - n2));
	}

}
