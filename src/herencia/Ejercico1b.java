package herencia;

import java.util.ArrayList;

import pojo.Electrodomestico;
import pojo.TelevisionPlana;
import pojo.Televisor;

/**
 * Realizar el mismo ejercicio que en EjecicioElectrodomesticos (Ejercicio 1a),
 * pero esta vez hay que crear nuevos constructores para poder crear instancias
 * con todos los atributos.<br>
 * por ejemplo: <br>
 * 
 * <pre>
 *   
 *      TelevisionPlana tv = new TelevisionPlana("tele", 300, .., ..  );
 * </pre>
 * 
 * @author Veronica
 * @version 1.0
 *
 */

public class Ejercico1b {

	static ArrayList<Electrodomestico> lista = new ArrayList<>();

	public static void main(String[] args) {

		Electrodomestico elec1 = new Electrodomestico("Lavadora BALAY", 300);
		lista.add(elec1);
		// lista.add(new Electrodomestico("Lavadora BALAY", 300));

		Televisor tele = new Televisor("Telefunken", 400, 30);
		lista.add(tele);
		// lista.add(new Televisor("Telefunken", 400, 30));

		TelevisionPlana tele2 = new TelevisionPlana("LG", 600, 100, "XL");
		lista.add(tele2);
		// lista.add(new TelevisionPlana("LG", 600, 100, "XL"));

		for (Electrodomestico elec : lista) {

			// TODO en vez de usar syso, castear y mostrar datos con getters
			// System.out.println(elec.toString());
			if (elec instanceof Televisor) {

				// podemos castear usando (Television) y asi nos permite acceder a los metodos
				// de esa clase
				((Televisor) elec).getPulgadas();
				// System.out.println();

			}

			if (elec instanceof TelevisionPlana) {

				// tambien podemos castear y asignarlo a una variable nueva
				TelevisionPlana tvp = (TelevisionPlana) elec;
				tvp.getTipoPantalla();
				System.out.printf("Tipo de pantalla %s ", tvp.getTipoPantalla());

			}

		} // for
		System.out.println("Salimos");

	}

}
