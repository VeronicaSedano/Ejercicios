package variablesyoperadores;

/**
 * Realizar un programa que tenga 2 variables enteras, dividendo y divisor.
 * Meterle valores enteros y positivos. Realizar la operación división y mostrar
 * el resultado en pantalla Repetir el mismo código con estas variaciones:
 * entero y real, real y entero, real y real Por ultimo, intentar dividir en los
 * cuatro casos anteriores entre 0 y mostrar el resultado en pantalla
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		// entero / entero
		int a = 60;
		int b = 20;

		float division = a / b;

		System.out.println(division);

		// entero / real
		int c = 60;
		float d = (float) 20.45;

		float division2 = c / d;

		System.out.println(division2);

		// real /entero
		float f = (float) 20.45;
		int e = 60;

		float division3 = f / e;

		System.out.println(division3);

		// real /real
		float g = (float) 79.15;
		float h = (float) 35.45;

		float division4 = g / h;

		System.out.println(division4);

		//
		float i = (float) 79.15;

		System.out.println(i / 0);

	}

}
