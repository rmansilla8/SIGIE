package modelo;
// Generated 24/05/2016 11:12:06 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Encargado generated by hbm2java
 */
public class Encargado  implements java.io.Serializable {


     private Integer idencargado;
     private Persona persona;
     private String nombretrabajo;
     private String relacionestudiante;
     private Set<Estudiante> estudiantes = new HashSet<Estudiante>(0);

    public Encargado() {
    }

	
    public Encargado(Persona persona, String nombretrabajo, String relacionestudiante) {
        this.persona = persona;
        this.nombretrabajo = nombretrabajo;
        this.relacionestudiante = relacionestudiante;
    }
    public Encargado(Persona persona, String nombretrabajo, String relacionestudiante, Set<Estudiante> estudiantes) {
       this.persona = persona;
       this.nombretrabajo = nombretrabajo;
       this.relacionestudiante = relacionestudiante;
       this.estudiantes = estudiantes;
    }
   
    public Integer getIdencargado() {
        return this.idencargado;
    }
    
    public void setIdencargado(Integer idencargado) {
        this.idencargado = idencargado;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public String getNombretrabajo() {
        return this.nombretrabajo;
    }
    
    public void setNombretrabajo(String nombretrabajo) {
        this.nombretrabajo = nombretrabajo;
    }
    public String getRelacionestudiante() {
        return this.relacionestudiante;
    }
    
    public void setRelacionestudiante(String relacionestudiante) {
        this.relacionestudiante = relacionestudiante;
    }
    public Set<Estudiante> getEstudiantes() {
        return this.estudiantes;
    }
    
    public void setEstudiantes(Set<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }




}


