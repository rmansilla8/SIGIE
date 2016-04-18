package modelo;
// Generated 18/04/2016 12:26:36 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Empleado generated by hbm2java
 */
public class Empleado  implements java.io.Serializable {


     private Integer idempleado;
     private DatoProfesion datoProfesion;
     private Persona persona;
     private Titulo titulo;
     private Set<Puesto> puestos = new HashSet<Puesto>(0);
     private Set<Usuario> usuarios = new HashSet<Usuario>(0);
     private Set<InfoDocente> infoDocentes = new HashSet<InfoDocente>(0);

    public Empleado() {
    }

	
    public Empleado(DatoProfesion datoProfesion, Persona persona, Titulo titulo) {
        this.datoProfesion = datoProfesion;
        this.persona = persona;
        this.titulo = titulo;
    }
    public Empleado(DatoProfesion datoProfesion, Persona persona, Titulo titulo, Set<Puesto> puestos, Set<Usuario> usuarios, Set<InfoDocente> infoDocentes) {
       this.datoProfesion = datoProfesion;
       this.persona = persona;
       this.titulo = titulo;
       this.puestos = puestos;
       this.usuarios = usuarios;
       this.infoDocentes = infoDocentes;
    }
   
    public Integer getIdempleado() {
        return this.idempleado;
    }
    
    public void setIdempleado(Integer idempleado) {
        this.idempleado = idempleado;
    }
    public DatoProfesion getDatoProfesion() {
        return this.datoProfesion;
    }
    
    public void setDatoProfesion(DatoProfesion datoProfesion) {
        this.datoProfesion = datoProfesion;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public Titulo getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }
    public Set<Puesto> getPuestos() {
        return this.puestos;
    }
    
    public void setPuestos(Set<Puesto> puestos) {
        this.puestos = puestos;
    }
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public Set<InfoDocente> getInfoDocentes() {
        return this.infoDocentes;
    }
    
    public void setInfoDocentes(Set<InfoDocente> infoDocentes) {
        this.infoDocentes = infoDocentes;
    }




}

