
package modelo;

/**
 *
 * @author nunez
 */

//Se crea la clase lanzaderas 
public class lanzaderas {
    
    // Inicializar los atributos de las naves de tipo lanzadera
    private String nombre;
    private int peso;
    private int empuje;
    private int capacidad;
    private int altura;
    private int alcance;
    private int potencia;
    private String combustible;
    private String pais;

    //Se crea un constructor por defecto, que no tiene parámetros y 
    //se utiliza para crear una nueva instancia de lanzadera sin 
    //asignar valores a sus atributos.
    public lanzaderas(){
    }

    //constructor con parámetros, que se utiliza para crear una nueva instancia 
    //de lanzadera asignando valores a sus atributos.
    public lanzaderas(String nombre, int peso, int empuje, int capacidad, int altura, int alcance, int potencia, String combustible, String pais) {
        this.nombre = nombre;
        this.peso = peso;
        this.empuje = empuje;
        this.capacidad = capacidad;
        this.altura = altura;
        this.alcance = alcance;
        this.potencia = potencia;
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEmpuje() {
        return empuje;
    }

    public void setEmpuje(int empuje) {
        this.empuje = empuje;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
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
