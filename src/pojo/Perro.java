package pojo;

public class Perro implements Comparable<Perro> {

	public static final String RAZA_PERRO = "cruce";

	// Atributos, deben ser siempre privados
	// la forma de manipular estos atributos es a traves de los getteres y settres
	///////////////////////////////////////
	private int id;
	private String nombre;
	private String raza;
	private float peso;
	private boolean isVacunado;
	private String historia;

	// Constructor
	///////////////////////////////////////
	public Perro() {
		super();
		this.id = 0; // falta poner en el toString();
		this.nombre = "Sin nombre";
		this.raza = RAZA_PERRO;
		this.peso = 0f;
		this.isVacunado = false;
		this.historia = "h";
	}

	// Otro constructor
	public Perro(String nombre) {
		this(); // llama la constructor por defecto (pulsar Contrl + Click)-->asistente Ó mirar
				// en Outline
		this.nombre = nombre;

	}

	// Otro constructor
	public Perro(String nombre, String raza, boolean isVacunado) {
		this(); // llama la constructor por defecto (pulsar Contrl + Click)-->asistente Ó mirar
				// en Outline
		this.nombre = nombre;
		this.raza = raza;
		this.isVacunado = isVacunado;

	}

	// Otro constructor
	public Perro(String nombre, String raza, float peso) {
		this(nombre);
		this.raza = raza;
		this.peso = peso;
	}

	// Otro constructor
	public Perro(int id, String nombre) {
		this(nombre);
		this.id = id;
	}

	// Getters y setters
	///////////////////////////////////////

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

	public String getRaza() {
		return raza;
	}

	/**
	 * 
	 * Comprobamos que haya una raza valida.<br>
	 * Si es null o vacio usamos la constante RAZA_PERRO.
	 * 
	 * @param raza
	 */
	public void setRaza(String raza) {
		if (raza != null) {

			if (raza.trim().isEmpty()) {
				raza = RAZA_PERRO;
			}

			this.raza = raza;

		} else {
			this.raza = RAZA_PERRO;
		}

	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		if (peso < 0) {
			this.peso = 0;
		} else {
			this.peso = peso;
		}
	}

	public boolean isVacunado() {
		return isVacunado;
	}

	public void setVacunado(boolean isVacunado) {
		this.isVacunado = isVacunado;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	// toString
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + ", isVacunado=" + isVacunado
				+ ", historia=" + historia + "]";
	}

	@Override
	public int compareTo(Perro o) {
		return (int) (this.peso - o.getPeso());
	}

}
