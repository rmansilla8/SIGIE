/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImp;

import DaoInt.PersonaInt;
import java.util.List;
import modelo.Persona;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author sparta
 */
public class PersonaImp implements PersonaInt{

    @Override
    public boolean insert(Session ses, Persona persona) throws Exception {
     ses.save(persona);
     return true;
    }
    
     @Override
    public boolean update(Session ses, Persona persona) throws Exception {
    ses.update(persona);
     return true;
    }

    @Override
    public boolean delete(Session ses, Persona persona) throws Exception {
   ses.delete(persona);
     return true;
    }
    

    @Override
    public Persona getUtimoRegistro(Session ses) throws Exception {
    String hql ="from Persona Order by cui desc";
        Query query=ses.createQuery(hql).setMaxResults(+1);
        
        return (Persona) query.uniqueResult();
    }

    @Override
    public Persona getByKey(Session ses, String cui) throws Exception {
      String hql ="from Persona where cui = :cui";
        Query query=ses.createQuery(hql);
        query.setParameter("cui", cui);
        
        return  (Persona) query.uniqueResult();
    }

    @Override
    public List<Persona> getAll(Session ses) throws Exception {
    return ses.createCriteria(Persona.class).list();
    }
    
}
