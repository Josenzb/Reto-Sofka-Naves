package modelo;

/**
 * @author nunez
 */

public class noTripuladas {
    // Inicializar los atributos de las naves de tipo no tripuladas
    
    private String nombre;
    private int cantidadMotores;
    private int empuje;
    private String mision;
    private String combustible;
    private String pais;

    
    //Se crea un constructor por defecto, que no tiene parámetros y 
    //se utiliza para crear una nueva instancia de nave no tripulada sin 
    //asignar valores a sus atributos.
    public noTripuladas() {
    }

    //constructor con parámetros, que se utiliza para crear una nueva instancia 
    //de nave no tripulada asignando valores a sus atributos.
    public noTripuladas(String nombre, int cantidadMotores, int empuje, String mision, String combustible, String pais) {
        this.nombre = nombre;
        this.cantidadMotores = cantidadMotores;
        this.empuje = empuje;
        this.mision = mision;
        this.combustible = combustible;
        this.pais = pais;
    }
    
    // se crean metodos get y set para cada uno de los atributos,
    //Los métodos "get" se utilizan para obtener el valor de un atributo 
    //y los métodos "set" se utilizan para establecer el valor de un atributo.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadMotores() {
        return cantidadMotores;
    }

    public void setCantidadMotores(int cantidadMotores) {
        this.cantidadMotores = cantidadMotores;
    }

    public int getEmpuje() {
        return empuje;
    }

    public void setEmpuje(int empuje) {
        this.empuje = empuje;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
    
    
}
