package modelo;

/**
 *
 * @author nunez
 */
public class Database {
 
    //Se inicializan los valores que nos permiten la conexion con la base de datos
    private String url;
    private String user;
    private String password;
    private String driver;

    //Se crea un contructor con los valores antes inicializados, y se asignan 
    //los valores que permiten la conexion.
    public Database() {
        this.url = "jdbc:mysql://localhost:3306/navessofka";
        this.user = "root";
        this.password = "Colombia.2022";
        this.driver = "com.mysql.cj.jdbc.Driver";
    }

    //Se crean los respectivos getters para poder obtener los valores mas adelante

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getDriver() {
        return driver;
    }   
}
