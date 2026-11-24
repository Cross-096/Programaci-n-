package crearClases;

public class Lavadora {
	private int id;
	private static int nextId = 1;
	private boolean encendida;
	private boolean puertaCerrada;
	private double carga;
	private double capacidad;
	private int detergente;
	private String modelo;
	private String marca;
	private boolean mantenimiento;

	public Lavadora(String modelo, String marca) {
		id = nextId++;
		encendida = false;
		this.modelo = modelo;
		this.marca = marca;
		puertaCerrada = false;
		carga = 0;
		capacidad = 8;
		detergente = 100;
		mantenimiento = false;
	}

	public void show() {
		System.out.printf("Lavadora (id = %d) %s, %s, de %.3fkg, %s %s, con carga de %.3fkg, con detergente %d%%, %s%n",
				id, marca, modelo, capacidad, encendida ? "encendida" : "apagada",
				puertaCerrada ? "con la puerta cerrada" : "con la puerta abierta", carga, detergente,
				mantenimiento ? "con mantenimiento" : "sin mantinimiento");
	}

	public void encender() {
		encendida = true;
	}

	public void apagar() {
		encendida = false;
	}

	public boolean estaEncendida() {
		return encendida;
	}

	public void abrirPuerta() {
		puertaCerrada = false;
	}

	public void cerrarPuerta() {
		puertaCerrada = true;
	}

	public boolean cargarRopa(double kg) {
		double nuevaCarga = carga + kg;
		if (kg < 0 || puertaCerrada || nuevaCarga > capacidad) {
			return false;
		} else {
			carga = nuevaCarga;
			return true;
		}
	}

	private boolean realizable(int gastoDetergente, int cargaMaxima) {
		boolean noRealizable = carga > cargaMaxima || detergente < gastoDetergente || !encendida || !puertaCerrada
				|| mantenimiento || carga == 0;
		if (noRealizable) {
			return false;
		} else {
			detergente -= gastoDetergente;
			carga = 0;
			return true;
		}
	}

	public boolean lavarDelicado() {
		return realizable(5, 3);
	}

	public boolean lavarIntensivo() {
		return realizable(20, 8);
	}

	public boolean lavarNormal() {
		return realizable(10, 8);
	}

	public void rellenardetergente() {
		detergente = detergente > 50 ? 100 : detergente + 50;
	}

	public boolean desactivarMantenimiento() {
		if (detergente > 15) {
			return true;
		} else {
			return false;
		}
	}

	public boolean estaEnMantenimiento() {
		return mantenimiento;
	}
}
