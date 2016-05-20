package beans;

import daoImp.PersonaImp;
import daoInt.PersonaInt;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelo.Persona;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

@ManagedBean
@ViewScoped
public class UserBean {

    Session ses = null;
    Transaction ts = null;
    private Persona persona;
    private String dpi;

    public UserBean() {
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    //metdo para agregar los datos de las personar por medio de un dialogo
    public void agregarPersonas(String dpi) {
        this.ses = null;
        this.ts = null;

        try {
            this.ses = HibernateUtil.getSessionFactory().openSession();
            PersonaInt pInt = new PersonaImp();
            this.ts = this.ses.beginTransaction();

//            obtener los datos de las personar en la variable persona  creada arriba
            this.persona = pInt.findByDPI(this.ses, dpi);
            this.ts.commit();

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto ", "Se agregao Correctamente "));

        } catch (Exception e) {
            if (this.ts != null) {
                System.out.println(e.getMessage());
                this.ts.rollback();
            }
        }  finally {
            if(this.ses!=null){
            this.ses.close();
            }
        }       
        
    }

}
