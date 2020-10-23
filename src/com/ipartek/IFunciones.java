package com.ipartek;

import pojo.Serie;

/**
 * Interfaz para obligar a implementar una serie de metodos.
 * 
 * @author Verónica
 * @version 1.0
 *
 */
public interface IFunciones {

	final int LOTERIA_EUROMILLON = 1;
	final int LOTERIA_QUINIELA = 2;
	final int LOTERIA_BONOLOTO = 3;

	/**
	 * pedir nombre por Scanner
	 * 
	 * @throws si el nombre es menor de una letra o contiene numeros
	 * @return nombre escrito
	 */
	String pedirNombre() throws Exception;

	/**
	 * imprime los numeros de la Loteria<br>
	 * mirar constantes definidas
	 * 
	 * @param tipoLoteria
	 * @throws si el tipoLoteria no existe
	 */
	void imprimirNumeroLoteria(int tipoLoteria) throws Exception;

	/**
	 * calcula las vueltas
	 * 
	 * @param dineroEntregado float
	 * @param precioProducto  float
	 * @return float son las vueltas
	 * @throws Exception si precioProducto > dineroEntregado
	 */
	float calcularVueltas(float dineroEntregado, float precioProducto) throws Exception;

	/**
	 * Pedimos todos los datos de una serie por consola
	 * 
	 * @return Serie
	 */
	Serie pedirDatosPorConsola();

}
