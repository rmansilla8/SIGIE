package modelo;
// Generated 3/04/2016 12:08:23 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name="usuario"
    ,catalog="sigie"
)
public class Usuario  implements java.io.Serializable {


     private String idUsuario;
     private Personal personal;
     private String contrasena;
     private String rol;

    public Usuario() {
    }

    public Usuario(String idUsuario, Personal personal, String contrasena, String rol) {
       this.idUsuario = idUsuario;
       this.personal = personal;
       this.contrasena = contrasena;
       this.rol = rol;
    }
   
     @Id 

    
    @Column(name="idUsuario", unique=true, nullable=false, length=10)
    public String getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Personal_DPI", nullable=false)
    public Personal getPersonal() {
        return this.personal;
    }
    
    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    
    @Column(name="Contrase�a", nullable=false, length=45)
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    
    @Column(name="Rol", nullable=false, length=45)
    public String getRol() {
        return this.rol;
    }
    
    public void setRol(String rol) {
        this.rol = rol;
    }




}


