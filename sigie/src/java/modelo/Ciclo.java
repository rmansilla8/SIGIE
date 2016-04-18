package modelo;
// Generated 18/04/2016 12:26:36 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ciclo generated by hbm2java
 */
public class Ciclo  implements java.io.Serializable {


     private Integer idciclo;
     private Date anio;
     private Set<CicloHasGrado> cicloHasGrados = new HashSet<CicloHasGrado>(0);
     private Set<Historial> historials = new HashSet<Historial>(0);

    public Ciclo() {
    }

	
    public Ciclo(Date anio) {
        this.anio = anio;
    }
    public Ciclo(Date anio, Set<CicloHasGrado> cicloHasGrados, Set<Historial> historials) {
       this.anio = anio;
       this.cicloHasGrados = cicloHasGrados;
       this.historials = historials;
    }
   
    public Integer getIdciclo() {
        return this.idciclo;
    }
    
    public void setIdciclo(Integer idciclo) {
        this.idciclo = idciclo;
    }
    public Date getAnio() {
        return this.anio;
    }
    
    public void setAnio(Date anio) {
        this.anio = anio;
    }
    public Set<CicloHasGrado> getCicloHasGrados() {
        return this.cicloHasGrados;
    }
    
    public void setCicloHasGrados(Set<CicloHasGrado> cicloHasGrados) {
        this.cicloHasGrados = cicloHasGrados;
    }
    public Set<Historial> getHistorials() {
        return this.historials;
    }
    
    public void setHistorials(Set<Historial> historials) {
        this.historials = historials;
    }




}

