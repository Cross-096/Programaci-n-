package excepciones;

public class ejemplo {

	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("hola");
	}

}
