
package modelo;

/**
 *
 * @author nunez
 */
public class tripuladas {
    
    // Inicializar los atributos de las naves de tipo no tripuladas
    
    private String nombre;
    private String finalidadUso;
    private int peso;
    private int distanciaDeOrbita;
    private int capacidad;
    private String pais;

    //Se crea un constructor por defecto, que no tiene parámetros y 
    //se utiliza para crear una nueva instancia de nave tripulada sin 
    //asignar valores a sus atributos.

    public tripuladas() {
    }

    //constructor con parámetros, que se utiliza para crear una nueva instancia 
    //de nave tripulada asignando valores a sus atributos.
    public tripuladas(String nombre, String finalidadUso, int peso, int distanciaDeOrbita, int capacidad, String pais) {
        this.nombre = nombre;
        this.finalidadUso = finalidadUso;
        this.peso = peso;
        this.distanciaDeOrbita = distanciaDeOrbita;
        this.capacidad = capacidad;
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

    public String getFinalidadUso() {
        return finalidadUso;
    }

    public void setFinalidadUso(String finalidadUso) {
        this.finalidadUso = finalidadUso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getDistanciaDeOrbita() {
        return distanciaDeOrbita;
    }

    public void setDistanciaDeOrbita(int distanciaDeOrbita) {
        this.distanciaDeOrbita = distanciaDeOrbita;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
   
    
}
