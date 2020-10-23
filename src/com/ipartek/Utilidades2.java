package com.ipartek;

import java.util.Scanner;

import pojo.Serie;

public class Utilidades2 implements IFunciones {

	Scanner sc = new Scanner(System.in);

	@Override
	public String pedirNombre() throws Exception {
		System.out.println("Escribe el nombre: ");
		String nombre = sc.nextLine();

		if (nombre.length() <= 1) {
			throw new Exception("El nombre no puede contener una o menos de una letra.");
		}

		for (int i = 0; i < nombre.length(); i++) {
			boolean esDigito = Character.isDigit(nombre.charAt(i));

			if (esDigito == true) {
				throw new Exception("El nombre no puede contener digitos numericos.");
			}

		}

		sc.close();
		return nombre;
	}

	@Override
	public void imprimirNumeroLoteria(int tipoLoteria) throws Exception {

		switch (tipoLoteria) {
		case LOTERIA_EUROMILLON: {
			System.out.println("Loteria Euromillon: 111111");
			break;
		}
		case LOTERIA_QUINIELA: {
			System.out.println("Loteria Quiniela: 222222");
			break;
		}
		case LOTERIA_BONOLOTO: {
			System.out.println("Loteria Bonoloto: 333333");
			break;
		}
		default:
			throw new Exception("No existe ese tipo de loteria.");
		}

	}

	@Override
	public float calcularVueltas(float dineroEntregado, float precioProducto) throws Exception {

		if (dineroEntregado < precioProducto) {
			throw new Exception("Dinero entregado insuficiente.");
		}
		return dineroEntregado - precioProducto;
	}

	@Override
	public Serie pedirDatosPorConsola() {
		// TODO Auto-generated method stub
		return null;
	}

}
