package modelo;
// Generated 18/04/2016 12:26:36 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Notas generated by hbm2java
 */
public class Notas  implements java.io.Serializable {


     private Integer idbnota;
     private Promedio promedio;
     private String nota;
     private String bimestre;
     private Set<CicloHasGrado> cicloHasGrados = new HashSet<CicloHasGrado>(0);

    public Notas() {
    }

	
    public Notas(Promedio promedio, String nota, String bimestre) {
        this.promedio = promedio;
        this.nota = nota;
        this.bimestre = bimestre;
    }
    public Notas(Promedio promedio, String nota, String bimestre, Set<CicloHasGrado> cicloHasGrados) {
       this.promedio = promedio;
       this.nota = nota;
       this.bimestre = bimestre;
       this.cicloHasGrados = cicloHasGrados;
    }
   
    public Integer getIdbnota() {
        return this.idbnota;
    }
    
    public void setIdbnota(Integer idbnota) {
        this.idbnota = idbnota;
    }
    public Promedio getPromedio() {
        return this.promedio;
    }
    
    public void setPromedio(Promedio promedio) {
        this.promedio = promedio;
    }
    public String getNota() {
        return this.nota;
    }
    
    public void setNota(String nota) {
        this.nota = nota;
    }
    public String getBimestre() {
        return this.bimestre;
    }
    
    public void setBimestre(String bimestre) {
        this.bimestre = bimestre;
    }
    public Set<CicloHasGrado> getCicloHasGrados() {
        return this.cicloHasGrados;
    }
    
    public void setCicloHasGrados(Set<CicloHasGrado> cicloHasGrados) {
        this.cicloHasGrados = cicloHasGrados;
    }




}


