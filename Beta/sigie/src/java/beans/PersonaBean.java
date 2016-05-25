/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import daoImp.PersonaImp;
import daoInt.PersonaInt;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelo.Persona;

/**
 *
 * @author sparta
 */
@ManagedBean(name = "perBean")
@ViewScoped
public class PersonaBean {

    List<Persona> listarPersona;
    private Persona persona;

    public PersonaBean() {
        persona = new Persona();
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getListarPersona() {

        PersonaInt perInt = new PersonaImp();
        listarPersona = perInt.listapersona();
        return listarPersona;
    }

//    metodo para guardar 
    public void guardarPersona(ActionEvent ActionEvent) {
        PersonaInt pdao = new PersonaImp();
        pdao.CreatePersona(persona);
        mensage("Operacion Exitosa");
        limpiar();
    }

//     metodo para actualizar 
    public void ActualizarPersona(ActionEvent ActionEvent) {
        PersonaInt pdao = new PersonaImp();
        pdao.UpdatePersona(persona);
        mensage("Se a Actualizado correctamente ");
        limpiar();
    }

    public void EliminarPersona(ActionEvent ActionEvent) {
        PersonaInt pdao = new PersonaImp();
        pdao.DeletePersona(persona);
        mensage("Operacion exitosa");
        limpiar();
    }

    public void limpiar() {
        persona.setCui("");
        persona.setNombre("");
        persona.setApellidos("");
        persona.setResidencia("");

    }

    public void mensage(String summary) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

}
