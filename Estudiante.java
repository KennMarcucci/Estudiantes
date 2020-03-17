import java.util.*;
public class Estudiante{
    private String nombre;
    private String codigo;
    private String telefono;
    private String email;
    private String direccion;
    private Integer edad;
    private String documento;
    private String tipoDocumento;
    private Integer creditos;
    private Integer semestre;
    private String estado;

    private Carrera carrera;
    
    public Estudiante()
    {
        this.codigo= "0151803";
        this.nombre= "Claudia Gómez";
        this.telefono= "3112490070";
        this.email= "claudiaygomez@ufps.edu.co";
        this.direccion= "Av 17 Libertadores";
        this.edad= 34;
        this.documento= "37391391";
        this.tipoDocumento= "cc";
        this.creditos= 120;
        this.semestre= 20;
        this.estado= "Activo";
        this.carrera= new Carrera();
    }
    
    public Estudiante(String nombre, String codigo, String telefono,
    String email, String direccion, Integer edad,
    String documento, String tipoDocumento,
    Integer creditos, Integer semestre, 
    String estado, Carrera carrera){
        this.nombre= nombre;
        this.codigo= codigo;
        this.telefono= telefono;
        this.email= email;
        this.direccion= direccion;
        this.edad= edad;
        this.documento= documento;
        this.tipoDocumento= tipoDocumento;
        this.creditos= creditos;
        this.semestre= semestre;
        this.estado= estado;
        this.carrera= carrera;
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

    public String getEmail(){
        return email;
    }

    public String getDireccion(){
        return direccion;
    }

    public Integer getEdad(){
        return edad;
    }

    public String getDocumento(){
        return documento;
    }    

    public String getTipoDocumento(){
        return tipoDocumento;
    }    

    public Integer getCreditos(){
        return creditos;
    }    

    public Integer getSemestre(){
        return semestre;
    }    

    public String getEstado(){
        return estado;
    }    

    public Carrera getCarrera(){
        return carrera;
    }
    //setters
    public void setNombre(String nombre){
        this.nombre= nombre;
    }    

    public void setCodigo(String codigo){
        this.codigo= codigo;
    }    

    public void setTelefono(String telefono){
        this.telefono= telefono;
    }    

    public void setEmail(String email){
        this.email= email;
    }

    public void setDireccion(String direccion){
        this.direccion= direccion;
    }

    public void setEdad(Integer edad){
        this.edad= edad;
    }

    public void setDocumento(String documento){
        this.documento= documento;
    }    

    public void setTipoDocumento(String tipoDocumento){
        this.tipoDocumento= tipoDocumento;
    }    

    public void setCreditos(Integer creditos){
        this.creditos= creditos;
    }    

    public void setSemestre(Integer semestre){
        this.semestre= semestre;
    }    

    public void setEstado(String estado){
        this.estado= estado;
    }    

    public void setCarrera(Carrera carrera){
        this.carrera= carrera;
    }

    public void CalcularMayorEdad(){
        if(getEdad()>=18){
            System.out.println("El estudiante es mayor de edad");
        }
        else{
            System.out.println("El estudiante es menor de edad");
        }
    }

    public void totalCreditos(){
        if(getCreditos()>=carrera.getNumCreditos()){
            System.out.println("El estudiante ha cursado: "+getCreditos());
            System.out.println("La carrera tiene: "+carrera.getNumCreditos());
            System.out.println("Estás a un paso de ser: "+carrera.getTitulo());
        }
        else{
            System.out.println("El estudiante ha cursado: "+getCreditos());
            System.out.println("La carrera tiene: "+carrera.getNumCreditos());
            System.out.println("El que persevera alcanza");
        }
    }

     public void matricularProyecto(){
        if(getCreditos()>=(carrera.getNumCreditos()*0.7)&&getSemestre()>=7)
        {
            System.out.println("Señor estudiante usted ya puede matricular proyecto de grado");}

        else
            System.out.println("No puedes matricular poryecto de grado te faltan creditos y semestres por cursar");
    }
    
    public void promedioCreditosSemestre(){    
        Float promedio=(float)(getCreditos()/getSemestre());
        System.out.println("El promedio de creditos cursados es: "+promedio);    
    }

    public void actualizarEstado(){
        if (getSemestre()>=carrera.getNumSemestres()*2){
            this.estado ="PFU";
        }
        System.out.println("Los semestres cursados son: " + getSemestre());
        System.out.println("Los semestres cursados son: " +carrera.getNumSemestres());
    }
}

/* Metodos: •Calcular si el estudiante es mayor de edad.
 * •Matricular proyecto de grado, el estudiante debe haber aprobado el 70%
 *  de creditos y estar en 7 semestre o superior.
 * •Obtener el promedio de creditos por semestre.
 * •Mostrar si el estudiante curso el total de creditos de la carrera.
 * •El estudiante puede tener el estado: Matriculado, PFU, 
 */