package modelo;
// Generated 24/05/2016 11:12:06 PM by Hibernate Tools 4.3.1



/**
 * Titulo generated by hbm2java
 */
public class Titulo  implements java.io.Serializable {


     private int registrotitulo;
     private Empleado empleado;
     private String aniograduacion;
     private String profesion;

    public Titulo() {
    }

    public Titulo(int registrotitulo, Empleado empleado, String aniograduacion, String profesion) {
       this.registrotitulo = registrotitulo;
       this.empleado = empleado;
       this.aniograduacion = aniograduacion;
       this.profesion = profesion;
    }
   
    public int getRegistrotitulo() {
        return this.registrotitulo;
    }
    
    public void setRegistrotitulo(int registrotitulo) {
        this.registrotitulo = registrotitulo;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public String getAniograduacion() {
        return this.aniograduacion;
    }
    
    public void setAniograduacion(String aniograduacion) {
        this.aniograduacion = aniograduacion;
    }
    public String getProfesion() {
        return this.profesion;
    }
    
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }




}


