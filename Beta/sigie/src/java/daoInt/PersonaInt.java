/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoInt;

import java.util.List;
import modelo.Persona;
import org.hibernate.Session;

/**
 *
 * @author sparta
 */
public interface PersonaInt {
    public boolean insert(Session ses, Persona persona )throws Exception;  
    public boolean update(Session ses, Persona persona )throws Exception;  
    public boolean delete(Session ses, Persona persona )throws Exception;  
    
    
    public List<Persona> getAll(Session ses)throws Exception; 
    public Persona getUtimoRegistro(Session ses)throws Exception;
    public Persona getByKey(Session ses, String dpi)throws Exception;
    
}
