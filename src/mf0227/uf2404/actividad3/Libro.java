package mf0227.uf2404.actividad3;

public class Libro implements Comparable<Libro> {

	private int id;
	private String nombre;
	private int numPaginas;

	public Libro() {
		super();
		this.id = 0;
		this.nombre = "";
		this.numPaginas = 0;
	}

	public Libro(String nombre, int numPaginas) {
		this();
		this.nombre = nombre;
		this.numPaginas = numPaginas;
	}

	public Libro(int id, String nombre, int numPaginas) {
		this.id = id;
		this.nombre = nombre;
		this.numPaginas = numPaginas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre=" + nombre + ", numPaginas=" + numPaginas + "]";
	}

	@Override
	public int compareTo(Libro o) {
		// Si el resultado es positivo es mayor, si es negativo es menor y si es 0 es
		// igual.
		return this.nombre.compareTo(o.nombre);
	}

}
