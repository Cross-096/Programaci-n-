package crearClases;

public class Termometro {
	private double grados;

	public void setGrados(double grados) {
		this.grados = grados < -50 ? -50 : grados > 60 ? 60 : grados;
	}

	public Termometro(double grados) {
		setGrados(grados);
	}

	public double getGrados() {
		return grados;
	}
}
