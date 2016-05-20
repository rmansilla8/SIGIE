/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import daoImp.AreaImp;
import daoInt.AreaInt;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelo.AreaCurricular;

/**
 *
 * @author Roberto
 */
@ManagedBean(name = "areaBean")
@ViewScoped
public class AreaCurricularBean {

  List<AreaCurricular> listarArea;
    private AreaCurricular area;
    
    public AreaCurricularBean() {
        area = new AreaCurricular();
    }

    public List<AreaCurricular> getListarArea() {
        return listarArea;
    }

    public void setListarArea(List<AreaCurricular> listarArea) {
        this.listarArea = listarArea;
    }

    public AreaCurricular getArea() {
        return area;
    }

    public void setArea(AreaCurricular area) {
        this.area = area;
    }
    
     //    metodo para guardar 
    public void guardarArea(ActionEvent ActionEvent) {
        AreaInt adao = new AreaImp();
        adao.CreateArea(area);
        mensage("Operacion Exitosa");
        limpiar();
    }
    
    public void ActualizarArea(ActionEvent ActionEvent) {
        AreaInt adao = new AreaImp();
        adao.UpdateArea(area);
        mensage("Operacion Exitosa");
        limpiar();
}
 
    public void EliminarArea(ActionEvent ActionEvent) {
        AreaInt adao = new AreaImp();
        adao.DeleteArea(area);
        mensage("Operacion Exitosa");
        limpiar();
    }
    
     public void limpiar() {
       area.setNombreArea("");

    }

    public void mensage(String summary) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    
}
