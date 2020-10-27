package listas;

import java.util.ArrayList;

/**
 * Crear una lista de nombres de alumnos, donde se guardaran con strings.<br>
 * Insertar diez nombres de alumnos en la lista <br>
 * Mostrar los diez nombres recorriendo la lista con un foreach
 * 
 * @author Veronica
 * @version 1.0
 *
 */

public class Ejercicio1 {

	static ArrayList<String> listaAlumnos = new ArrayList<String>();

	public static void main(String[] args) {

		listaAlumnos.add("Juan");
		listaAlumnos.add("Ana");
		listaAlumnos.add("Maria");
		listaAlumnos.add("Pedro");
		listaAlumnos.add("Luisa");
		listaAlumnos.add("Lucia");
		listaAlumnos.add("Pepe");
		listaAlumnos.add("Marcos");
		listaAlumnos.add("Andrea");
		listaAlumnos.add("Pepa");

		for (String nombre : listaAlumnos) {
			System.out.println(nombre);
		}

	}

}
