
public class Solista extends Musico {
    //atributos
    private String apellido;
    private String nombre;
    private String nacionalidad;
    private Instrumento instrumento;
    //constructor
    public Solista(String genero, int anioOficial, String discografica, String apellido, String nombre, String nacionalidad,
    Instrumento instrumento) {
        super(genero, anioOficial, discografica);
        this.apellido = apellido;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.instrumento = instrumento;
    }

    Solista(String genero, int anioOficial, String discografica, String apellido, String nombre, String nacionalidad, String instrumento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //getters y setters
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public Instrumento getInstrumento() {
        return instrumento;
    }
    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }
    //toString
    @Override
    public String toString() {
        return "Solista [apellido=" + apellido + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", instrumento="
        + instrumento + "]";
    }
}
    