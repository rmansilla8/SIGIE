package modelo;
// Generated 24/05/2016 11:12:06 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Seccion generated by hbm2java
 */
public class Seccion  implements java.io.Serializable {


     private Integer idseccion;
     private char NSeccion;
     private Set<CicloHasGrado> cicloHasGrados = new HashSet<CicloHasGrado>(0);
     private Set<GradoHasSeccion> gradoHasSeccions = new HashSet<GradoHasSeccion>(0);

    public Seccion() {
    }

	
    public Seccion(char NSeccion) {
        this.NSeccion = NSeccion;
    }
    public Seccion(char NSeccion, Set<CicloHasGrado> cicloHasGrados, Set<GradoHasSeccion> gradoHasSeccions) {
       this.NSeccion = NSeccion;
       this.cicloHasGrados = cicloHasGrados;
       this.gradoHasSeccions = gradoHasSeccions;
    }
   
    public Integer getIdseccion() {
        return this.idseccion;
    }
    
    public void setIdseccion(Integer idseccion) {
        this.idseccion = idseccion;
    }
    public char getNSeccion() {
        return this.NSeccion;
    }
    
    public void setNSeccion(char NSeccion) {
        this.NSeccion = NSeccion;
    }
    public Set<CicloHasGrado> getCicloHasGrados() {
        return this.cicloHasGrados;
    }
    
    public void setCicloHasGrados(Set<CicloHasGrado> cicloHasGrados) {
        this.cicloHasGrados = cicloHasGrados;
    }
    public Set<GradoHasSeccion> getGradoHasSeccions() {
        return this.gradoHasSeccions;
    }
    
    public void setGradoHasSeccions(Set<GradoHasSeccion> gradoHasSeccions) {
        this.gradoHasSeccions = gradoHasSeccions;
    }




}


