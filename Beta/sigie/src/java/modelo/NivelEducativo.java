package modelo;
// Generated 19/05/2016 10:06:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * NivelEducativo generated by hbm2java
 */
public class NivelEducativo  implements java.io.Serializable {


     private int idnivelEducativo;
     private String nombreNivel;
     private Set<GradoHasSeccion> gradoHasSeccions = new HashSet<GradoHasSeccion>(0);

    public NivelEducativo() {
    }

	
    public NivelEducativo(int idnivelEducativo) {
        this.idnivelEducativo = idnivelEducativo;
    }
    public NivelEducativo(int idnivelEducativo, String nombreNivel, Set<GradoHasSeccion> gradoHasSeccions) {
       this.idnivelEducativo = idnivelEducativo;
       this.nombreNivel = nombreNivel;
       this.gradoHasSeccions = gradoHasSeccions;
    }
   
    public int getIdnivelEducativo() {
        return this.idnivelEducativo;
    }
    
    public void setIdnivelEducativo(int idnivelEducativo) {
        this.idnivelEducativo = idnivelEducativo;
    }
    public String getNombreNivel() {
        return this.nombreNivel;
    }
    
    public void setNombreNivel(String nombreNivel) {
        this.nombreNivel = nombreNivel;
    }
    public Set<GradoHasSeccion> getGradoHasSeccions() {
        return this.gradoHasSeccions;
    }
    
    public void setGradoHasSeccions(Set<GradoHasSeccion> gradoHasSeccions) {
        this.gradoHasSeccions = gradoHasSeccions;
    }




}

