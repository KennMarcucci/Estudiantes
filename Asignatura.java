
public class Asignatura{
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Asignatura(String codigo, String nombre, Profesor profesor){
        this.codigo=codigo;
        this.nombre=nombre;
        this.profesor=profesor;
    }
}