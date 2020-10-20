package apps;

import java.util.ArrayList;
import java.util.Scanner;

import pojo.Perro;

public class AppPerrera {

	// constantes
	public static final String OPCION_1 = "1";
	public static final String OPCION_2 = "2";
	public static final String OPCION_3 = "3";
	public static final String SALIR = "s";

	// variables globales para esta Clase
	static Scanner sc = null;
	static ArrayList<Perro> lista = new ArrayList<Perro>();
	static String opcion = ""; // opcion seleccionada en el menu por el usuario

	// MAIN
	public static void main(String[] args) {

		sc = new Scanner(System.in);

		// inicializar datos
		incializarDatos();

		boolean salir = false;

		do {

			// MENU
			System.out.println("*** APP  PERRERA ***");

			pintarMenu();

			switch (opcion) {
			case OPCION_1:
				listar();
				break;
			case OPCION_2:
				crearPerro();
				break;
			case OPCION_3:
				bajaPerro();
				break;
			case SALIR:
				salir = true;
				break;

			default:
				System.out.println("Tienes que elegir una opcion del menu: ");
				break;
			}

		} while (!salir);

		System.out.println("***********  ADIOS, nos vemos pronto   **************");
		sc.close();

	}// main

	// METODOS
	/**
	 * Dar de baja a un perro
	 */
	private static void bajaPerro() {

	}

	/**
	 * Crear un perro nuevo
	 */
	private static void crearPerro() {
		// Pedir datos
		System.out.println("Escribe el nombre del perro:");
		String nombre = sc.nextLine();

		System.out.println("Escribe la raza del perro:");
		String raza = sc.nextLine();

		// Añadir
		Perro p = new Perro();
		p.setNombre(nombre);
		p.setRaza(raza);

		lista.add(p);

	}

	/**
	 * Listar todos los perros que hay en el array
	 */
	private static void listar() {

		for (Perro perro : lista) {
			System.out.println("Nombre: " + perro.getNombre() + " // " + "Raza: " + perro.getRaza());
		}

	}

	/**
	 * Inicializar el ArrayList para simular que existen perros.<br>
	 * En un futuro nos conectaremos a una bbdd
	 */
	private static void incializarDatos() {

		lista.add(new Perro("Bubba"));
		lista.add(new Perro("Laika"));
		lista.add(new Perro("Rintintin"));
		lista.add(new Perro("goffy"));

	}

	/**
	 * Se encraga de pintar las pociones del menu.<br>
	 * Fijaros que no aparece {@code @return} porque no retorna nada {@code void}
	 * 
	 */
	private static void pintarMenu() {

		System.out.println("************************************");
		System.out.println(" 1.- Listar todos los perros");
		System.out.println(" 2.- Crear un perro");
		System.out.println(" 3.- Dar de baja un Perro");
		System.out.println(" etc etc ...");
		System.out.println(" ");
		System.out.println(" S - Salir");
		System.out.println("************************************");

		System.out.println("\n Selecciona una opcion del menu:");
		// TODO gestionar errores
		opcion = sc.nextLine();

	}

}
