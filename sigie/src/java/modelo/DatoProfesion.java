package modelo;
// Generated 18/04/2016 12:26:36 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * DatoProfesion generated by hbm2java
 */
public class DatoProfesion  implements java.io.Serializable {


     private int idprofesion;
     private Integer igss;
     private Date inicioLabores;
     private Set<Empleado> empleados = new HashSet<Empleado>(0);

    public DatoProfesion() {
    }

	
    public DatoProfesion(int idprofesion) {
        this.idprofesion = idprofesion;
    }
    public DatoProfesion(int idprofesion, Integer igss, Date inicioLabores, Set<Empleado> empleados) {
       this.idprofesion = idprofesion;
       this.igss = igss;
       this.inicioLabores = inicioLabores;
       this.empleados = empleados;
    }
   
    public int getIdprofesion() {
        return this.idprofesion;
    }
    
    public void setIdprofesion(int idprofesion) {
        this.idprofesion = idprofesion;
    }
    public Integer getIgss() {
        return this.igss;
    }
    
    public void setIgss(Integer igss) {
        this.igss = igss;
    }
    public Date getInicioLabores() {
        return this.inicioLabores;
    }
    
    public void setInicioLabores(Date inicioLabores) {
        this.inicioLabores = inicioLabores;
    }
    public Set<Empleado> getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }




}


