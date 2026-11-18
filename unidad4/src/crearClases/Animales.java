package crearClases;

public class Animales {
	int precio;
	String descripcion;
	int cantidad;
	String especie;
	boolean oferta;
	boolean ayuda;

	public Animales(int precio, String descripcion, int cantidad, String especie, boolean oferta, boolean ayuda) {
		this.precio = precio > 0 ? precio : 1;
		this.descripcion = descripcion.length() > 0 ? descripcion : "no descripcion";
		this.cantidad = cantidad;
		this.especie = especie;
		this.oferta = oferta;
		this.ayuda = ayuda;
	}

	public Animales(int precio, String descripcion, int cantidad, String especie) {
		this(precio, descripcion, cantidad, especie, false, false);
	}

	public Animales(int precio, int cantidad, String especie) {
		this(precio, "no descripcion", cantidad, especie, false, false);
	}

}
