package excepciones;

import java.util.Scanner;

/**
 * Realice un programa que nos solicite los numeros del dni y nos calcule la
 * letra. <br>
 * Usar el metodo de la Clase Utilidades. <br>
 * Tenemos que capturar la excepcion que nos lanza la función
 * <b>calcularLetraDni</b>.
 * 
 * @author Veronica
 * @version 1.0
 *
 */
public class EjercicioThrows {

	public static void main(String[] args) {

		boolean isError = true;
		Scanner sc = new Scanner(System.in);
		String dniNumeros = "";

		do {
			try {
				System.out.println("Dime los 8 numeros de tu dni:");
				dniNumeros = sc.nextLine();
				String dniCompleto = Utilidades.calcularLetraDni(dniNumeros);
				System.out.println("Tu DNI completo es: " + dniCompleto);
				isError = false;

			} catch (Exception e) {
				System.out.println(" Lo sentimos pero tu dni no es valido. " + e.getMessage());
			}
		} while (isError);

		sc.close();
	}

}
