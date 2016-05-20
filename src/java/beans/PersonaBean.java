/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import daoImp.PersonaImp;
import daoInt.PersonaInt;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Persona;


@ManagedBean(name = "perBean")
@ViewScoped
public class PersonaBean {
   
    private List<Persona> lista;
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

    public List<Persona> getLista() {
        PersonaInt intPer = new PersonaImp();
        lista = intPer.listapersona();
        return lista;
    }
    
    
    public void newPersona(){
    PersonaInt intPer = new PersonaImp();
    intPer.CreatePersona(persona);
    persona =new Persona();
    }
        
    public void actualizarPersona(){
    PersonaInt intPer = new PersonaImp();
    intPer.UpdatePersona(persona);
    persona =new Persona();
    }
    
    public void eliminarPersona(){
    PersonaInt intPer = new PersonaImp();
    intPer.DeletePersona(persona);
    persona =new Persona();
    }
}
