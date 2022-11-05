
public class Cancion {
    //atributos
    private String nombre;
    private int duracion;
    //constructor
    public Cancion(String nombre, int duracion) {
    this.nombre = nombre;
    this.duracion = duracion;
    }
    //getters y setters
    public String getNombre() {
    return nombre;
    }
    public void setNombre(String nombre) {
    this.nombre = nombre;
    }
    public int getDuracion() {
    return duracion;
    }
    public void setDuracion(int duracion) {
    this.duracion = duracion;
    }
    //toString
    @Override
    public String toString() {
    return "Cancion [nombre=" + nombre + ", duracion=" + duracion + "]";
    }
    }
    