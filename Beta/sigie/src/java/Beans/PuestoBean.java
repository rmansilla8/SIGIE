/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import DaoImp.DatoProfesionImp;
import DaoImp.EmpleadoImp;
import DaoImp.InfoDocenteImp;
import DaoImp.PersonaImp;
import DaoImp.PuestoImp;
import DaoImp.TituloImp;
import DaoInt.DatoProfesionInt;
import DaoInt.EmpleadoInt;
import DaoInt.InfoDocenteInt;
import DaoInt.PersonaInt;
import DaoInt.PuestoInt;
import DaoInt.TituloInt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import modelo.Puesto;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import modelo.DatoProfesion;
import modelo.Empleado;
import modelo.InfoDocente;
import modelo.Persona;
import modelo.Titulo;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

@ManagedBean(name = "pstBean")
@ViewScoped
public class PuestoBean {

    Session ses = null;
    Transaction ts = null;

    private Puesto puesto;
    private List<SelectItem> listaPuesto;

    private Empleado empleado;
    private Persona persona;
    private Titulo titulo;
    private InfoDocente infodocente;
    private DatoProfesion datosprofesion;

    public PuestoBean() {
        persona = new Persona();
        puesto = new Puesto();
        empleado = new Empleado();
        titulo = new Titulo();
        infodocente = new InfoDocente();
        datosprofesion = new DatoProfesion();
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public InfoDocente getInfodocente() {
        return infodocente;
    }

    public void setInfodocente(InfoDocente infodocente) {
        this.infodocente = infodocente;
    }

    public DatoProfesion getDatosprofesion() {
        return datosprofesion;
    }

    public void setDatosprofesion(DatoProfesion datosprofesion) {
        this.datosprofesion = datosprofesion;
    }
    
    

    public void setListaPuesto(List<SelectItem> listaPuesto) {
        this.listaPuesto = listaPuesto;
    }

    public List<SelectItem> getListaPuesto() {
        this.listaPuesto = new ArrayList<SelectItem>();
        PuestoInt PInt = new PuestoImp();
        List<Puesto> pu = PInt.showpuesto();
        listaPuesto.clear();

        for (Puesto puesto : pu) {
            SelectItem PuestoItem = new SelectItem(puesto.getIdpuesto(), puesto.getCargo());
            this.listaPuesto.add(PuestoItem);

        }
        return listaPuesto;
    }

    public void guardar() {
        this.ses = null;
        this.ts = null;

        try {
            this.ses = HibernateUtil.getSessionFactory().openSession();

            PersonaInt perInt = new PersonaImp();
            PuestoInt puInt = new PuestoImp();
            EmpleadoInt EInt = new EmpleadoImp();
            TituloInt T = new TituloImp();
            InfoDocenteInt infod = new InfoDocenteImp();
            DatoProfesionInt dp = new DatoProfesionImp();
            this.ts = ses.beginTransaction();

            perInt.insert(this.ses, this.persona);
            this.persona = perInt.getByKey(ses, persona.getCui());

            empleado.setPersona(this.persona);
            empleado.setPuesto(puesto);
            EInt.insert(ses, empleado);
            
            titulo.setEmpleado(empleado);
            T.insert(ses, titulo);
            
            infodocente.setEmpleado(empleado);
            infod.insert(ses, infodocente);
            
            datosprofesion.setEmpleado(empleado);
            dp.insert(ses, datosprofesion);

            this.ts.commit();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "correcto", "Realizado"));
            this.limpiar();
        } catch (Exception e) {

            if (this.ts != null) {
                ts.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", e.getMessage()));
        } finally {
            if (this.ses != null) {
                ses.close();
            }

        }

    }

    public void limpiar() {

        this.puesto = new Puesto();
        this.persona = new Persona();
        this.empleado = new Empleado();
    }

}
