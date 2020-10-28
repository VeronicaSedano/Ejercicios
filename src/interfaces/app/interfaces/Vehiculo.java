package interfaces.app.interfaces;

public interface Vehiculo {

	// Constantes
	int VEL_MAX_COCHE = 120;
	int VEL_MAX_BICI = 50;
	int VEL_MAX_PATINETE = 80;

	// Metodos sin implementar
	void arrancar() throws Exception;

	void acelerar(int incrementoVel) throws Exception;

	void frenar(int decrementoVel) throws Exception;

	void apagar() throws Exception;

}
