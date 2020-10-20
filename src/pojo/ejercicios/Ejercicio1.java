package pojo.ejercicios;

import pojo.Perro;

/**
 * La historia de los 8 perros mas famosos.<br>
 * Crear 8 perros con su constructor por defecto y setear el nombre e
 * historia.<br>
 * Mostrar por pantalla sus nombres e historias;
 * 
 * 
 * @see https://blog.patasbox.com/los-8-perros-mas-fomos-de-la-historia/
 * @author ur00
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {

		/* 1º */
		Perro snoppy = new Perro();
		// snoppy.nombre = "Snoppy";
		snoppy.setNombre("Snoppy");
		// snoppy.peso = -12;
		snoppy.setPeso(12);

		/* 2º */
		Perro p2 = new Perro();
		p2.setNombre("Laika");
		p2.setHistoria(
				"Esta famosa perrita soviética fue el primer ser vivo en viajar al espacio. En 1957 emprendió su viaje y desafortunadamente murió a las 5 horas de despegar por el estrés y la falta de oxígeno. Este suceso puso en el punto de mira los experimentos con animales. Desde entonces Laika ha sido un icono en la historia.");

		/* 3º */
		Perro p3 = new Perro();
		p3.setNombre("Hachiko");
		p3.setHistoria(
				"Pocos perros han sido tan famosos como él, llegando incluso a traspasar la pantalla y hacernos soltar alguna que otra lagrimilla. Este perro de raza Akita conmocionó al mundo con su historia de lealtad y amor por su amo. Su historia se hizo famosa por estar durante 10 años esperando a su dueño en la estación de metro, a pesar de que éste había muerto en uno de los trayectos.");

		/* 4º */
		Perro p4 = new Perro();
		p4.setNombre("Balto");
		p4.setHistoria(
				"Este husky siberiano comandó a un grupo de perros para llevar vacunas a un pueblo que tenía una epidemia de difteria y que se encontraba aislado a mil kilómetros de distancia del hospital más cercano. Se le considera el héroe de los niños del pueblo Nome.");

		System.out.println(snoppy.getNombre() + " " + snoppy.getPeso() + " kg");
		System.out.println(p2.getNombre() + " " + p2.getHistoria());
		System.out.println(p3.getNombre() + " " + p3.getHistoria());

	}
}
