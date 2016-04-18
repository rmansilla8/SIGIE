package modelo;
// Generated 18/04/2016 12:26:36 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Puesto generated by hbm2java
 */
public class Puesto  implements java.io.Serializable {


     private Integer idpuesto;
     private Empleado empleado;
     private String puesto;
     private Set<Historial> historials = new HashSet<Historial>(0);

    public Puesto() {
    }

	
    public Puesto(Empleado empleado) {
        this.empleado = empleado;
    }
    public Puesto(Empleado empleado, String puesto, Set<Historial> historials) {
       this.empleado = empleado;
       this.puesto = puesto;
       this.historials = historials;
    }
   
    public Integer getIdpuesto() {
        return this.idpuesto;
    }
    
    public void setIdpuesto(Integer idpuesto) {
        this.idpuesto = idpuesto;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public String getPuesto() {
        return this.puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public Set<Historial> getHistorials() {
        return this.historials;
    }
    
    public void setHistorials(Set<Historial> historials) {
        this.historials = historials;
    }




}

