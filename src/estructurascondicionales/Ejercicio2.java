package estructurascondicionales;

import java.util.Scanner;

/**
 * Ejercicio 2: Realiza un programa que pida un numero por consola.<br>
 * En caso de que el numero sea mayor que 50, o menor que 0, indicar que el
 * numero introducido no es valido
 * 
 * @author Veronica
 * @version 1.0
 */

public class Ejercicio2 {

	public static void main(String[] args) {

		int num1 = 0;
		Scanner sc = new Scanner(System.in);

		// Procedemos a capturar los valores.
		System.out.print("Ingrese un numero: ");
		num1 = Integer.parseInt(sc.nextLine()); // Esto solo nos devuelve un string: sc.nexLine(); por eso hay que
												// utilizar integer

		/*
		 * if (num1 > 50 || num1 < 0) {
		 * System.out.println("el numero introducido no es valido! el numero es: " +
		 * num1); System.out.print("Ingrese un numero: "); num1 =
		 * Integer.parseInt(sc.nextLine());
		 * 
		 * }
		 */

		int count = 0;
		// si el numero no esta entre 0 y 50 volver a repetir
		do {

			count += 1;

			System.out.println("el numero introducido no es valido! el numero es: " + num1);
			System.out.print("Ingrese un numero: ");
			num1 = Integer.parseInt(sc.nextLine());

			if (count > 2) {
				System.out.println("Ya has fallado" + count + "veces");
				break;
			}

		} while (num1 > 50 || num1 < 0);

		sc.close();

	} // main

}
