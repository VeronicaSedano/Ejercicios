package mf0227.uf2404.actividad3;

import java.util.Scanner;

public class AppLibreria extends AppGestion {

	public static Scanner sc = null;
	static String opcion = "";
	private static LibroDao modelo = ImplementacionLibroDao.getInstance();
	private static AppLibreria app = new AppLibreria();

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		boolean salir = true;

		do {

			pintarMenu("libro");

			System.out.println("\n Selecciona una opcion del menu:");
			opcion = sc.nextLine();

			switch (opcion) {
			case OP_LISTAR:
				app.listar();
				// TODO app.listar()
				break;
			case OP_CREAR:
				app.crear();
				break;
			case OP_MODIFICAR:
				app.modificar();
				break;
			case OP_ELIMINAR:
				app.eliminar();
				break;
			case OP_SALIR:
				salir = false;
				System.out.println("*** ADIOS ***");
				break;

			default:
				System.out.println(" ** por favor selecciona una opción valida ** ");
				break;
			}

		} while (salir);

		sc.close();

	}// main

	private void modificar() {
		System.out.println("Todavia no se puede modificar.");

	}

	private void eliminar() {
		// pedir id del libro que se quiere eliminar
		System.out.println("Escribe el ID del libro que quieres borrar");
		int id = Integer.parseInt(sc.nextLine());

		// Llamar al metodo delete() de la clase ImplementacionLibroDao
		if (modelo.delete(id) == false) {
			System.out.println("**El id que has introducido no existe. \n Error al borrar el libro.");
		} else {
			System.out.println("Libro borrado correctamente.");
		}

	}

	private void listar() {
		for (Libro libro : modelo.getAll()) {
			// System.out.println(libro); //Esto muestra el toString()
			System.out.println(
					String.format("%-2s / %-25s / %-4s pgs", libro.getId(), libro.getNombre(), libro.getNumPaginas()));
		}

	}

	private void crear() {

		int numPaginas = 0;
		boolean salir = true;

		// Pedir datos
		System.out.println("Escribe el nombre del libro.");
		String nombre = sc.nextLine();

		do {
			try {
				System.out.println("Escribe el numero de paginas del libro.");
				numPaginas = Integer.parseInt(sc.nextLine());
				salir = false;
			} catch (Exception e) {
				System.out.println("Tiene que ser un numero.");
			}
		} while (salir);

		// Crear objeto libro
		Libro lib = new Libro(nombre, numPaginas);

		// Llamar el metodo insertar() de la clase ImplementacionLibroDao
		if (modelo.insert(lib) == true) {
			System.out.println("Libro creado correctamente.");
		} else {
			System.out.println("**El nombre del libro ya existe. \n Error al crear el libro");
		}

	}

}
