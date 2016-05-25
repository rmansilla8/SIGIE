/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImp;

import daoInt.RolInt;
import java.util.List;
import modelo.Rol;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author sparta
 */
public class RolImp  implements RolInt{

    @Override
    public List<Rol> listaRol() {
      List<Rol> lista=null;
      Session ses = HibernateUtil.getSessionFactory().openSession();
      Transaction ts = ses.beginTransaction();
      String hql ="from Rol";
      
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
    
}
