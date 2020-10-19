package excepciones;

import java.util.Scanner;

/**
 * Ejercicio 2: Realice un programa que nos solicite por teclado dos números, y
 * leerlos usando la clase Scanner mediante la función nextLine(). <br>
 * Transformar ambos strings a números enteros usando la siguiente sentencia
 * Integer.parseInt(numeroLeido). Agrupar el código entre un bloque try catch y
 * procesar para que no se produzca una interrupción y finalización del programa
 * si alguno de los números leídos no puede convertirse, retomando el control en
 * el punto del fallo, hasta que se solucione
 * 
 * @author Veronica
 * @version 1.0
 *
 */

public class Ejercicio2 {

	public static void main(String[] args) {

		boolean isError1 = true;
		boolean isError2 = true;
		int a = 0;
		int b = 0;

		Scanner sc = new Scanner(System.in);

		// Primer numero
		do {
			System.out.printf("Escribe el primer numero: ");
			try {
				// parseamos
				a = Integer.parseInt(sc.nextLine());
				isError1 = false;

			} catch (Exception e) {
				System.out.println("El primer numero tiene que ser un numero valido.");
			}

		} while (isError1);

		// Segundo numero
		do {
			System.out.printf("Escribe el segundo numero: ");
			try {
				// parseamos
				b = Integer.parseInt(sc.nextLine());
				isError2 = false;

			} catch (Exception e) {
				System.out.println("El segundo numero tiene que ser un numero valido.");
			}

		} while (isError2);

		System.out.println("La division es: " + (a / b));
		sc.close();

	}// main

}
