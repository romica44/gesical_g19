
public class Musico {
    //atributos
    private String genero;
    private int anioOficial;
    private String discografica;
    //constructor
    public Musico(String genero, int anioOficial, String discografica) {
    this.genero = genero;
    this.anioOficial = anioOficial;
    this.discografica = discografica;
    }
    
    //getters y setters
    public String getGenero() {
    return genero;
    }
    public void setGenero(String genero) {
    this.genero = genero;
    }
    public int getAnioOficial() {
    return anioOficial;
    }
    
    public void setAnioOficial(int anioOficial) {
    this.anioOficial = anioOficial;
    }
    
    public String getDiscografica() {
    return discografica;
    }
    
    public void setDiscografica(String discografica) {
    this.discografica = discografica;
    }
    
    //toString
    @Override
    public String toString() {
    return "Musico [genero=" + genero + ", anioOficial=" + anioOficial + ", discografica=" + discografica + "]";
    }
    }
    

