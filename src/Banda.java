
import java.util.List;


public class Banda extends Musico {
    //atributos
    private String titulo;
    private List<Solista> solistas;
    //constructor
    public Banda(String genero, int anioOficial, String discografica, String titulo, List<Solista> solistas) {
    super(genero, anioOficial, discografica);
    this.titulo = titulo;
    this.solistas = solistas;
    }

    Banda(String titulo, String genero, int anioOficial, String discografica) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    //getters y setters
    public String getTitulo() {
    return titulo;
    }
    
    public void setTitulo(String titulo) {
    this.titulo = titulo;
    }
    
    public List<Solista> getSolistas() {
    return solistas;
    }
    
    public void setSolistas(List<Solista> solistas) {
    this.solistas = solistas;
    }
    
    //toString
    @Override
    public String toString() {
    return "Banda [titulo=" + titulo + ", solistas=" + solistas + "]";
    }
    }
    