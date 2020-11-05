package modelo;

import pojo.Persona;

public interface IpersonaDAO extends IDao<Persona> {

	Persona recuperarPorDni(String dni);

}
