/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import daoImp.PersonaImp;
import daoImp.UsuarioImp;
import daoInt.PersonaInt;
import daoInt.UsuarioInt;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import modelo.Persona;
import modelo.Rol;
import modelo.Usuario;


/**
 *
 * @author sparta
 */
@ManagedBean(name = "usuBean")
@ViewScoped
public class UsuarioBean {

    private List<Usuario> listaUsuario;
    private Usuario usuario;

    private List<SelectItem> listaRol;
    private List<SelectItem> listapersona;

    public UsuarioBean() {
        usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getListaUsuario() {
        UsuarioInt daoInt = new UsuarioImp();
        listaUsuario =daoInt.findAllUser();
        return listaUsuario;
    }

    public List<SelectItem> getListaRol() {
        this.listaRol = new ArrayList<SelectItem>();
        UsuarioInt daoInt = new UsuarioImp();
        List<Rol> r = daoInt.listaRol();
        listaRol.clear();
        
        for (Rol rol : r) {
            SelectItem rolesItem = new SelectItem(rol.getIdrol(),   rol.getRolUsuario());
            this.listaRol.add(rolesItem);            
        }
        
        return listaRol;
    }
    
    public List<SelectItem> getListaPersona() {
        this.listapersona = new ArrayList<SelectItem>();
        UsuarioInt daoInt = new UsuarioImp();
        List<Persona> r = daoInt.listapersona();
        listapersona.clear();
        
        for (Persona per : r) {
            SelectItem rolesItem = new SelectItem(per.getDpi(),   per.getNombre());
            this.listapersona.add(rolesItem);            
        }
        
        return listapersona;
    }
    

    public void crearUser(){
    UsuarioInt pdao = new UsuarioImp();
    pdao.createUser(usuario);
    mensage("Operacion Exitosa");
    
    
    }

    public void mensage ( String summary ){
    FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO , summary, null);
    FacesContext.getCurrentInstance().addMessage(null, msg);
    }

}
