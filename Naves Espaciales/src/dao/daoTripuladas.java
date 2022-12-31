
package dao;


import java.util.ArrayList;
import modelo.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author nunez
 */
public class daoTripuladas implements Operaciones{
    
    /*Se declaran variables que serviran para el correcto funcionamiento de los metodos
     en este caso traeremos el modelo Database y el modelo tripuladas y les asignamos un nombre 
     para usarlo dentro de los metodos
    */
    Database db = new Database();
    tripuladas trip = new tripuladas();

    @Override
    public boolean insertar(Object obj) {
        // Se crean las variables que permitiran la conexion a la base de datos y la consulta SQL
        trip = (tripuladas) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "insert into tripuladas values(?,?,?,?,?,?)";
        
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
            pst.setString(1, trip.getNombre());
            pst.setString(2, trip.getFinalidadUso());
            pst.setInt(3, trip.getPeso());
            pst.setInt(4, trip.getDistanciaDeOrbita());
            pst.setInt(5, trip.getCapacidad());
            pst.setString(6, trip.getPais());
            
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
        trip = (tripuladas) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "delete from tripuladas where nombre = ?";
        
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
            pst.setString(1, trip.getNombre());
            
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
        trip = (tripuladas) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update tripuladas set finalidadUso=?, peso=?, distanciadeorbita=?, capacidad=?, pais=? where nombre=?";
        
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
            pst.setString(1, trip.getFinalidadUso());
            pst.setInt(2, trip.getPeso());
            pst.setInt(3, trip.getDistanciaDeOrbita());
            pst.setInt(4, trip.getCapacidad());
            pst.setString(5, trip.getPais());
            pst.setString(6, trip.getNombre());
            
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
        // Creamos un ArrayList de objetos para almacenar los datos que recuperaremos de la base de datos
        ArrayList<Object[]> data = new ArrayList<>();
        // Declaramos las variables para la conexión a la base de datos
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        // Creamos la sentencia SQL para seleccionar todos los registros de la tabla "tripuladas"
        String sql = "Select * from tripuladas";
        
        try {
            // Cargamos el driver de la base de datos especificado en la clase "db"
            Class.forName(db.getDriver());
            // Establecemos la conexión a la base de datos usando los datos de la clase "db"
            con= DriverManager.getConnection(
                    db.getUrl(),
                    db.getUser(),
                    db.getPassword()
            );
            // Preparamos la sentencia SQL para ser ejecutada
            pst = con.prepareStatement(sql);
            // Ejecutamos la sentencia y obtenemos el resultado en un ResultSet
            rs = pst.executeQuery();
            
            // Iteramos sobre el ResultSet obtenido
            while(rs.next()){
                // Creamos un arreglo de objetos para almacenar los datos de cada fila
                Object[] fila = new Object[6];
                // Iteramos sobre cada columna de la fila actual del ResultSet
                for(int i = 0; i <= 5; i++){
                    // Almacenamos el valor de la columna en el arreglo de objetos
                    fila[i] = rs.getObject(i+1);
                }
                // Añadimos el arreglo de objetos al ArrayList
                data.add(fila);
            }
            // Cerramos la conexión a la base de datos
            con.close();
         
        } catch (SQLException | ClassNotFoundException e){
            // Mostramos un mensaje de error en caso de que ocurra algún problema durante la ejecución del método
            JOptionPane.showMessageDialog(null, "Ocurrio este error: " + e.getMessage());     
        }
        finally{
            // Devolvemos el ArrayList de objetos con los datos recuperados de la base de datos
            return data;
        }
    }
    
    public ArrayList<Object[]> buscar(String bus) {
    // Creamos una lista para almacenar los resultados de la búsqueda
    ArrayList<Object[]> data = new ArrayList<>();
    
    // Declaramos las variables necesarias para realizar la consulta
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    // Creamos la sentencia SQL para realizar la búsqueda
    String sql = "Select * from tripuladas where nombre = '" + bus+"'";
    
    try {
        // Cargamos el driver de la base de datos
        Class.forName(db.getDriver());
        
        // Establecemos la conexión a la base de datos
        con= DriverManager.getConnection(
                db.getUrl(),
                db.getUser(),
                db.getPassword()
        );
        
        // Preparamos la sentencia SQL
        pst = con.prepareStatement(sql);
        
        // Ejecutamos la consulta
        rs = pst.executeQuery();
        
        // Iteramos sobre cada fila de resultados
        while(rs.next()){
            // Creamos un arreglo de objetos para almacenar los datos de la fila
            Object[] fila = new Object[6];
            
            // Almacenamos cada columna de la fila en el arreglo
            for(int i = 0; i <= 5; i++){
                fila[i] = rs.getObject(i+1);
            }
            
            // Agregamos el arreglo a la lista de resultados
            data.add(fila);
        }
        
        // Cerramos la conexión a la base de datos
        con.close();
     
    } catch (SQLException | ClassNotFoundException e){
        // Si ocurre un error, mostramos un mensaje de error
        JOptionPane.showMessageDialog(null, "Ocurrio este error: " + e.getMessage());     
    }
    finally{
        // Retornamos la lista de resultados
        return data;
    }
}
}
