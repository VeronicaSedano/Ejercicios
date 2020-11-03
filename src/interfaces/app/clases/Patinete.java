package interfaces.app.clases;

import interfaces.app.interfaces.Vehiculo;

public class Patinete implements Vehiculo, AutoCloseable {

	// Atributos
	public int velocidadActual;
	boolean estaArrancado;

	String siEncendido = "";

	// Constructores
	public Patinete() {
		super();
		this.velocidadActual = 0;
		this.estaArrancado = false;
	}

	public Patinete(int velocidadActual, boolean estaArrancado) {
		super();
		this.velocidadActual = velocidadActual;
		this.estaArrancado = estaArrancado;
	}

	// Getters y Setters
	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public boolean isEstaArrancado() {
		return estaArrancado;
	}

	public void setEstaArrancado(boolean estaArrancado) {
		this.estaArrancado = estaArrancado;
	}

	// Metodos implementados
	/**
	 * Pondrá el atributo estaArrancado a true. Debe estar apagado para poder
	 * arrancarse
	 */
	@Override
	public void arrancar() throws Exception {
		if (estaArrancado == false) {// si no esta arrancado arrancar
			estaArrancado = true;
			System.out.println("Acabas de arrancar el patinete.");
		} else {
			throw new Exception("Ya esta arrancado. No lo puedes volver a arrancar.");
		}

	}// arrancar()

	/**
	 * Incrementara la velocidad actual con el valor que se le pasa por parámetro
	 * sin sobrepasar el limite máximo de velocidad. Solo acelerara si el patinete
	 * esta encendido.
	 * 
	 * @param incrementoVel
	 */
	@Override
	public void acelerar(int incrementoVel) throws Exception {
		if (estaArrancado == true) {
			if (velocidadActual + incrementoVel <= VEL_MAX_PATINETE) {
				velocidadActual += incrementoVel;
				System.out.println("Acabas de acelerar.");
			} else {
				this.setVelocidadActual(VEL_MAX_PATINETE);
				throw new Exception("Sobrepasas la velocidad maxima permitida.");
			}

		} else {
			System.out.println("Tiene que esta arrancado para poder acelerar.");
		}

	}// acelerar()

	/**
	 * Decrementara la velocidad actual con el valor que se le pasa por parámetro
	 * sin llegar a bajar de 0. Solo frenara si el patinete esta encendido.
	 * 
	 * @param decrementoVel
	 */
	@Override
	public void frenar(int decrementoVel) throws Exception {
		if (estaArrancado == true) {
			if ((velocidadActual - decrementoVel) >= 0) {
				velocidadActual = velocidadActual - decrementoVel;
				System.out.println("Acabas de frenar.");
			} else {
				this.setVelocidadActual(0);
				throw new Exception("La velocidad no puede bajar de 0.");

			}

		} else {
			System.out.println("Tiene que esta arrancado para poder frenar.");
		}

	}// frenar()

	/**
	 * Pondrá el atributo estaArrancado a false, solo si la velocidadActual es 0.
	 */
	@Override
	public void apagar() throws Exception {
		if (velocidadActual == 0) {
			estaArrancado = false;
			System.out.println("Acabas de apagar el motor.");
		} else {
			throw new Exception("No puedes apagar el motor. Tienes que poner la velocidad actual a 0.");
		}

	}// apagar()

	// toString
	/**
	 * “Soy un patinete, estoy (encendido/apagado) y mi velocidad es de
	 * (velocidadActual) Km/h”
	 */
	@Override
	public String toString() {
		if (estaArrancado == true) {
			siEncendido = "encendido";
		}

		if (estaArrancado == false) {
			siEncendido = "apagado";
		}

		return "Soy un patinete, estoy " + siEncendido + " y mi velocidad actual es de " + velocidadActual + " km/h.";
	}

	@Override
	public void close() throws Exception {
		System.out.println("Cerramos el patinete");
		apagar();

	}

}
