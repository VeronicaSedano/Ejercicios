package variablesyoperadores;

public class Ejercicio1 {

	public static void main(String[] args) {
		/**
		 * Ejercicio 1: Realizar un programa que cree una variable de cada uno de los
		 * tipos de datos simples que podemos encontrar en el lenguaje de programaci�n
		 * Java, asign�ndoles un valor Una vez creadas, se mostraran por pantalla los
		 * valores de cada una de ellas De manera adicional, se buscara por internet o
		 * otras fuentes, los valores m�ximos y m�nimos que pueden albergar
		 */

		/*
		 * String nombre = "veronica"; int animales = 1; //de -231 a 231 float
		 * sueldo=(float)12232.665; //32 bits double sueldo2 =(double)3984.88; //64 bits
		 * byte primero = -4; //-128 a 127 short segundo = 2000; //de -32.768 a 32.767
		 * long tercero = 200;// de -263 a 263 char genero = 'm'; boolean siono = true;
		 * 
		 * 
		 * System.out.println("Mi nombre: " + nombre); System.out.println(animales);
		 * System.out.println(sueldo); System.out.println(sueldo2);
		 * System.out.println(primero); System.out.println(segundo);
		 * System.out.println(tercero); System.out.println(genero);
		 * System.out.println(siono);
		 */
		//

		int temperaturaSemana[] = { 10, 16, 19, 20, 23, 21, 20 };
		String diasSemana[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
		float mediaSemana = 0;

		for (int i = 0; i < temperaturaSemana.length; i++) {

			// System.out.println(diasSemana[i] + " hace " + temperaturaSemana[i] + "
			// grados");
			System.out.printf("%s tiene %s grados \n ", diasSemana[i], temperaturaSemana[i]);
			mediaSemana += temperaturaSemana[i]; // mediaSemana = mediaSemana + mediaSemana se abrevia +=

		} // for

		System.out.println("Media de la semana es: " + (mediaSemana / temperaturaSemana.length));
		// System.out.printf("Media de la semana es %.2f ", mediaSemana);

	}

}
