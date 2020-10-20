package pojo;

public class Persona {

	// Constantes
	public static final int MIN_EDAD = 0;
	public static final int MAX_EDAD = 129;

	// Atributos
	private String nombre;
	private int edad;

	// Constructor
	public Persona() {
		super();
		this.nombre = "";
		this.edad = MIN_EDAD;
	}

	public Persona(String nombre, int edad) {
		this();
		this.nombre = nombre;
		this.edad = edad;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws Exception {
		if (edad < MIN_EDAD || edad > MAX_EDAD) {
			throw new Exception(String.format("La edad esta fuera de rango %s %s", MIN_EDAD, MAX_EDAD));
			// throw new Exception("La edad esta fuera de rango");

		} else {
			this.edad = edad;
		}

	}

	// toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
