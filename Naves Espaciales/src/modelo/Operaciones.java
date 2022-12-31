package modelo;

import java.util.ArrayList;

/**
 *
 * @author nunez
 */
public interface Operaciones {
    
    //Se crean los metodos que se usaran en las clases dao
    public boolean insertar(Object obj);
    public boolean eliminar(Object obj);
    public boolean modificar(Object obj);
    public ArrayList<Object[]> consultar();

}
