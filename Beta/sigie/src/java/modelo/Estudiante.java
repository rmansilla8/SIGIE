package modelo;
// Generated 19/05/2016 10:06:57 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Estudiante generated by hbm2java
 */
public class Estudiante  implements java.io.Serializable {


     private int idestudiante;
     private Persona persona;
     private String lugarNacimiento;
     private Date fechaNacimiento;
     private Integer edad;
     private Set<Encargado> encargados = new HashSet<Encargado>(0);
     private Set<Historial> historials = new HashSet<Historial>(0);
     private Set<Alergias> alergiases = new HashSet<Alergias>(0);
     private Set<Notas> notases = new HashSet<Notas>(0);

    public Estudiante() {
    }

	
    public Estudiante(int idestudiante, Persona persona, String lugarNacimiento) {
        this.idestudiante = idestudiante;
        this.persona = persona;
        this.lugarNacimiento = lugarNacimiento;
    }
    public Estudiante(int idestudiante, Persona persona, String lugarNacimiento, Date fechaNacimiento, Integer edad, Set<Encargado> encargados, Set<Historial> historials, Set<Alergias> alergiases, Set<Notas> notases) {
       this.idestudiante = idestudiante;
       this.persona = persona;
       this.lugarNacimiento = lugarNacimiento;
       this.fechaNacimiento = fechaNacimiento;
       this.edad = edad;
       this.encargados = encargados;
       this.historials = historials;
       this.alergiases = alergiases;
       this.notases = notases;
    }
   
    public int getIdestudiante() {
        return this.idestudiante;
    }
    
    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public String getLugarNacimiento() {
        return this.lugarNacimiento;
    }
    
    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Integer getEdad() {
        return this.edad;
    }
    
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public Set<Encargado> getEncargados() {
        return this.encargados;
    }
    
    public void setEncargados(Set<Encargado> encargados) {
        this.encargados = encargados;
    }
    public Set<Historial> getHistorials() {
        return this.historials;
    }
    
    public void setHistorials(Set<Historial> historials) {
        this.historials = historials;
    }
    public Set<Alergias> getAlergiases() {
        return this.alergiases;
    }
    
    public void setAlergiases(Set<Alergias> alergiases) {
        this.alergiases = alergiases;
    }
    public Set<Notas> getNotases() {
        return this.notases;
    }
    
    public void setNotases(Set<Notas> notases) {
        this.notases = notases;
    }




}


