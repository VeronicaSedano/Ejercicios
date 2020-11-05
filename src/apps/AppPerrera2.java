package apps;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.PerroDAOSqlite;
import modelo.PerroDao;
import pojo.Perro;

public class AppPerrera2 {

	// variables globales para esta Clase
	static private Scanner sc = null;
	static private PerroDao modelo = new PerroDAOSqlite();
	static private String opcion = ""; // opcion seleccionada en el menu por el usuario

	// cuando usamos un patron singleton, el constructor es privado
	// static private PerroDao modelo = new PerroDAOSqlite();
	// deberemos usar el metodo getInstance();
	// static private PerroDao modelo = PerroDAOSqlite.getInstance();
	// static private PerroDao modelo = PerroDAOArrayList.getInstance();

	// opciones del menu principal
	static final private String OP_LISTAR = "1";
	static final private String OP_CREAR = "2";
	static final private String OP_MODIFICAR = "3";
	static final private String OP_ELIMINAR = "4";
	static final private String OP_SALIR = "s";

	// opciones menu de modificar
	static final private String OP_NOMBRE = "1";
	static final private String OP_RAZA = "2";
	static final private String OP_PESO = "3";
	static final private String OP_VACUNADO = "4";
	static final private String OP_HISTORIA = "5";
	static final private String OPCION_SALIR = "s";

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		boolean salir = false;

		do {

			pintarMenu();

			switch (opcion) {
			case OP_LISTAR:
				listar();
				break;
			case OP_CREAR:
				crear();
				break;
			case OP_MODIFICAR:
				modificar();
				break;
			case OP_ELIMINAR:
				eliminar();
				break;
			case OP_SALIR:
				salir = true;
				System.out.println("*** ADIOS ***");
				break;

			default:
				System.out.println(" ** por favor selecciona una opción valida ** ");
				break;
			}

		} while (!salir);

		sc.close();

	}// main

	private static void modificar() {

		boolean flag = true;
		int id = 0;
		Perro pModificar = null;

		// buscar perro por id
		do {
			System.out.println("Escribe el ID del perro que quieres modificar:");
			id = Integer.parseInt(sc.nextLine());

			pModificar = modelo.recuperar(id);
			if (pModificar == null) {
				System.out.println("*Lo sentimos pero no existe ese perro");
			} else {
				flag = false;
			}

		} while (flag);

		boolean salir = false;
		String opcion2 = "";

		do {

			System.out.println("¿Que quieres modificar? \n");
			System.out.println("1º Nombre \n 2º Raza \n 3º Peso \n 4º Vacunado \n 5º Historia \n S- Salir");
			opcion2 = sc.nextLine();

			switch (opcion) {
			case OP_NOMBRE:

				break;
			case OP_RAZA:

				break;
			case OP_PESO:

				break;
			case OP_VACUNADO:

				break;
			case OP_HISTORIA:

				break;
			case OP_SALIR:
				salir = true;
				System.out.println("*** ADIOS ***");
				break;

			default:
				System.out.println(" ** por favor selecciona una opción valida ** ");
				break;
			}

		} while (!salir);

		sc.close();

	}

	private static void eliminar() {
		boolean flag = true;
		int id = 0;
		Perro pEliminar = null;

		// buscar perro por id
		do {
			System.out.println("Dime el ID del perro para eliminar:");
			id = Integer.parseInt(sc.nextLine());

			pEliminar = modelo.recuperar(id);
			if (pEliminar == null) {
				System.out.println("*Lo sentimos pero no existe ese perro");
			} else {
				flag = false;
			}

		} while (flag);

		// pedir confirmacion de nombre para eliminar
		flag = true;

		do {
			System.out.println("************************************");
			System.out.printf("Si quieres borrarlo escribe su nombre [%s] \n", pEliminar.getNombre());
			System.out.println("Si no quieres borrarlo escribe [s] para salir. ");
			System.out.println("************************************");
			String nombre = sc.nextLine();

			if ("s".equalsIgnoreCase(nombre)) {
				// salir
				flag = false;
				// O tambien se puede poner break;

			} else {

				if (pEliminar.getNombre().equalsIgnoreCase(nombre)) {

					try {
						modelo.eliminar(id);
						flag = false;
						System.out.println("Hemos dado de baja al perro");

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

		} while (flag);

	}

	private static void crear() {
		// Creo nuevo perro
		Perro p = new Perro();

		String nombre;
		float peso;

		// Pedir datos

		boolean error2 = true;

		System.out.println("Escribe el nombre del perro:");
		nombre = sc.nextLine();

		System.out.println("Escribe la raza del perro:");
		String raza = sc.nextLine();
		// Si la raza esta vacia se pone por defecto 'cruce'
		// La raza se gestiona en el setRaza.
		// raza = (raza.isEmpty()) ? Perro.RAZA_PERRO : raza;

		do {
			try {
				System.out.println("Escribe el peso del perro:");
				peso = Float.parseFloat(sc.nextLine());
				p.setPeso(peso);
				error2 = false;

			} catch (Exception e) {
				System.out.println("No es un numero el peso.");
			}

		} while (error2);

		System.out.println("Escribe si el perro esta vacunado [s / n]:");
		boolean vacunado = ("s".equalsIgnoreCase(sc.nextLine())) ? true : false;

		System.out.println("Escribe la historia del perro:");
		String historia = sc.nextLine();

		p.setNombre(nombre);
		p.setRaza(raza);
		p.setVacunado(vacunado);
		p.setHistoria(historia);

		boolean isFallo = true;

		do {
			try {
				modelo.crear(p); // llamamos al modelo pasandole el nuevo perro
				System.out.println("Perro creado.");
				System.out.println(p);
				isFallo = false;

			} catch (Exception e) {
				System.out.println("No se ha podido guardar el perro. El nombre introducido ya existe.");
				System.out.println("Escribe de nuevo el nombre del perro.");
				nombre = sc.nextLine();
				p.setNombre(nombre);
			}

		} while (isFallo);

	}

	private static void listar() {

		// TODO ver como dar una fixed lenght al String para nombre
		ArrayList<Perro> perros = modelo.listar();
		System.out.println(" ID |   NOMBRE   |    RAZA      |   PESO   |    VACUNADO   |      HISTORIA      ");
		System.out.println("-----------------------------------------------------------------------------------");

		for (Perro perro : perros) {
			System.out.println(String.format("%3s / %10s [%13s] / %4s Kg / Vacunado:%4s / Historia: %s", perro.getId(),
					perro.getNombre(), perro.getRaza(), perro.getPeso(), (perro.isVacunado()) ? " si " : " no ",
					perro.getHistoria()));
		}

		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
	}

	/**
	 * Se encraga de pintar las pociones del menu.<br>
	 * Fijaros que no aparece {@code @return} porque no retorna nada {@code void}
	 * 
	 */
	private static void pintarMenu() {

		System.out.println("*********  APP  PERRERA   **********");
		System.out.println("************************************");
		System.out.println(" " + OP_LISTAR + ".- Listar todos los perros");
		System.out.println(" " + OP_CREAR + ".- Crear un perro");
		System.out.println(" " + OP_MODIFICAR + ".- Modificar un perro");
		System.out.println(" " + OP_ELIMINAR + ".- Dar de baja un Perro");
		System.out.println(" ");
		System.out.println(" " + OP_SALIR + " - Salir");
		System.out.println("************************************");

		System.out.println("\n Selecciona una opcion del menu:");
		// TODO gestionar errores
		opcion = sc.nextLine();

	}

}// AppPerrera2
