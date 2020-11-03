package mf0227.uf2404.actividad2;

public class Vehiculo implements IConducible {

	// Atributos
	private String color;
	private String matricula;

	private boolean estaArrancado;

	// Constructores
	public Vehiculo() {
		super();
		this.color = "";
		this.matricula = "";
	}

	public Vehiculo(String color, String matricula) {
		super();
		this.color = color;
		this.matricula = matricula;
	}

	// Getters y Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	// Metodos

	@Override
	public void arrancar() throws Exception {
		if (estaArrancado == false) {// si no esta arrancado arrancar
			estaArrancado = true;
			System.out.println("Acabas de arrancar el patinete.");
		} else {
			throw new Exception("Ya esta arrancado. No lo puedes volver a arrancar.");
		}

	}

	@Override
	public void apagar() {
		estaArrancado = false;
	}

	// toString
	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", matricula=" + matricula + "]";
	}

}
