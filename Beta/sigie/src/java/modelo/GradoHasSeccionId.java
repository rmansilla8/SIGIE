package modelo;
// Generated 19/05/2016 10:06:57 PM by Hibernate Tools 4.3.1



/**
 * GradoHasSeccionId generated by hbm2java
 */
public class GradoHasSeccionId  implements java.io.Serializable {


     private int gradoIdgrado;
     private int seccionIdseccion;
     private int areaCurricularIdareaCurricular;
     private int nivelEducativoIdnivelEducativo;

    public GradoHasSeccionId() {
    }

    public GradoHasSeccionId(int gradoIdgrado, int seccionIdseccion, int areaCurricularIdareaCurricular, int nivelEducativoIdnivelEducativo) {
       this.gradoIdgrado = gradoIdgrado;
       this.seccionIdseccion = seccionIdseccion;
       this.areaCurricularIdareaCurricular = areaCurricularIdareaCurricular;
       this.nivelEducativoIdnivelEducativo = nivelEducativoIdnivelEducativo;
    }
   
    public int getGradoIdgrado() {
        return this.gradoIdgrado;
    }
    
    public void setGradoIdgrado(int gradoIdgrado) {
        this.gradoIdgrado = gradoIdgrado;
    }
    public int getSeccionIdseccion() {
        return this.seccionIdseccion;
    }
    
    public void setSeccionIdseccion(int seccionIdseccion) {
        this.seccionIdseccion = seccionIdseccion;
    }
    public int getAreaCurricularIdareaCurricular() {
        return this.areaCurricularIdareaCurricular;
    }
    
    public void setAreaCurricularIdareaCurricular(int areaCurricularIdareaCurricular) {
        this.areaCurricularIdareaCurricular = areaCurricularIdareaCurricular;
    }
    public int getNivelEducativoIdnivelEducativo() {
        return this.nivelEducativoIdnivelEducativo;
    }
    
    public void setNivelEducativoIdnivelEducativo(int nivelEducativoIdnivelEducativo) {
        this.nivelEducativoIdnivelEducativo = nivelEducativoIdnivelEducativo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof GradoHasSeccionId) ) return false;
		 GradoHasSeccionId castOther = ( GradoHasSeccionId ) other; 
         
		 return (this.getGradoIdgrado()==castOther.getGradoIdgrado())
 && (this.getSeccionIdseccion()==castOther.getSeccionIdseccion())
 && (this.getAreaCurricularIdareaCurricular()==castOther.getAreaCurricularIdareaCurricular())
 && (this.getNivelEducativoIdnivelEducativo()==castOther.getNivelEducativoIdnivelEducativo());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getGradoIdgrado();
         result = 37 * result + this.getSeccionIdseccion();
         result = 37 * result + this.getAreaCurricularIdareaCurricular();
         result = 37 * result + this.getNivelEducativoIdnivelEducativo();
         return result;
   }   


}

