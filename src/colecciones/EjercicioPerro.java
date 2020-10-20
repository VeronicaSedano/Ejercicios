package colecciones;

import java.util.ArrayList;

import pojo.Perro;

public class EjercicioPerro {

	public static void main(String[] args) {

		// ArrayList
		ArrayList<Perro> perros = new ArrayList<Perro>();

		// Añadir perros
		Perro p = new Perro();
		p.setNombre("Laika");
		perros.add(p);

		p = new Perro();
		p.setNombre("Balto");
		perros.add(p);

		p = new Perro();
		p.setNombre("Hachiko");
		perros.add(p);

		p = new Perro();
		p.setNombre("Snoopy");
		perros.add(p);

		// insertar en una posicion
		p = new Perro();
		p.setNombre("Firulais");
		perros.add(1, p);

		// mostrar
		for (int i = 0; i < perros.size(); i++) {
			System.out.println(perros.get(i));
		}

	}

}
