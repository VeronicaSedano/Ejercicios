package variablesyoperadores;

/**
 * Ejercicio 2: Realizar una pequeña calculadora. Para ello se crearan 10
 * variables de distintos tipos numéricos. Una vez creadas dichas variables y
 * asignadas desde código valores (se recomienda valores entre -10 y 10)
 * realizar las siguientes operaciones: La suma de todos los números La resta de
 * todos los números La media de todos los números
 * 
 * 
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		float a = (float) 1;
		float b = (float) 2;
		float c = (float) 3;
		float d = (float) 4;
		float e = (float) 5;
		float f = (float) 6;
		float g = (float) 7;
		float h = (float) 8;
		float i = (float) 9;
		float j = (float) 10;

		float suma = a + b + c + d + e + f + g + h + i + j;
		float resta = a - b - c - d - e - f - g - h - i - j;
		float media = suma / 2;
		System.out.println("Esta es la suma:" + suma);
		System.out.println("Esta es la resta: " + resta);
		System.out.println("Esta es la media: " + media);

	}

}
