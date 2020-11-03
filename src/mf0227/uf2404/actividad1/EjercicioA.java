package mf0227.uf2404.actividad1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Realizar un programa en java que realice la siguiente función: Crear un array
 * de 5 notas que almacenara en formato double. <br>
 * Una vez creado dicho array se rellenaran dichos elementos leyéndolo desde el
 * teclado. Una vez creado el contenido, se calculara la media de las notas así
 * como se mostraran las notas más altas y más bajas de dicho array.
 * 
 * @author Veronica
 * @version 1.0
 *
 */
public class EjercicioA {

	static ArrayList<Double> notas = new ArrayList<Double>(5);// ArrayList
	static Scanner sc = null; // Scanner

	public static void main(String[] args) { // MAIN

		sc = new Scanner(System.in);

		pedirNotasPorPantalla();

		mediaNotas();

		notaMasAlta();

		notaMasBaja();

	}// main

	// METODOS
	/**
	 * Metodo que calcula la nota mas baja del array.
	 */
	private static void notaMasBaja() {
		double masBaja = 11;

		for (int i = 0; i < notas.size(); i++) {
			if (notas.get(i) < masBaja) {
				masBaja = notas.get(i);
			}
		}

		System.out.println("La nota mas baja es: " + masBaja);

	}

	/**
	 * Metodo que calcula la nota mas alta del array.
	 */
	private static void notaMasAlta() {

		double masAlta = 0;

		for (int i = 0; i < notas.size(); i++) {
			if (notas.get(i) > masAlta) {
				masAlta = notas.get(i);
			}
		}

		System.out.println("La nota mas alta es: " + masAlta);

	}

	/**
	 * Método que calcula la media de todas las notas que se han introducido por
	 * pantalla.
	 * 
	 */
	private static void mediaNotas() {

		double sumatorio = 0;

		for (int i = 0; i < notas.size(); i++) {// Recorro arrayList
			sumatorio += notas.get(i); // sumo todas las notas
		}

		System.out.println("La nota media es: " + sumatorio / notas.size());

	}

	/**
	 * Metodo que pide por pantalla las 5 notas que van a ir en el array.
	 */
	private static void pedirNotasPorPantalla() {

		boolean isError1 = true;
		boolean isError2 = true;
		boolean isError3 = true;
		boolean isError4 = true;
		boolean isError5 = true;

		// Pedir datos
		do {
			try {
				System.out.println("Escribe la primera nota:");
				double nota1 = Double.parseDouble(sc.nextLine());
				notas.add(nota1);
				isError1 = false;

			} catch (Exception e) {
				System.out.println("Tienes que escribir un numero.");
			}
		} while (isError1);

		do {
			try {
				System.out.println("Escribe la segunda nota:");
				double nota2 = Double.parseDouble(sc.nextLine());
				notas.add(nota2);
				isError2 = false;

			} catch (Exception e) {
				System.out.println("Tienes que escribir un numero.");
			}
		} while (isError2);

		do {
			try {
				System.out.println("Escribe la tercera nota:");
				double nota3 = Double.parseDouble(sc.nextLine());
				notas.add(nota3);
				isError3 = false;
			} catch (Exception e) {
				System.out.println("Tienes que escribir un numero.");
			}
		} while (isError3);

		do {
			try {
				System.out.println("Escribe la cuarta nota:");
				double nota4 = Double.parseDouble(sc.nextLine());
				notas.add(nota4);
				isError4 = false;
			} catch (Exception e) {
				System.out.println("Tienes que escribir un numero.");
			}
		} while (isError4);

		do {
			try {
				System.out.println("Escribe la quinta nota:");
				double nota5 = Double.parseDouble(sc.nextLine());
				notas.add(nota5);
				isError5 = false;

			} catch (Exception e) {
				System.out.println("Tienes que escribir un numero.");
			}
		} while (isError5);

	}

}
