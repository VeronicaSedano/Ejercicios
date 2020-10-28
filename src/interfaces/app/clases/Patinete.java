package interfaces.app.clases;

import interfaces.app.interfaces.Vehiculo;

public class Patinete implements Vehiculo {

	// Atributos
	int velocidadActual = 0;
	boolean estaArrancado = true;

	String siEncendido = "";

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
			if ((velocidadActual - decrementoVel) <= 0) {
				velocidadActual = velocidadActual - decrementoVel;
				System.out.println("Acabas de frenar.");
			} else {
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
		} else {
			throw new Exception("Tienes que poner la velocidad actual a 0.");
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

}
