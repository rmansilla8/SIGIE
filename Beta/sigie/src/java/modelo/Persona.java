package modelo;
// Generated 24/05/2016 11:12:06 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Persona generated by hbm2java
 */
public class Persona  implements java.io.Serializable {


     private String cui;
     private String nombre;
     private String apellidos;
     private String residencia;
     private Set<Empleado> empleados = new HashSet<Empleado>(0);
     private Set<Encargado> encargados = new HashSet<Encargado>(0);
     private Set<Estudiante> estudiantes = new HashSet<Estudiante>(0);

    public Persona() {
    }

	
    public Persona(String cui, String nombre, String apellidos, String residencia) {
        this.cui = cui;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.residencia = residencia;
    }
    public Persona(String cui, String nombre, String apellidos, String residencia, Set<Empleado> empleados, Set<Encargado> encargados, Set<Estudiante> estudiantes) {
       this.cui = cui;
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.residencia = residencia;
       this.empleados = empleados;
       this.encargados = encargados;
       this.estudiantes = estudiantes;
    }
   
    public String getCui() {
        return this.cui;
    }
    
    public void setCui(String cui) {
        this.cui = cui;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getResidencia() {
        return this.residencia;
    }
    
    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }
    public Set<Empleado> getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }
    public Set<Encargado> getEncargados() {
        return this.encargados;
    }
    
    public void setEncargados(Set<Encargado> encargados) {
        this.encargados = encargados;
    }
    public Set<Estudiante> getEstudiantes() {
        return this.estudiantes;
    }
    
    public void setEstudiantes(Set<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }




}


