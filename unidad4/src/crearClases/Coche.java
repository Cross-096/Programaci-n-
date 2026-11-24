package crearClases;

public class Coche {
	String marca;
	int velocidad;
	String combustible;
	String[] combustibles = { "gasolina", "diesel", "electrico" };

	public Coche(String marca, int velocidad, String combustible) {
		this.marca = marca;
		this.velocidad = velocidad;
		this.combustible = "gasolina";
		for (String combustibless : combustibles) {
			if (combustibless.equalsIgnoreCase(combustible)) {
				this.combustible = combustible;
			}
		}
	}

	public Coche(String marca, String combustible) {
		this(marca, 0, combustible);
	}

	public Coche() {
		marca = "generico";
		velocidad = 0;
		combustible = "gasolina";
	}

	public Coche(Coche p) {
		this.marca = p.marca;
		this.velocidad = p.velocidad;
		this.combustible = p.combustible;
	}

	public void show() {
		System.out.printf("El coche %s va a una velocidad %d y utiliza %s%n", marca, velocidad, combustible);
	}

	public boolean estaParado() {
		if (velocidad == 0) {
			return true;
		} else {
			return false;
		}
	}

	public double tiempoRecorrer(int km) {
		if (velocidad != 0) {
			return (double) km / (double) velocidad;
		} else {
			return -1;
		}
	}

	public void acelerar(int n) {
		velocidad += n; // velocidad = velocidad + n;
	}

	public void frenar(int n) {
		if ((velocidad - n) >= 0) {
			velocidad -= n;
		} else {
			velocidad = 0;
		}
	}

	public void repostar(String combustible) {
		for (String combustibless : combustibles) {
			if (combustibless.equalsIgnoreCase(combustible)) {
				this.combustible = combustible;
				break;
			}
		}
	}
}
