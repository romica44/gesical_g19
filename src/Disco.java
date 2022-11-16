import java.util.List;

public class Disco {
    //atributos
    private int anioEdicion;
    private String titulo;
    private List<Cancion> canciones;
    //constructor
    
    public Disco(int anioEdicion, String titulo, List<Cancion> canciones) {
        this.anioEdicion = anioEdicion;
        this.titulo = titulo;
        this.canciones = canciones;
    }
    
    //getters y setters
    public int getAnioEdicion() {
        return anioEdicion;
    }
    
    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public List<Cancion> getCanciones() {
        return canciones;
    }
    
    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }
    
    
    //toString
    @Override
    public String toString() {
        return "Disco [anioEdicion=" + anioEdicion + ", titulo=" + titulo + ", canciones=" + canciones + "]";
    }
}
    