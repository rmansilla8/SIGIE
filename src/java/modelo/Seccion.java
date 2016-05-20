package modelo;
// Generated 18/04/2016 12:26:36 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Seccion generated by hbm2java
 */
public class Seccion  implements java.io.Serializable {


     private Integer idseccion;
     private char NSeccion;
     private Set<Grado> grados = new HashSet<Grado>(0);
     private Set<CicloHasGrado> cicloHasGrados = new HashSet<CicloHasGrado>(0);

    public Seccion() {
    }

	
    public Seccion(char NSeccion) {
        this.NSeccion = NSeccion;
    }
    public Seccion(char NSeccion, Set<Grado> grados, Set<CicloHasGrado> cicloHasGrados) {
       this.NSeccion = NSeccion;
       this.grados = grados;
       this.cicloHasGrados = cicloHasGrados;
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
    public Set<Grado> getGrados() {
        return this.grados;
    }
    
    public void setGrados(Set<Grado> grados) {
        this.grados = grados;
    }
    public Set<CicloHasGrado> getCicloHasGrados() {
        return this.cicloHasGrados;
    }
    
    public void setCicloHasGrados(Set<CicloHasGrado> cicloHasGrados) {
        this.cicloHasGrados = cicloHasGrados;
    }




}


