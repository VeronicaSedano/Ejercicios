package herencia;

import java.util.ArrayList;
import java.util.Scanner;

import pojo.Electrodomestico;
import pojo.TelevisionPlana;

/**
 * Realizar las siguientes jerarquías de herencia: tendremos una clase padre que
 * se llamara Electrodoméstico. Dicha clase contara con los atributos nombre y
 * precio. Se realizaran todos los constructores, métodos get y set
 * necesarios<br>
 * Una vez creada dicha clase, se creara una serie de clases hijas. La primera
 * será la clase televisor. Dicha clase contara con el atributo pulgadas, así
 * como con todos los constructores y métodos necesarios para rellenar sus
 * atributos, incluidos los del padre<br>
 * También se creara una clase televisionPlana, que heredara de televisión,
 * tendrá el atributo string tipo de pantalla ( tft, plasma,..) y constructores,
 * métodos get y set para rellenar los datos de los objetos que se creen,
 * incluyendo todos los atributos de los objetos de las clases padres de las que
 * heredan<br>
 * Una vez creado esta jerarquía de herencia, realizar un programa que nos pida
 * insertar televisiones planas dentro de un array de electrodomésticos. Dicho
 * array constara de 5 electodomesticos, pero lo rellenaremos con objetos de
 * tipo televisiónPlana.
 * 
 * @author Veronica
 * @version 1.0
 *
 */

public class Ejercicio1 {

	final static int CANT_ELECTRODOMESTICOS = 3;

	static ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList<Electrodomestico>();

	public static void main(String[] args) {

		// Cargar array
		Scanner sc = new Scanner(System.in);

		String nombre = "";
		float precio = 0;
		int pulgadas = 0;
		String tipoPantalla = "";
		boolean salir = false;

		// Pedir 5 veces los datos de televisiones
		for (int i = 0; i < CANT_ELECTRODOMESTICOS; i++) {

			TelevisionPlana tv = new TelevisionPlana(nombre, precio, pulgadas, tipoPantalla);

			System.out.println("Escribe el nombre");
			tv.setNombre(sc.nextLine());

			System.out.println("Escribe el precio");
			tv.setPrecio(Float.parseFloat(sc.nextLine()));

			System.out.println("Escribe las pulgadas");
			tv.setPulgadas(Integer.parseInt(sc.nextLine()));

			System.out.println("Escribe el tipo de pantalla");
			tv.setTipoPantalla(sc.nextLine());

			listaElectrodomesticos.add(tv);

		}

		// Visualizar array
		for (Electrodomestico elec : listaElectrodomesticos) {
			System.out.println(elec.toString());
		}

	} // main

}
