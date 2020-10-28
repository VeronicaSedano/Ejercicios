package listas;

import java.util.ArrayList;
import java.util.Scanner;

import pojo.Jugador;

/**
 * Crear una lista de jugadores de futbol. En dicha lista se guardaran objetos
 * de la clase Jugador, que tendrá los atributos nombre, de tipo String y dorsal
 * de tipo int. <br>
 * Solicitar los datos de los jugadores por teclado, y una vez introducido el
 * primero, se insertara en la lista y se preguntara si se desea introducir otro
 * más, para lo cual el usuario escribirá S o N. <br>
 * En caso afirmativo se volverá a pedir otro más, hasta que el usuario escriba
 * N
 * 
 * @author Veronica
 * @version 1.0
 *
 */

public class Ejercicio2 {

	private static final String OP_SI = "s";
	private static final String OP_NO = "n";

	static ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
	static Scanner sc = null;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		// Crear primer jugador
		crearJugador();

		boolean salir = false;

		do {
			// Dibujar menu
			System.out.println("---------------------------------");
			System.out.println("¿Quieres introducir otro jugador? ");
			System.out.println("1º Escribe 's' si SI quieres");
			System.out.println("2º Escribe 'n' si NO quieres");
			System.out.println("---------------------------------");
			String respuesta = sc.nextLine();

			// Gestionar respuestas menu
			switch (respuesta) {
			case OP_SI:
				crearJugador();
				break;
			case OP_NO:
				salir = true;
				break;
			default:
				System.out.println("Tienes que elegir una opcion del menu: ");
				break;
			}

		} while (!salir);

		System.out.println("***********  ADIOS, nos vemos pronto   **************");
		sc.close();

		// Al decir que ya no quieres añadir mas jugadores se muestran todos
		listar();

	} // main

	private static void listar() {

		System.out.println("*** LISTA JUGADORES ***");
		for (Jugador j : listaJugadores) {
			System.out.println(String.format("Nombre: %s y Dorsal: %s", j.getNombre(), j.getDorsal()));
		}

	}

	public static void crearJugador() {

		// Pedir datos
		System.out.println("Escribe el nombre del jugador: ");
		String nombre = sc.nextLine();

		System.out.println("Escribe el dorsal del jugador: ");
		int dorsal = Integer.parseInt(sc.nextLine());

		// Añadir
		Jugador jugador = new Jugador();
		jugador.setNombre(nombre);
		jugador.setDorsal(dorsal);

		listaJugadores.add(jugador);

	}

}
