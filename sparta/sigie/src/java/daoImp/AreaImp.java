/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImp;
import daoInt.AreaInt;
import java.util.List;
import modelo.AreaCurricular;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Roberto
 */
public class AreaImp implements AreaInt{

    @Override
    public List<AreaCurricular> listaarea() {
        List<AreaCurricular> listaarea=null;
        Session ses = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = ses.beginTransaction();
        String hql="from AreaCurricular";
         
        
        try {
            listaarea =ses.createQuery(hql).list();
            ts.commit();
            ses.close();
        } catch (Exception e) {
             System.out.println(e.getMessage());
             ts.rollback();
        }
        
        return listaarea;
   
    }

    @Override
    public void CreateArea(AreaCurricular areacurricular) {
    Session ses = null;
     
        try {
            ses = HibernateUtil.getSessionFactory().openSession();
            ses.beginTransaction();
            ses.save(areacurricular);
            ses.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ses.getTransaction().rollback();
        }finally{
        if(ses!=null){
        ses.close();
        }
        }
    }

    @Override
    public void UpdateArea(AreaCurricular areacurricular) {
        Session ses = null;
     
        try {
            ses = HibernateUtil.getSessionFactory().openSession();
            ses.beginTransaction();
            ses.update(areacurricular);
            ses.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ses.getTransaction().rollback();
        }finally{
        if(ses!=null){
        ses.close();
        }
        }
    }

    @Override
    public void DeleteArea(AreaCurricular areacurricular) {
       Session ses = null;
     
        try {
            ses = HibernateUtil.getSessionFactory().openSession();
            ses.beginTransaction();
            ses.delete(areacurricular);
            ses.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ses.getTransaction().rollback();
        }finally{
        if(ses!=null){
        ses.close();
        }
    }
        
    }
}
    
   
    

 

