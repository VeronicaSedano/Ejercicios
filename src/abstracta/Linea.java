package abstracta;

public class Linea extends ObjetoGrafico {

	int longitud;

	/**
	 * Implementamos el metodo que el padre a declarado abstract
	 */
	@Override
	void dibujar() {
		System.out.println("dibujamos una linea de longitud " + longitud);
	}

}