package excepciones;

import java.util.Scanner;

/**
 * Ejercicio 3: Realice un método que reciba como argumento un String y un
 * número y muestre la letra de la posición indicada. Llámelo pasando como
 * parámetro un String sin inicializar. Dicha llamada se encontrara dentro de un
 * bloque try catch, que en caso de producirse una excepción por un paso de
 * parámetros a null, no acabe con la ejecución del programa.<br>
 * Así mismo, se controlara también que si el numero pasado es mayor que el
 * tamaño del string, capturara el error y nos solicitara meter un numero
 * valido, indicándonos los valores en los que puede estar comprendido (para
 * este apartado se le pasa como string la cadena de texto “La lluvia en Sevilla
 * no es una maravilla”)
 * 
 * @author Veronica
 * @version 1.0
 *
 */

public class Ejercicio3 {

	public static char metodoLetraPosicion(String cadena, int posicion) throws Exception {

		if (cadena == null) {
			throw new Exception("No puede ser null.");
		}

		if (cadena.length() > posicion) {
			throw new Exception("El numero indicado es mayor que el tamaño de la cadena.");
		}

		char letra = cadena.charAt(posicion);

		return letra;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean isError = true;

		do {
			try {
				System.out.println("Escribe una cadena: ");
				String cad = sc.nextLine();

				System.out.println("Escribe una posicion:");
				int pos = Integer.parseInt(sc.nextLine());

				char letra = metodoLetraPosicion(cad, pos);
				System.out.println(
						"La letra que has elegido es: " + letra + ". Dicha letra esta en la posicion: " + pos + ".");

				isError = false;

			} catch (Exception e) {
				System.out.println("La cadena no es valida. " + e.getMessage());

			}
		} while (isError);

	}

}
