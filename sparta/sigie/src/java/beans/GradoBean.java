/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import daoImp.GradoImp;
import daoImp.PersonaImp;
import daoInt.GradoInt;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import modelo.Grado;

/**
 *
 * @author Roberto
 */
@ManagedBean(name = "GraBean")
@RequestScoped
public class GradoBean {

     List<Grado> listarGrado;
    private Grado grado;
    
    public GradoBean() {
       grado = new Grado();
    }

    public List<Grado> getListarGrado() {
        return listarGrado;
    }

    public void setListarGrado(List<Grado> listarGrado) {
        this.listarGrado = listarGrado;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }
    
    //    metodo para guardar 
    public void guardarGrado(ActionEvent ActionEvent) {
        GradoInt gdao = new GradoImp();
        gdao.CreateGrado(grado);
        mensage("Operacion Exitosa");
        limpiar();
    }
    
    //     metodo para actualizar 
    public void ActualizarGrado(ActionEvent ActionEvent) {
        GradoInt gdao = new GradoImp();
        gdao.UpdateGrado(grado);
        mensage("Se a Actualizado correctamente ");
        limpiar();
    }
     public void EliminarPersona(ActionEvent ActionEvent) {
        GradoInt gdao = new GradoImp();
        gdao.DeleteGrado(grado);
        mensage("Operacion exitosa");
        limpiar();
      }
     
     
     
     public void limpiar() {
       grado.setNombreGrado("");

    }

    public void mensage(String summary) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
