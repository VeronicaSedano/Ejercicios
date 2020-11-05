package modelo;

import pojo.Perro;

/**
 * DAO para definir las operaciones de CRUD<br>
 * Fijaros como interferimos la clase generica {@code IDao
 * 
<P>
 * } por {@code IDao<Perro> }
 * 
 * @author Veronica
 *
 */

public interface PerroDao extends IDao<Perro> {

}
