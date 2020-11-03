package mf0227.uf2404.actividad1;

import java.util.Scanner;

/**
 * Crear un proyecto en modo consola que nos muestre un menú de 3 opciones
 * <ul>
 * <li>Calcular la letra del dni</li>
 * <li>Calcular medida de cm a pulgadas</li>
 * <li>Salir</li>
 * </ul>
 * Hacer que dicho menú se ejecute en bucle hasta que se pulse salir, y si el
 * usuario escoge cada una de las funciones, que permita introducir los datos
 * correspondientes por teclado para poder dar el resultado.
 * 
 * @author Veronica
 * @version 1.0
 *
 */
public class EjercicioB {

	// Constantes
	private static final String OPCION_1 = "1";
	private static final String OPCION_2 = "2";
	private static final String SALIR = "s";

	// Variables
	static Scanner sc = null;
	static String opcion = "";

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		boolean salir = false;

		do {

			// MENU principal
			System.out.println("*** MENÚ ***");

			pintarMenu();

			switch (opcion) {
			case OPCION_1:
				letraDni();
				break;
			case OPCION_2:
				deCmaPulgadas();
				break;
			case SALIR:
				salir = true;
				break;

			default:
				System.out.println("Tienes que elegir una opcion del menu: ");
				break;
			}

		} while (!salir);

		System.out.println("*** ADIOS ***");
		sc.close();

	}// main

	// METODOS
	private static void deCmaPulgadas() {

		double cm = 0;
		double pulgadas = 0;
		boolean isError = true;

		do {

			try {
				System.out.println("Escribe los cm: ");
				cm = Double.parseDouble(sc.nextLine());

				pulgadas = cm / 2.54;

				isError = false;

			} catch (Exception e) {
				System.out.println("Debes introducir un numero.");
			}

		} while (isError);

		System.out.println(cm + " son " + pulgadas);

	}

	private static void letraDni() {

		boolean isError = true;
		String dniNumeros = "";

		do {
			try {
				System.out.println("Dime los 8 numeros de tu dni:");
				dniNumeros = sc.nextLine();

				char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
						'V', 'H', 'L', 'C', 'K', 'E' };

				String dniCompleto;

				if (dniNumeros == null) {
					throw new Exception("No puede ser null");
				}

				if (dniNumeros.length() != 8) {
					throw new Exception("Los numeros de un dni son 8");
				}

				try {

					int resto = Integer.parseInt(dniNumeros) % 23;
					dniCompleto = dniNumeros + letras[resto];

				} catch (Exception e) {
					throw new Exception("No es un numero.");
				}

				System.out.println("Tu DNI completo es: " + dniCompleto);

				isError = false;

			} catch (Exception e) {
				System.out.println("Lo sentimos pero tu dni no es valido. ");
			}
		} while (isError);

	}

	private static void pintarMenu() {

		System.out.println(" 1.- Calcular la letra del DNI");
		System.out.println(" 2.- Calcular medida de cm a pulgadas");
		System.out.println(" S - Salir");

		System.out.println("\n Selecciona una opcion del menu:");
		// TODO gestionar errores
		opcion = sc.nextLine();

	}

}
