package estructurascondicionales;

import java.util.Scanner;

/**
 * Ejercicio 3: Pedir por teclado al usuario que introduzca una distancia en
 * cm<br>
 * Una vez introducida, se solicitará que escoja a que unidad se van a
 * convertir, introduciendo la opción por teclado<br>
 * <ul>
 * <li>A convertir a metros</li>
 * <li>B: convertir a pulgadas</li>
 * <li>C: convertir a pies</li>
 * <li>D:convertir a yardas</li>
 * </ul>
 * 
 * 
 * @author Veronica
 * @version 1.0
 *
 */

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cm;
		String opcion;

		// Pedir cm por consola
		System.out.printf("Escribe una distancia en cm: ");
		cm = Integer.parseInt(sc.nextLine());

		System.out.println("Gracias! Los centimetros que has elegido son " + cm);

		// Pedir opcion por consola
		System.out.printf("Elige una opcion: \r\n" + " * A convertir a metros\r\n" + " * B: convertir a pulgadas\r\n"
				+ " * C: convertir a pies\r\n" + " * D:convertir a yardas\r\n");
		opcion = sc.nextLine(); // Ó si fuera una char --> sc.next().charAt(0);

		// Menu
		switch (opcion) {
		case "a":
			float opcionA = cm / 100;
			System.out.println("Tus " + cm + " son " + opcionA + " metros ");
			break;
		case "b":

		}

		sc.close();

	} // main

	// "a".equals(opcion)

	// opcion = leerTeclado.next().charAt(0);

	// !"a".equals(opcion)

}
