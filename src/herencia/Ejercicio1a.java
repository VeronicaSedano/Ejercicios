package herencia;

import java.util.ArrayList;

import pojo.Electrodomestico;
import pojo.TelevisionPlana;
import pojo.Televisor;

public class Ejercicio1a {

	public static void main(String[] args) {
		ArrayList<Electrodomestico> lista = new ArrayList<>();

		Electrodomestico elec1 = new Electrodomestico();
		elec1.setNombre("Lavadora BALAY");
		elec1.setPrecio(300);
		lista.add(elec1);

		Televisor tele = new Televisor();
		tele.setNombre("Telefunken");
		tele.setPrecio(400);
		tele.setPulgadas(30);
		lista.add(tele);

		TelevisionPlana tele2 = new TelevisionPlana();
		tele2.setNombre("LG enorme");
		tele2.setPrecio(600);
		tele2.setPulgadas(100);
		tele2.setTipoPantalla("XL");
		lista.add(tele2);

		// ArrayList<TelevisionPlana> listaTVPlanas = new ArrayList<>();
		// listaTVPlanas.add(elec1);

		for (Electrodomestico elec : lista) {

			if (elec instanceof Electrodomestico) { // Este if no hace falta porque todos son Electrodomesticos
				System.out.printf("Nombre: %s \n", elec.getNombre());
				System.out.printf("Precio: %s \n", elec.getPrecio());
			}

			// En vez de usar syso, castear y mostrar datos con getters
			// System.out.println(elec.toString());
			if (elec instanceof Televisor) {

				Televisor tv = (Televisor) elec;
				System.out.printf("Pulgadas: %s \n", tv.getPulgadas());
				// podemos castear usando (Television) y asi nos permite acceder a los metodos
				// de esa clase
				// ((Televisor) elec).getPulgadas();
				// System.out.println();

			}

			if (elec instanceof TelevisionPlana) {

				// tambien podemos castear y asignarlo a una variable nueva
				TelevisionPlana tvp = (TelevisionPlana) elec;
				tvp.getTipoPantalla();
				System.out.printf("Tipo de pantalla: %s \n", tvp.getTipoPantalla());

			}

			System.out.println("----------------------------");

		} // for
		System.out.println("Salimos");

	} // main

}
