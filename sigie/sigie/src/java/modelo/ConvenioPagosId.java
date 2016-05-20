package modelo;
// Generated 3/04/2016 12:08:23 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ConvenioPagosId generated by hbm2java
 */
@Embeddable
public class ConvenioPagosId  implements java.io.Serializable {


     private int idConvenioPagos;
     private int encargadoDpiEncargado;

    public ConvenioPagosId() {
    }

    public ConvenioPagosId(int idConvenioPagos, int encargadoDpiEncargado) {
       this.idConvenioPagos = idConvenioPagos;
       this.encargadoDpiEncargado = encargadoDpiEncargado;
    }
   


    @Column(name="idConvenio_pagos", nullable=false)
    public int getIdConvenioPagos() {
        return this.idConvenioPagos;
    }
    
    public void setIdConvenioPagos(int idConvenioPagos) {
        this.idConvenioPagos = idConvenioPagos;
    }


    @Column(name="Encargado_Dpi_encargado", nullable=false)
    public int getEncargadoDpiEncargado() {
        return this.encargadoDpiEncargado;
    }
    
    public void setEncargadoDpiEncargado(int encargadoDpiEncargado) {
        this.encargadoDpiEncargado = encargadoDpiEncargado;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ConvenioPagosId) ) return false;
		 ConvenioPagosId castOther = ( ConvenioPagosId ) other; 
         
		 return (this.getIdConvenioPagos()==castOther.getIdConvenioPagos())
 && (this.getEncargadoDpiEncargado()==castOther.getEncargadoDpiEncargado());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdConvenioPagos();
         result = 37 * result + this.getEncargadoDpiEncargado();
         return result;
   }   


}


