/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImp;

import daoInt.UsuarioInt;
import java.util.List;
import modelo.Usuario;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author sparta
 */
public class UsuarioImp implements UsuarioInt{

    @Override
    public List<Usuario> mostrarUsuarios() {
    List<Usuario> lista=null;
      Session ses = HibernateUtil.getSessionFactory().openSession();
      Transaction ts = ses.beginTransaction();
      String hql ="from Usuario as u inner join fetch u.rol let join fetch u.persona";
      
        try {            
            lista= ses.createQuery(hql).list();
            ts.commit();
            ses.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ts.rollback();
        }
        return lista;
      
      
      
    }

    @Override
    public boolean CreateUser(Session ses, Usuario usuario) throws Exception {
      ses.save(usuario);
      return true;
    }

    @Override
    public void UpdateUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeleteUsuario(Usuario usuario) {        
      Session ses = null;
        try {
            ses =HibernateUtil.getSessionFactory().openSession();
            ses.beginTransaction();
            ses.delete(usuario);
            ses.getTransaction().commit();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ses.getTransaction().rollback();
        }
        finally{        
        if(ses!=null){
        ses.close();
        }
        } 
    
    }

    
    
    
  
}
