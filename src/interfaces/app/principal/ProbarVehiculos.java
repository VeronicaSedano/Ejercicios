package interfaces.app.principal;

import interfaces.app.clases.Patinete;

public class ProbarVehiculos {

	public static void main(String[] args) {

		Patinete patinete = new Patinete();

		try {
			patinete.arrancar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			patinete.acelerar(80);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			patinete.frenar(80);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			patinete.apagar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(patinete.toString());

	}// main

}
