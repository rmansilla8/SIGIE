package modelo;
// Generated 19/05/2016 10:06:57 PM by Hibernate Tools 4.3.1



/**
 * Telefono generated by hbm2java
 */
public class Telefono  implements java.io.Serializable {


     private int noTelefono;
     private Persona persona;
     private String descripcion;

    public Telefono() {
    }

    public Telefono(int noTelefono, Persona persona, String descripcion) {
       this.noTelefono = noTelefono;
       this.persona = persona;
       this.descripcion = descripcion;
    }
   
    public int getNoTelefono() {
        return this.noTelefono;
    }
    
    public void setNoTelefono(int noTelefono) {
        this.noTelefono = noTelefono;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}


