package modelo;
// Generated 24/05/2016 11:12:06 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * AreaCurricular generated by hbm2java
 */
public class AreaCurricular  implements java.io.Serializable {


     private Integer idareaCurricular;
     private String nombreArea;
     private Set<GradoHasSeccion> gradoHasSeccions = new HashSet<GradoHasSeccion>(0);
     private Set<CicloHasGrado> cicloHasGrados = new HashSet<CicloHasGrado>(0);

    public AreaCurricular() {
    }

	
    public AreaCurricular(String nombreArea) {
        this.nombreArea = nombreArea;
    }
    public AreaCurricular(String nombreArea, Set<GradoHasSeccion> gradoHasSeccions, Set<CicloHasGrado> cicloHasGrados) {
       this.nombreArea = nombreArea;
       this.gradoHasSeccions = gradoHasSeccions;
       this.cicloHasGrados = cicloHasGrados;
    }
   
    public Integer getIdareaCurricular() {
        return this.idareaCurricular;
    }
    
    public void setIdareaCurricular(Integer idareaCurricular) {
        this.idareaCurricular = idareaCurricular;
    }
    public String getNombreArea() {
        return this.nombreArea;
    }
    
    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }
    public Set<GradoHasSeccion> getGradoHasSeccions() {
        return this.gradoHasSeccions;
    }
    
    public void setGradoHasSeccions(Set<GradoHasSeccion> gradoHasSeccions) {
        this.gradoHasSeccions = gradoHasSeccions;
    }
    public Set<CicloHasGrado> getCicloHasGrados() {
        return this.cicloHasGrados;
    }
    
    public void setCicloHasGrados(Set<CicloHasGrado> cicloHasGrados) {
        this.cicloHasGrados = cicloHasGrados;
    }




}


