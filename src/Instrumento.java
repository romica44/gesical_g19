
public class Instrumento {
    //atributos
    private String nombre;
    private String tipo;
    //constructor
    public Instrumento(String nombre, String tipo) {
    this.nombre = nombre;
    this.tipo = tipo;
    }
    
    //getters y setters
    public String getNombre() {
    return nombre;
    }
    
    public void setNombre(String nombre) {
    this.nombre = nombre;
    }
    
    public String getTipo() {
    return tipo;
    }
    
    public void setTipo(String tipo) {
    this.tipo = tipo;
    }

    public void tocar() {
    System.out.println("Tocar " + this.nombre);
    }
    
    //toString
    @Override
    public String toString() {
    return "Instrumento [nombre=" + nombre + ", tipo=" + tipo + "]";
    }
    }
    
//     La clase Instrumento implementa la
// interface Tocable que debe tener el método tocar(). Este método se deberá implementar en las
// clases que correspondan, pero lo único que hará será mostrar por pantalla un texto como el
// que sigue: “Tocar <instrumento>”, donde <instrumento> será el que corresponda.


