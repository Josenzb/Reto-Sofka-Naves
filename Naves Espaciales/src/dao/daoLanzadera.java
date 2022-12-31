
package dao;

import java.util.ArrayList;
import modelo.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author nunez
 */

//Se crea la clase daoLanzadera y se implementa la interfaz operaciones, trayendo asi los metodos en ella.
public class daoLanzadera implements Operaciones{
    
    /*Se declaran variables que serviran para el correcto funcionamiento de los metodos
     en este caso traeremos el modelo Database y el modelo Lanzadera y les asignamos un nombre 
     para usarlo dentro de los metodos
    */

    Database db = new Database();
    lanzaderas lanza = new lanzaderas();
    

    @Override
    public boolean insertar(Object obj) {
        // Se crean las variables que permitiran la conexion a la base de datos y la consulta SQL
        lanza = (lanzaderas) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "insert into lanzadera values(?,?,?,?,?,?,?,?,?)";
        
        //Se realiza un Try-Catch en el cual; se intenta la conexion y de ser posible 
        //se ejecuta la sentencia SQL
        try {
            //se invoca el driver
            Class.forName(db.getDriver());
            //se realiza la conexion con la variable de tipo connection definida anteriormente y se
            //proporcionan la url, el nombre de usuario y la contraseña
            con= DriverManager.getConnection(
                    db.getUrl(),
                    db.getUser(),
                    db.getPassword()            
            );
            //Se configura la prepareStatement para que realize la consulta preparada
            //asignando los valores de cada atributo
            pst=con.prepareStatement(sql);
            pst.setString(1, lanza.getNombre());
            pst.setInt(2, lanza.getPeso());
            pst.setInt(3, lanza.getEmpuje());
            pst.setInt(4, lanza.getCapacidad());
            pst.setInt(5, lanza.getAltura());
            pst.setInt(6, lanza.getAlcance());
            pst.setInt(7, lanza.getPotencia());
            pst.setString(8, lanza.getCombustible());
            pst.setString(9, lanza.getPais());
            
            //Se ejecuta la sentencia y guardo en la variable filas la cantidad de registros afectados
            int filas = pst.executeUpdate();
            //Se valida el valor de la variable filas, y si es mayor a 1 se cierra la conexion 
            //y se retorna el valor true en el metodo, en caso contrario igualmente se 
            //cierra la conexion pero se retorna false.
            if(filas>0){
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
        // En caso de error, se mostrara un panel con el error y se retornara falso en el metodo.
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, 
                    "Ocurrio el siguiente error: "+e.getMessage());
            return false;
        }    
    }

    @Override
    public boolean eliminar(Object obj) {
        // Se crean las variables que permitiran la conexion a la base de datos y la consulta SQL
        lanza = (lanzaderas) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "delete from lanzadera where nombre = ?";
        
        //Se realiza un Try-Catch en el cual; se intenta la conexion y de ser posible 
        //se ejecuta la sentencia SQL
        try {
            //se invoca el driver
            Class.forName(db.getDriver());
            //se realiza la conexion con la variable de tipo connection definida anteriormente y se
            //proporcionan la url, el nombre de usuario y la contraseña
            con= DriverManager.getConnection(
                    db.getUrl(),
                    db.getUser(),
                    db.getPassword()            
            );
            //Se configura la prepareStatement para que realize la consulta preparada
            //asignando el valor del atributo especificado en la consulta
            pst=con.prepareStatement(sql);
            pst.setString(1, lanza.getNombre());
            
            //Se ejecuta la sentencia y guardo en la variable filas la cantidad de registros afectados
            int filas = pst.executeUpdate();
            //Se valida el valor de la variable filas, y si es mayor a 1 se cierra la conexion 
            //y se retorna el valor true en el metodo, en caso contrario igualmente se 
            //cierra la conexion pero se retorna false.
            if(filas>0){
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
        // En caso de error, se mostrara un panel con el error y se retornara falso en el metodo.
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, 
                    "Ocurrio el siguiente error: "+e.getMessage());
            return false;
        }    
    }    

    @Override
    public boolean modificar(Object obj) {
       // Se crean las variables que permitiran la conexion a la base de datos y la consulta SQL
        lanza = (lanzaderas) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update lanzadera set peso=?, empuje=?, capacidad_carga=?, altura=?, alcance=?, potencia=?, combustible=?, pais=? where nombre=?";
        
        //Se realiza un Try-Catch en el cual; se intenta la conexion y de ser posible 
        //se ejecuta la sentencia SQL
        try {
            //se invoca el driver
            Class.forName(db.getDriver());
            //se realiza la conexion con la variable de tipo connection definida anteriormente y se
            //proporcionan la url, el nombre de usuario y la contraseña
            con= DriverManager.getConnection(
                    db.getUrl(),
                    db.getUser(),
                    db.getPassword()            
            );
            //Se configura la prepareStatement para que realize la consulta preparada
            //asignando los valores de cada atributo
            pst=con.prepareStatement(sql);
            pst.setInt(1, lanza.getPeso());
            pst.setInt(2, lanza.getEmpuje());
            pst.setInt(3, lanza.getCapacidad());
            pst.setInt(4, lanza.getAltura());
            pst.setInt(5, lanza.getAlcance());
            pst.setInt(6, lanza.getPotencia());
            pst.setString(7, lanza.getCombustible());
            pst.setString(8, lanza.getPais());
            pst.setString(9, lanza.getNombre());
            
            //Se ejecuta la sentencia y guardo en la variable filas la cantidad de registros afectados
            int filas = pst.executeUpdate();
            //Se valida el valor de la variable filas, y si es mayor a 1 se cierra la conexion 
            //y se retorna el valor true en el metodo, en caso contrario igualmente se 
            //cierra la conexion pero se retorna false.
            if(filas>0){
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
        // En caso de error, se mostrara un panel con el error y se retornara falso en el metodo.
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, 
                    "Ocurrio el siguiente error: "+e.getMessage());
            return false;
        } 
    }

    @Override
    public ArrayList<Object[]> consultar() {
    // Creamos una lista para almacenar los datos que se obtengan de la consulta
    ArrayList<Object[]> data = new ArrayList<>();
    // Creamos variables para la conexión a la base de datos, la sentencia SQL y el resultado de la consulta
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    String sql = "Select * from lanzadera";
    
    try {
        // Cargamos el driver de la base de datos
        Class.forName(db.getDriver());
        // Establecemos la conexión a la base de datos
        con= DriverManager.getConnection(
                db.getUrl(),
                db.getUser(),
                db.getPassword()
        );
        // Creamos una sentencia preparada con la consulta SQL
        pst = con.prepareStatement(sql);
        // Ejecutamos la consulta y obtenemos el resultado
        rs = pst.executeQuery();
        
        // Recorremos el resultado fila por fila
        while(rs.next()){
            // Creamos un array de objetos para almacenar los datos de cada fila
            Object[] fila = new Object[9];
            // Recorremos las columnas de la fila y guardamos cada dato en el array
            for(int i = 0; i <= 8; i++){
                fila[i] = rs.getObject(i+1);
            }
            // Añadimos la fila a la lista de datos
            data.add(fila);
        }
        // Cerramos la conexión a la base de datos
        con.close();
         
    } catch (SQLException | ClassNotFoundException e){
        // Mostramos un mensaje de error si ocurre algún problema durante la consulta
        JOptionPane.showMessageDialog(null, "Ocurrio este error: " + e.getMessage());     
    }
    finally{
        // Devolvemos la lista de datos, independientemente de si se ha podido realizar la consulta o no
        return data;
    }
}

    
    
public ArrayList<Object[]> buscar(String bus) {
        ArrayList<Object[]> data = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        // Crea la consulta SQL para buscar la lanzadera por nombre
        String sql = "Select * from lanzadera where nombre = '" + bus+"'";
        
        try {
            // Carga el controlador de la base de datos y establece la conexión
            Class.forName(db.getDriver());
            con= DriverManager.getConnection(
                    db.getUrl(),
                    db.getUser(),
                    db.getPassword()
            );
            
            // Prepara la consulta y la ejecuta
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            // Recorre el resultado de la consulta y lo agrega a la lista
            while(rs.next()){
                Object[] fila = new Object[9];
                for(int i = 0; i <= 8; i++){
                    fila[i] = rs.getObject(i+1);
                }
                data.add(fila);
            }
            
            // Cierra la conexión a la base de datos
            con.close();
         
        } catch (SQLException | ClassNotFoundException e){
            // Muestra un mensaje de error si ocurre algún problema
            JOptionPane.showMessageDialog(null, "Ocurrio este error: " + e.getMessage());     
        }
        finally{
            // Devuelve la lista de lanzaderas encontradas
            return data;
        }
    }

}
