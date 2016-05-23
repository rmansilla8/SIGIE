package modelo;
// Generated 19/05/2016 10:06:57 PM by Hibernate Tools 4.3.1



/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idtable1;
     private Persona persona;
     private Rol rol;
     private String nombreUser;
     private String password;

    public Usuario() {
    }

	
    public Usuario(Persona persona, Rol rol) {
        this.persona = persona;
        this.rol = rol;
    }
    public Usuario(Persona persona, Rol rol, String nombreUser, String password) {
       this.persona = persona;
       this.rol = rol;
       this.nombreUser = nombreUser;
       this.password = password;
    }
   
    public Integer getIdtable1() {
        return this.idtable1;
    }
    
    public void setIdtable1(Integer idtable1) {
        this.idtable1 = idtable1;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public Rol getRol() {
        return this.rol;
    }
    
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    public String getNombreUser() {
        return this.nombreUser;
    }
    
    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}

