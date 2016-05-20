
package beans;

import daoImp.LoginImp;
import daoInt.LoginInt;
import java.awt.event.ActionEvent;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import modelo.Usuario;
import org.primefaces.context.RequestContext;


@ManagedBean
@SessionScoped
public class LoginBean {
   
    private Usuario usuario;
    private String nombreUser;;
    private String password;
    
    public LoginBean() {
        usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public void login(ActionEvent event) {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message = null;
        boolean loggedIn = false;
        String ruta = "";

        LoginInt daoInt = new LoginImp();
        this.usuario = daoInt.login (this.usuario);

        if (this.usuario != null) {
            loggedIn = true;
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenid@", this.usuario.getNombreUser());
            ruta = "/sigie/faces/view/Bienvenido.xhtml";
        } else {
            loggedIn = false; 
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Error de Acesso", "Usuario y/o Password es  incorrecta");
            this.usuario = new Usuario();
 
        }

        FacesContext.getCurrentInstance().addMessage(null, message);
        context.addCallbackParam("loggedIn", loggedIn);
        context.addCallbackParam("ruta", ruta);
 
    }

    public String cerrarSesion() {
        this.nombreUser = null;
        this.password = null;
        
        HttpSession httpsession = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        httpsession.invalidate();
        return "/login";
    }  
  
    
}  
