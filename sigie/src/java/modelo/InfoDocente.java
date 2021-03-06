package modelo;
// Generated 3/04/2016 12:08:23 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * InfoDocente generated by hbm2java
 */
@Entity
@Table(name="info_docente"
    ,catalog="sigie"
)
public class InfoDocente  implements java.io.Serializable {


     private String cedulaDocente;
     private Personal personal;
     private Date fechaEmision;
     private String registroEscalafonario;
     private Character claseEscalafonaria;
     private Date fechaDeAscenso;

    public InfoDocente() {
    }

	
    public InfoDocente(String cedulaDocente, Personal personal) {
        this.cedulaDocente = cedulaDocente;
        this.personal = personal;
    }
    public InfoDocente(String cedulaDocente, Personal personal, Date fechaEmision, String registroEscalafonario, Character claseEscalafonaria, Date fechaDeAscenso) {
       this.cedulaDocente = cedulaDocente;
       this.personal = personal;
       this.fechaEmision = fechaEmision;
       this.registroEscalafonario = registroEscalafonario;
       this.claseEscalafonaria = claseEscalafonaria;
       this.fechaDeAscenso = fechaDeAscenso;
    }
   
     @Id 

    
    @Column(name="CedulaDocente", unique=true, nullable=false, length=12)
    public String getCedulaDocente() {
        return this.cedulaDocente;
    }
    
    public void setCedulaDocente(String cedulaDocente) {
        this.cedulaDocente = cedulaDocente;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Personal_DPI", nullable=false)
    public Personal getPersonal() {
        return this.personal;
    }
    
    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Fecha_emision", length=10)
    public Date getFechaEmision() {
        return this.fechaEmision;
    }
    
    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    
    @Column(name="Registro_escalafonario", length=12)
    public String getRegistroEscalafonario() {
        return this.registroEscalafonario;
    }
    
    public void setRegistroEscalafonario(String registroEscalafonario) {
        this.registroEscalafonario = registroEscalafonario;
    }

    
    @Column(name="Clase_escalafonaria", length=1)
    public Character getClaseEscalafonaria() {
        return this.claseEscalafonaria;
    }
    
    public void setClaseEscalafonaria(Character claseEscalafonaria) {
        this.claseEscalafonaria = claseEscalafonaria;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Fecha_de_ascenso", length=10)
    public Date getFechaDeAscenso() {
        return this.fechaDeAscenso;
    }
    
    public void setFechaDeAscenso(Date fechaDeAscenso) {
        this.fechaDeAscenso = fechaDeAscenso;
    }




}


