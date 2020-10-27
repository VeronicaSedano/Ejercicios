package pojo;

public class Jugador {

	// Atributos
	String nombre;
	int dorsal;

	// Constructor
	public Jugador() {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	// toString
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", dorsal=" + dorsal + "]";
	}

}
