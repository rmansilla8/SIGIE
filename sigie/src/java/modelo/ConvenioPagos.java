package modelo;
// Generated 3/04/2016 12:08:23 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ConvenioPagos generated by hbm2java
 */
@Entity
@Table(name="convenio_pagos"
    ,catalog="sigie"
)
public class ConvenioPagos  implements java.io.Serializable {


     private ConvenioPagosId id;
     private Encargado encargado;
     private Estudiante estudiante;
     private Date fechaConvenio;

    public ConvenioPagos() {
    }

	
    public ConvenioPagos(ConvenioPagosId id, Encargado encargado, Estudiante estudiante) {
        this.id = id;
        this.encargado = encargado;
        this.estudiante = estudiante;
    }
    public ConvenioPagos(ConvenioPagosId id, Encargado encargado, Estudiante estudiante, Date fechaConvenio) {
       this.id = id;
       this.encargado = encargado;
       this.estudiante = estudiante;
       this.fechaConvenio = fechaConvenio;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idConvenioPagos", column=@Column(name="idConvenio_pagos", nullable=false) ), 
        @AttributeOverride(name="encargadoDpiEncargado", column=@Column(name="Encargado_Dpi_encargado", nullable=false) ) } )
    public ConvenioPagosId getId() {
        return this.id;
    }
    
    public void setId(ConvenioPagosId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Encargado_Dpi_encargado", nullable=false, insertable=false, updatable=false)
    public Encargado getEncargado() {
        return this.encargado;
    }
    
    public void setEncargado(Encargado encargado) {
        this.encargado = encargado;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Estudiante_idEstudiante", nullable=false)
    public Estudiante getEstudiante() {
        return this.estudiante;
    }
    
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fecha_convenio", length=10)
    public Date getFechaConvenio() {
        return this.fechaConvenio;
    }
    
    public void setFechaConvenio(Date fechaConvenio) {
        this.fechaConvenio = fechaConvenio;
    }




}

