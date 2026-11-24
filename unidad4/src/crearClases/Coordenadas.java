package crearClases;

public class Coordenadas {

	private int x, y;
	public Coordenadas (int x, int y) {
		setX(x);
		setY(y);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x < 0? 0 : x > 100? 100 : x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y < 0? 0 : y > 100? 100 : y;
	}
	public void mostrar() {
		System.out.printf("(%d, %d)", x, y);
	}
	
}
