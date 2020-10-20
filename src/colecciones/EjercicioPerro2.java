package colecciones;

import java.util.ArrayList;

import pojo.Perro;

public class EjercicioPerro2 {

	public static void main(String[] args) {
		ArrayList<Perro> lista = new ArrayList<Perro>();

		lista.add(new Perro("Bubba"));
		lista.add(new Perro("Laika"));
		lista.add(new Perro("Rintintin"));
		lista.add(new Perro("goffy"));
		lista.add(new Perro("hachiko"));
		lista.add(new Perro("freddy"));

		// INSERTAR en una posicion
		Perro p = new Perro();
		p.setNombre("Firulais");
		lista.add(1, p);

		// REMPLAZAR
		// vamos a recorrer el array para buscar a goffy y remplazarlo por firulais
		for (int i = 0; i < lista.size(); i++) {
			Perro iteracion = lista.get(i);

			if ("Goffy".equals(iteracion.getNombre())) {
				lista.remove(i);
				break;

			}

		}

		// ELIMINAR por indice
		lista.remove(5);

		// ELIMINAR por objeto
		// vamos a recorrer el array para buscar a "Rintintin" y borrarlo
		for (int i = 0; i < lista.size(); i++) {

			Perro pIteracion = lista.get(i);

			if ("Rintintin".equals(pIteracion.getNombre())) {
				lista.remove(i);
				break; // salir del for
			}

		} // for

		// MOSTRAR
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

	}

}
