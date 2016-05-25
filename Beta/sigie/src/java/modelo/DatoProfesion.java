package modelo;
// Generated 24/05/2016 11:12:06 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * DatoProfesion generated by hbm2java
 */
public class DatoProfesion  implements java.io.Serializable {


     private int idprofesion;
     private Empleado empleado;
     private Integer igss;
     private Date inicioLabores;

    public DatoProfesion() {
    }

	
    public DatoProfesion(int idprofesion, Empleado empleado) {
        this.idprofesion = idprofesion;
        this.empleado = empleado;
    }
    public DatoProfesion(int idprofesion, Empleado empleado, Integer igss, Date inicioLabores) {
       this.idprofesion = idprofesion;
       this.empleado = empleado;
       this.igss = igss;
       this.inicioLabores = inicioLabores;
    }
   
    public int getIdprofesion() {
        return this.idprofesion;
    }
    
    public void setIdprofesion(int idprofesion) {
        this.idprofesion = idprofesion;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
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




}


