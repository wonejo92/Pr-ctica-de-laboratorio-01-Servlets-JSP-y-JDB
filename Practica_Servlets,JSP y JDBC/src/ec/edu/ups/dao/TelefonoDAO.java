package ec.edu.ups.dao;
import ec.edu.ups.modelo.Telefono;

/**
 * Interface ProductDAO.
 * 
 * La interface ProductDAO ha sido creada como interface específica para la
 * persistencia de objetos de tipo Category en la base de datos. Dicha interface
 * hereda de la clase GenericDAO y será imlementada en una clase específica que
 * controlará la conexión a la base de datos de un sistema que permite
 * ejemplificar el uso del patrón de diseño DAO.
 * 
 * Además, en esta interface se pueden agregar método específicos para el manejo
 * del objeto Product, por ejemplo: buscarProductPorDescripction entre otras.
 * 
 * @see GenericDAO
 * @see Telefono
 * 
 * @version 1.0
 *
 */

public interface TelefonoDAO  extends GenericDAO<Telefono, Integer>{

}
