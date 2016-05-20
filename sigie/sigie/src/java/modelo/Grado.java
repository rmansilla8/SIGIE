package modelo;
// Generated 3/04/2016 12:08:23 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Grado generated by hbm2java
 */
@Entity
@Table(name="grado"
    ,catalog="sigie"
)
public class Grado  implements java.io.Serializable {


     private int idgrado;
     private char grado;
     private Set notases = new HashSet(0);
     private Set areaCurriculars = new HashSet(0);

    public Grado() {
    }

	
    public Grado(int idgrado, char grado) {
        this.idgrado = idgrado;
        this.grado = grado;
    }
    public Grado(int idgrado, char grado, Set notases, Set areaCurriculars) {
       this.idgrado = idgrado;
       this.grado = grado;
       this.notases = notases;
       this.areaCurriculars = areaCurriculars;
    }
   
     @Id 

    
    @Column(name="idgrado", unique=true, nullable=false)
    public int getIdgrado() {
        return this.idgrado;
    }
    
    public void setIdgrado(int idgrado) {
        this.idgrado = idgrado;
    }

    
    @Column(name="grado", nullable=false, length=1)
    public char getGrado() {
        return this.grado;
    }
    
    public void setGrado(char grado) {
        this.grado = grado;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="grado")
    public Set getNotases() {
        return this.notases;
    }
    
    public void setNotases(Set notases) {
        this.notases = notases;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="grado")
    public Set getAreaCurriculars() {
        return this.areaCurriculars;
    }
    
    public void setAreaCurriculars(Set areaCurriculars) {
        this.areaCurriculars = areaCurriculars;
    }




}


