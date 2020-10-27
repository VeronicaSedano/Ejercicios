package com.ipartek;

import pojo.Serie;

public class ProbarInterfaz {

	public static void main(String[] args) throws Exception {

		Utilidades2 util = new Utilidades2();

		// pedir nombre
		boolean isError = true;

		do {
			try {
				String nombre = util.pedirNombre();
				System.out.println(nombre);
				isError = false;

			} catch (Exception e) {
				System.out.println("EXCEPCION: " + e.getMessage());
			}

		} while (isError);

		System.out.println("/////////////////////////////");

		// Imprimir tipo loteria
		try {
			util.imprimirNumeroLoteria(1);
			util.imprimirNumeroLoteria(2);
			util.imprimirNumeroLoteria(3);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("/////////////////////////////");

		// Pedir vueltas
		try {
			float vueltas = util.calcularVueltas(100, 50);
			System.out.println("Las vueltas son: " + vueltas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Pedir datos Serie
		Serie s = util.pedirDatosPorConsola();
		System.out.println("Tu serie es: " + s);

	}// main

}
