package crearClases;

public class producto {
	private String nombre;
	private double precio;
	private int stock;
	private String categoria;
	private double descuento;
	private boolean disponible;

	public producto(String nombre, double precio, int stock, String categoria, double descuento) {
		this.nombre = nombre;
		this.precio = precio < 0 ? 0 : precio;
		this.stock = stock < 0 ? 0 : stock;
		this.categoria = categoria == null ? "general" : categoria;
		this.descuento = descuento < 0 ? 0 : descuento > 50 ? 50 : descuento;
		this.disponible = this.stock > 0;
	}

	public String getNombre() {
		return nombre;
	}

	public int getStock() {
		return stock;
	}

	public void setPrecio(double precio) {
		this.precio = precio < 0 ? 0 : precio;
	}

	public double precioFinal() {
		return precio * (1 - descuento / 100);
	}

	public boolean vender(int unidades) {
		if (unidades <= 0 || unidades > stock) {
			return false;
		}
		stock -= unidades;
		disponible = stock > 0;
		return true;
	}

	public void reponer(int unidades) {
		if (unidades > 0) {
			stock += unidades;
			disponible = stock > 0;
		}
	}

	public void show() {
		System.out.printf("%s | %.2f € (precio final %.2f €) | stock %d | %s | %s%n", nombre, precio, precioFinal(),
				stock, categoria, disponible ? "disponible" : "agotado");
	}

	public static producto masCaro(producto p1, producto p2) {
		return p1.precio > p2.precio ? p1 : p2;
	}

	public producto mayorPrecio(producto p) {
		return this.precio > p.precio ? this : p;
	}

	public static producto masCaro(producto[] productos) {
		producto productoMayor = productos[0];
		 for(producto hola : productos) {
			if (hola.precio > productoMayor.precio) {
				productoMayor = hola;
			}
		} return productoMayor;
	}

	public static void main() {
		producto[] productos = { new producto("Teclado", 24.9, 15, "periféricos", 10),
				new producto("Ratón", 12.5, 40, "periféricos", 0), new producto("Monitor", 189, 6, "pantallas", 5),
				new producto("Alfombrilla", 5, 100, "accesorios", 0) };

	}
}
