package estructurascondicionales;

public class Ejercicio1 {

	public static void main(String[] args) {
		/**
		 * Ejercicio 1: Realizar un programa que realice la siguiente funcionalidad Se
		 * crearan 5 variables enteras con los nombres a, b, c, d y e con los valores 6,
		 * 8, 0, 8 y 9 Comparar las variables a y c, indicar por consola cual es mayor
		 * Indicar cual de las variables es la que tiene menor valor y la de mayor valor
		 * Compara las variables b y d y comprueba si son iguales Comprobar si se puede
		 * realizar la divisi�n de a/c si no se puede realizar indicarlo, en caso
		 * contrario realizar la divisi�n
		 */

		int a = 6;
		int b = 8;
		int c = 0;
		int d = 8;
		int e = 9;

		// Comparar las variables a y c, indicar por consola cual es mayor
		if (a > c) {
			System.out.println("a es mayor que c.");
		} else {
			System.out.println("c es mayor que a.");
		}

		// Indicar cual de las variables es la que tiene menor valor y la de mayor valor

		// La mayor
		if (a > b && a > c && a > d && a > e) {
			System.out.println("La a es la mayor");
		} else if (b > a && b > c && b > d && b > e) {
			System.out.println("La b es la mayor");
		} else if (c > a && c > b && c > d && c > e) {
			System.out.println("La c es la mayor");
		} else if (d > a && d > c && d > b && d > e) {
			System.out.println("La d es la mayor");
		} else if (e > a && e > c && e > b && e > d) {
			System.out.println("La e es la mayor");
		}

		// La menor
		if (a < b && a < c && a < d && a < e) {
			System.out.println("La a es la mayor");
		} else if (b < a && b < c && b < d && b < e) {
			System.out.println("La b es la mayor");
		} else if (c < a && c < b && c < d && c < e) {
			System.out.println("La c es la mayor");
		} else if (d < a && d < c && d < b && d < e) {
			System.out.println("La d es la mayor");
		} else if (e < a && e < c && e < b && e < d) {
			System.out.println("La e es la mayor");
		}

		// Compara las variables b y d y comprueba si son iguales

		if (b == d) {
			System.out.println("La b y la d si que son iguales");
		} else {
			System.out.println("La b y la d no que son iguales");
		}

		// Comprobar si se puede realizar la divisi�n de a/c

		float division = (float) a / 0;

		System.out.println(division);

		// OTRA FORMA
		int a1 = 6;
		int b1 = 8;
		int c1 = 0;
		int d1 = 8;
		int e1 = 9;

		int max = 0;
		int min = 10;

		int[] arrNumeros = { a1, b1, c1, d1, e1 };

		// caul es el mayor a o c

		if (a1 > c1) {

			System.out.println("el numero " + a1 + " es mayor a " + c1);

		} else {

			System.out.println("el numero " + c1 + " es mayor a " + a1);

		}

		// numero mas alto

		for (int i = 0; i < arrNumeros.length; i++) {

			if (max < arrNumeros[i]) {

				max = arrNumeros[i];

			}

		}

		System.out.println(max);

		// numero mas bajo

		for (int i = 0; i < arrNumeros.length; i++) {

			if (min > arrNumeros[i]) {

				min = arrNumeros[i];

			}

		}
		System.out.println(min);

		// comprobar si b y d son iguales

		if (b == d) {

			System.out.println("Los numeros son iguales");

		} else {

			System.out.println("Los numeros no son iguales");
		}

	}

}
