import java.util.*;
public class Carrera{
    private String codigo;
    private String nombre;
    private String telefono;
    private Integer numSemestres;
    private Integer numCreditos;
    private String titulo;
    private String director;
    Date fechaini;
    
    public Carrera()
    {
        this.codigo="015";
        this.nombre="Ingeniería de Sistemas";
        this.numSemestres=10;
        this.numCreditos=150;
        this.titulo="Ingeniero de Sistemas";
        this.director="Oscar Gallardo";
        this.fechaini= new java.util.Date();
    }
    
    public Carrera(String codigo,String nombre,Integer numsem,Integer numcreditos,String titulo,String director,
    Date fechaini){
        this.codigo= codigo;
        this.nombre= nombre;
        this.telefono= telefono;
        this.numSemestres= numSemestres;
        this.numCreditos= numCreditos;
        this.titulo= titulo;
        this.director= director;
        this.fechaini= fechaini;
    }
    //getters
    public String getNombre(){
        return nombre;
    }    
    public String getCodigo(){
        return codigo;
    }    
    public String getTelefono(){
        return telefono;
    }    
    public Integer getNumCreditos(){
        return numCreditos;
    }
    public Integer getNumSemestres(){
        return numSemestres;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getDirector(){
        return director;
    }    
    public Date getFechaInicial(){
        return fechaini;
    }    
    //setters
    public void setCodigo(String codigo){
        this.codigo= codigo;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void setTelefono(String telefono){
        this.telefono= telefono;
    }
    public void setNumeroSemestres(Integer numSemestres){
        this.numSemestres= numSemestres;
    }
    public void setNumeroCreditos(Integer numCreditos){
        this.numCreditos= numCreditos;
    }
    public void setTitulo(String titulo){
        this.titulo= titulo;
    }
    public void setDirector(String director){
        this.director= director;
    }
    public void setFechaInicial(Date fechaini){
        this.fechaini= fechaini;
    }
    
    public void imprimirCreditos(){
        System.out.println("Los creditos de la carrera so:" +getNumCreditos());
    }
}
    
