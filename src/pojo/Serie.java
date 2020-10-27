package pojo;

/**
 * Una serie de TV consta de los siguientes atributos:
 * 
 * <ul>
 * <li>Nombre</li>
 * <li>numTemporadas</li>
 * <li>duracion (minutos)</li>
 * <li>plataforma(netflix,plex,hbo,moviestar,...)</li>
 * </ul>
 * 
 * El constructor debere pasarse siempre el nombre de forma obligatoria.. El
 * resto de campos se iniciaalzan a 0 y la plataforma especificar "internet"
 * 
 * @author Verónica
 * @version 1.0
 *
 */
public class Serie {

	// Atributos
	private String nombre;
	private int numTemporadas;
	private float duracion;
	private String plataforma;

	// Constructor
	public Serie(String nombre) {
		super();
		this.nombre = nombre;
		this.numTemporadas = 0;
		this.duracion = 0;
		this.plataforma = "internet";
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public float getDuracion() {
		return duracion;
	}

	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	// toString()
	@Override
	public String toString() {
		return "Serie [nombre=" + nombre + ", numTemporadas=" + numTemporadas + ", duracion=" + duracion
				+ ", plataforma=" + plataforma + "]";
	}

}