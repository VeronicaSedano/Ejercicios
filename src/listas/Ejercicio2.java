package listas;

import java.util.ArrayList;
import java.util.Scanner;

import pojo.Jugador;

/**
 * Crear una lista de jugadores de futbol. En dicha lista se guardaran objetos
 * de la clase Jugador, que tendrá los atributos nombre, de tipo Sting y dorsal
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

	static ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nombre;
		int dorsal;
		String respuesta;
		boolean esSi = true;
		Jugador jugador = new Jugador();

		// Pedir la primera vez
		System.out.println("Escribe el nombre del jugador: ");
		nombre = sc.nextLine();
		jugador.setNombre(nombre);
		listaJugadores.add(jugador);

		System.out.println("Escribe el dorsal del jugador: ");
		dorsal = Integer.parseInt(sc.nextLine());
		jugador.setDorsal(dorsal);
		listaJugadores.add(jugador);

		do {
			System.out.println("¿Quieres introducir otro jugador? ");
			respuesta = sc.nextLine();

			if (respuesta.equals("s")) {
				System.out.println("Escribe el nombre del jugador: ");
				nombre = sc.nextLine();
				jugador.setNombre(nombre);
				listaJugadores.add(jugador);

				System.out.println("Escribe el dorsal del jugador: ");
				dorsal = Integer.parseInt(sc.nextLine());
				jugador.setDorsal(dorsal);
				listaJugadores.add(jugador);

			} else if (respuesta.equals("n")) {
				esSi = false;

			} else {
				System.out.println("Debes introducir S o N");
				esSi = false;
			}

		} while (esSi);

		// mostrar arrayList
		for (Jugador j : listaJugadores) {
			System.out.println(j.getNombre() + " " + j.getDorsal());
		}

	} // main

}
