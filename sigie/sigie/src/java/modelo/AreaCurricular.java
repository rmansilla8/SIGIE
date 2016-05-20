package modelo;
// Generated 3/04/2016 12:08:23 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * AreaCurricular generated by hbm2java
 */
@Entity
@Table(name="area_curricular"
    ,catalog="sigie"
)
public class AreaCurricular  implements java.io.Serializable {


     private int idAreaCurricular;
     private Grado grado;
     private String nombreArea;
     private Set notases = new HashSet(0);

    public AreaCurricular() {
    }

	
    public AreaCurricular(int idAreaCurricular, Grado grado, String nombreArea) {
        this.idAreaCurricular = idAreaCurricular;
        this.grado = grado;
        this.nombreArea = nombreArea;
    }
    public AreaCurricular(int idAreaCurricular, Grado grado, String nombreArea, Set notases) {
       this.idAreaCurricular = idAreaCurricular;
       this.grado = grado;
       this.nombreArea = nombreArea;
       this.notases = notases;
    }
   
     @Id 

    
    @Column(name="idArea_curricular", unique=true, nullable=false)
    public int getIdAreaCurricular() {
        return this.idAreaCurricular;
    }
    
    public void setIdAreaCurricular(int idAreaCurricular) {
        this.idAreaCurricular = idAreaCurricular;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="grado_idgrado", nullable=false)
    public Grado getGrado() {
        return this.grado;
    }
    
    public void setGrado(Grado grado) {
        this.grado = grado;
    }

    
    @Column(name="nombre_area", nullable=false, length=45)
    public String getNombreArea() {
        return this.nombreArea;
    }
    
    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="areaCurricular")
    public Set getNotases() {
        return this.notases;
    }
    
    public void setNotases(Set notases) {
        this.notases = notases;
    }




}


