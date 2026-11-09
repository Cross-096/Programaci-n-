package ejercicios;

public class ejercicio11 {

	public static void main(String[] args) {
		String f = "Informe_Final_2026.PDF";
		String jiji = f.toLowerCase().replace("_", "-");
		System.out.println(jiji);
		System.out.println(jiji.substring(jiji.indexOf(".") + 1));
	}

}
