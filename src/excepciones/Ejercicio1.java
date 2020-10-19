package excepciones;

import java.util.Scanner;

/**
 * Ejercicio 1: Implemente un programa que lea un número ‘a’ y otro número ‘b’ y
 * luego calcule “a/b”. Pruebe a introducir b=0 y ver que hace el programa con
 * la división por cero.<br>
 * Pruebe a introducir b=”Carlos” para ver cómo se comporta el programa. Añada
 * excepciones para recoger estas excepciones y avisar del problema al usuario
 * 
 * @author Veronica
 * @version 1.0
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;

		Scanner sc = new Scanner(System.in);

		try {
			System.out.printf("Escribe el primer numero: ");
			a = Integer.parseInt(sc.nextLine());

			System.out.printf("Escribe el segundo numero: ");
			b = Integer.parseInt(sc.nextLine());

			System.out.println("La division es: " + (a / b));

		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir entre cero");

		} catch (NumberFormatException e) {
			System.out.println("No es un numero");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Ha sutgido un error");
		}

		sc.close();

	}// main

}
