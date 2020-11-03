package mf0227.uf2404.actividad2;

import java.util.ArrayList;
import java.util.Scanner;

public class ProbarCoches {

	// Constantes
	private static final String OP_SI = "s";
	private static final String OP_NO = "n";

	// Variables globales
	static ArrayList<Coche> listaCoches = new ArrayList<Coche>();
	static Scanner sc = null;
	static String respuesta;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		boolean salir = false;

		do {
			pintarMenu();

			// Gestionar respuestas menu
			switch (respuesta) {
			case OP_SI:
				crearCoche();
				break;
			case OP_NO:
				salir = true;
				break;
			default:
				System.out.println("Tienes que elegir una opcion del menu: ");
				break;
			}

		} while (!salir);

		System.out.println("--- ADIOS ---");
		sc.close();

		// Al decir que ya no quieres añadir mas jugadores se muestran todos
		listar();

	}// main

	// METODOS
	private static void listar() {

		System.out.println("*** LISTA COCHES ***");
		for (Coche co : listaCoches) {
			System.out.println(String.format(
					"Marca: %s / Modelo: %s / Matricula: %s / Color: %s / Potencia: %s CV / Cilindrada: %s cc",
					co.getMarca(), co.getModelo(), co.getMatricula(), co.getColor(), co.getPotencia(),
					co.getCilindrada()));
		}

	}

	private static void crearCoche() {
		boolean isError1 = true;
		boolean isError2 = true;

		Coche c = new Coche();

		// Pedir datos
		System.out.println("Escribe la marca del coche? ");
		String marca = sc.nextLine();
		c.setMarca(marca);

		System.out.println("Escribe el modelo del coche");
		String modelo = sc.nextLine();
		c.setModelo(modelo);

		System.out.println("Escribe la matricula del coche? ");
		String matricula = sc.nextLine();
		c.setMatricula(matricula);

		System.out.println("Escribe el color del coche? ");
		String color = sc.nextLine();
		c.setColor(color);

		do {
			try {
				System.out.println("Escribe la potencia (CV)");
				float potencia = Float.parseFloat(sc.nextLine());
				c.setPotencia(potencia);

				isError1 = false;

			} catch (NumberFormatException e) {
				System.out.println("Tienes que escribir un numero.");
			}

		} while (isError1);

		do {
			try {
				System.out.println("Escribe la cilindrada (cc)");
				float cilindrada = Float.parseFloat(sc.nextLine());
				c.setCilindrada(cilindrada);

				isError2 = false;

			} catch (NumberFormatException e) {
				System.out.println("Tienes que escribir un numero.");
			}

		} while (isError2);

		// Añadir
		listaCoches.add(c);

	}

	private static void pintarMenu() {
		System.out.println("---------- CREA UN COCHE ----------");
		System.out.println("¿Quieres introducir un coche? ");
		System.out.println("1º Escribe 's' si SI quieres");
		System.out.println("2º Escribe 'n' si NO quieres");
		System.out.println("-----------------------------------");
		respuesta = sc.nextLine();

	}

}
