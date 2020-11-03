package mf0227.uf2404.actividad2;

public class Coche extends Vehiculo {

	// Atributos
	private String marca;
	private String modelo;
	private float potencia;
	private float cilindrada;

	// Constructores
	public Coche() {
		super();
		this.marca = "";
		this.modelo = "";
		this.potencia = 0;
		this.cilindrada = 0;
	}

	public Coche(String color, String matricula, String marca, String modelo, float potencia, float cilindrada) {
		super(color, matricula);
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.cilindrada = cilindrada;

	}

	// Getters y Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}

	// toString
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", cilindrada=" + cilindrada
				+ "]";
	}

}
