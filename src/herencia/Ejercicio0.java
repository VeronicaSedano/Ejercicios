package herencia;

import pojo.Estudiante;
import pojo.Gato;
import pojo.GatoDomestico;
import pojo.Persona;
import pojo.Profesor;

public class Ejercicio0 {
	public static void main(String[] args) throws Exception {

		Persona p = new Persona();
		p.setEdad(35);
		p.setNombre("Juan");
		// p.setNotaMedia(8.5f);

		Estudiante estu = new Estudiante();
		estu.setEdad(18);
		estu.setNombre("Pepe");
		estu.setNotaMedia(8.5f);

		// crear la profesor Bacterio
		Profesor profe = new Profesor();
		profe.setNombre("Dr Bacterio");
		profe.setEdad(88);
		profe.setAsignatura("Quimica avanzada");

		Gato gato = new Gato("Garfiled");
		System.out.println(gato);

		GatoDomestico gMitxi = new GatoDomestico("Mitxi");
		System.out.println(gMitxi);
	}

}
