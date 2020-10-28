package listas;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Random;

import pojo.Carta;

/**
 * Crear una lista que contenga las cuarenta cartas de una baraja. <br>
 * Para crear dicha lista se creara una clase de tipo carta, que tendrá un
 * número entero para el valor de la carta, así como un string con el palo de la
 * baraja (copas, espadas, oros, bastos). <br>
 * Crear la baraja con las cartas ordenadas por palos, y luego por números.
 * Barajar dicha baraja y mostrar las cartas.
 * 
 * @author Veronica
 * @version 1.0
 *
 */

public class Ejercicio4 {

	private static String nombreCarta = "";

	private static final String CARTA_AS = "as";
	private static final int CARTA_VALOR_AS = 1;
	private static final String CARTA_SOTA = "sota";
	private static final int CARTA_VALOR_SOTA = 8;
	private static final String CARTA_CABALLO = "caballo";
	private static final int CARTA_VALOR_CABALLO = 9;
	private static final String CARTA_REY = "rey";
	private static final int CARTA_VALOR_REY = 10;

	private static int NUM_CARTAS = 10;
	private static final String PALOS[] = { "Oros", "Copas", "Bastos", "Espadas" };
	private static ArrayList<Carta> listaCartas = new ArrayList<Carta>();

	public static void main(String[] args) {

		crearBaraja();

		for (Carta carta : listaCartas) {
			pintarCarta(carta);
		}

		barajear();
	}

	/**
	 * Mostrar por consola la Carta
	 * 
	 * @param c
	 */
	private static void pintarCarta(Carta carta) {
		switch (carta.getValor()) {
		case CARTA_VALOR_AS: {
			nombreCarta = CARTA_AS;
			break;
		}
		case CARTA_VALOR_SOTA: {
			nombreCarta = CARTA_SOTA;
			break;
		}
		case CARTA_VALOR_CABALLO: {
			nombreCarta = CARTA_CABALLO;
			break;
		}
		case CARTA_VALOR_REY: {
			nombreCarta = CARTA_REY;
			break;
		}
		default:
			nombreCarta = String.valueOf(carta.getValor());
		}

		System.out.printf("%s de %s\n", nombreCarta, carta.getPalo());
	}

	// TODO que haga random bien sin repetir cartas
	private static void barajear() {

		System.out.printf("\n *********BARAJAMOS********** \n");
		Random rnd = new Random();
		// Para desordenar la baraja
		for (int i = 0; i < listaCartas.size(); i++) {
			int azar = rnd.nextInt(listaCartas.size());
			Carta c = listaCartas.remove(azar);
			listaCartas.add(c);
		}
		for (Carta carta : listaCartas) {
			pintarCarta(carta);
		}

		// Otra forma
		// Collections.shuffle(listaCartas); //Para desordenar la lista de cartas

		// Como estaba antes
		/*
		 * for (Carta carta : listaCartas) { int azar = rnd.nextInt(listaCartas.size());
		 * carta = listaCartas.get(azar); pintarCarta(carta); }
		 */

	}

	private static void crearBaraja() {

		for (int i = 0; i < PALOS.length; i++) {
			for (int j = 0; j < NUM_CARTAS; j++) {
				Carta c = new Carta(j + 1, PALOS[i]);
				listaCartas.add(c);
			}
		}
	}// crearBaraja

}
