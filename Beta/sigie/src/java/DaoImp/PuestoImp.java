/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImp;

import DaoInt.PuestoInt;
import java.util.List;
import modelo.Puesto;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author sparta
 */
public class PuestoImp implements PuestoInt {

    @Override
    public List<Puesto> showpuesto() {
    List<Puesto> listaP= null;
      Session ses = HibernateUtil.getSessionFactory().openSession();
      Transaction ts = ses.beginTransaction();
      String hql= "From Puesto";
      
        try {
            listaP = ses.createQuery(hql).list();
            ts.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ts.rollback();
        }
        finally{
        ses.close();
        }
        
        return listaP;
    }
    
}
