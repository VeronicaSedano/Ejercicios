package excepciones;

public class Utilidades {

	/**
	 * Calcula la letra del DNI
	 * 
	 * @param numeros String son los 8 numeros del DNI
	 * @return dni completo con los numeros + letra
	 * @throws Exception si no pasamos como parametros 8 numeros
	 */
	public static String calcularLetraDni(String numeros) throws Exception {

		char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };

		String dniCompleto;

		if (numeros == null) {
			throw new Exception("No puede ser null");
		}

		if (numeros.length() != 8) {
			throw new Exception("Los numeros de un dni son 8");
		}

		try {

			int resto = Integer.parseInt(numeros) % 23;
			dniCompleto = numeros + letras[resto];

		} catch (Exception e) {
			throw new Exception("No es un numero.");
		}

		return dniCompleto;

	}

}
