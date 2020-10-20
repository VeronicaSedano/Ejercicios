package pojo.ejercicios;

import java.util.ArrayList;

import pojo.Persona;

/**
 * Ejercicio 4: Crea una clase Persona con los atributos nombre y edad. En el
 * método setEdad lanzar una excepción si la edad introducida es menor que 0 o
 * mayor que 120. <br>
 * Realiza un programa que al comienzo cree una lista de personas haciendo uso
 * del constructor vacío, y lea los datos por teclado y los asigne a los objetos
 * creados. Solo introducirá las personas en la lista si están en el rango de
 * edad indicado, comprobándolo mediante el uso de excepciones
 * 
 * @author Veronica
 * @version 1.0
 *
 */

public class Ejercicio4 {

	public static void main(String[] args) {

		// Lo que aparece entre <> se llama CASTEAR y sirve para indicar el tipo de
		// Objetos que tenemos dentro del Array
		ArrayList<Persona> personas = new ArrayList<Persona>();

		try {

			Persona p1 = new Persona();
			p1.setNombre("pepe");
			p1.setEdad(56);

			personas.add(p1);

			Persona p2 = new Persona();
			p2.setNombre("MAtusalem");
			p2.setEdad(300); // CUIDADO lanza una Exception y va directo al Catch, no ejecuta las lineas de
								// abajo

			personas.add(p2);

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {

			// foreach para iterar sobre el ArrayList<Perona>
			for (Persona p : personas) {
				System.out.println(p);
			}

			// for de toda la vida
			/*
			 * for (int i = 0; i < personas.size(); i++) { System.out.println(
			 * personas.get(i)); }
			 */

		}

		// System.out.println(p); // llamamos al metodo .toString()
		// System.out.println(p.toString()); // tambien se puede escribir asi pero no
		// hace falta

		//

	}

}
