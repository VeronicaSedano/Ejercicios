package mf0227.uf2404.actividad3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ImplementacionLibroDao implements LibroDao {

	// atributo con el que vamos a trabajar(hashMap)
	private HashMap<Integer, Libro> hmLibros;
	private int indice = 0;
	private static ImplementacionLibroDao INSTANCE = null;

	private ImplementacionLibroDao() {
		super();

		hmLibros = new HashMap<Integer, Libro>();

		hmLibros.put(1, new Libro(1, "La comunidad del anillo", 500));
		hmLibros.put(2, new Libro(2, "Las dos torres", 300));
		hmLibros.put(3, new Libro(3, "El retorno del rey", 400));
		indice = 4;

	}

	// implementara patron singleton
	public static synchronized ImplementacionLibroDao getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ImplementacionLibroDao();
		}

		return INSTANCE;
	}

	@Override
	public List<Libro> getAll() {
		ArrayList<Libro> libros = new ArrayList<>(hmLibros.values());
		Collections.sort(libros);
		return libros;

	}

	@Override
	public Libro getById(int id) {
		// TODO getById
		return null;
	}

	@Override
	public boolean delete(int id) {
		boolean resultado = true;

		// Si el id introducido no esxiste en el HashMap error.
		if (hmLibros.containsKey(id) == false) {
			// System.out.println("**El id que has introducido no existe.");
			resultado = false;
		} else { // si SÍ existe, borrarlo.
			hmLibros.remove(id);
			resultado = true;
		}

		return resultado;
	}

	@Override
	public boolean insert(Libro lib) {
		boolean encontrado = false;
		boolean resultado = true;

		// Recorro el HashMap
		for (Iterator<Integer> it = hmLibros.keySet().iterator(); it.hasNext();) {
			Integer key = it.next();
			Libro value = hmLibros.get(key);

			// Si el nombre del libro es igual al introducido error.
			if (value.getNombre().equalsIgnoreCase(lib.getNombre())) {
				// El nombre del libro ya existe
				encontrado = true;
				resultado = false;
				// System.out.println("**El nombre del libro ya existe.");
				break; // salir
			}
		} // for

		// Si no existe se añade
		if (encontrado == false) {
			lib.setId(indice);
			hmLibros.put(indice, lib);
			indice++;
			resultado = true;
			// Libro creado correctamente
		}

		return resultado;
	}

}
