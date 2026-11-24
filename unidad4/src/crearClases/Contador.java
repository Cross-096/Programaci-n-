package crearClases;

public class Contador {
	private int value;
	private String model;
	private int maxValue;

	public Contador(int maxValue, String model) {
		this.value = 0;
		this.model = model;
		this.maxValue = maxValue < 10 ? 10 : maxValue;
	}

	public Contador(int maxValue, int value) {
		this.maxValue = maxValue;
		this.value = value;
	}

	public Contador(int maxValue) {
		this(maxValue, "N-COUNTER");
	}

	public Contador() {
		this(100_000, "N-COUNTER");
	}

	public Contador(Contador otro) {
		this(otro.maxValue, otro.model);
		this.value = otro.value;
	}

	public void show() {
		System.out.printf("Contador Visitas: %d de %d%n", value, maxValue);
	}

	public boolean increment() {
		boolean incrementable = (value != maxValue);
		if (incrementable) {
			value++;
		}
		return incrementable;

	}

	public boolean increment(int cantidad) {
		if (cantidad <= 0) {
			return false;
		}
		boolean incrementable = value + cantidad <= maxValue;
		if (incrementable) {
			value += cantidad;
		} else {
			value = maxValue;
		}
		return incrementable;
	}

	public boolean reset() {
		boolean reseteable = value == maxValue;
		if (reseteable) {
			value = 0;
		}
		return reseteable;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		if (value >= 1) {
			this.value = value;
		}
	}

	public String getModel() {
		return model;
	}

	public int getMaxValue() {
		return maxValue;
	}
	

}
