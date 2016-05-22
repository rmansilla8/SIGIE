/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImp;

import daoInt.GradoInt;
import java.util.List;
import modelo.Grado;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Roberto
 */
public class GradoImp implements GradoInt {
        @Override
    public List<Grado> listagrado() {
     List<Grado> listagrado=null;
        Session ses = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = ses.beginTransaction();
        String hql="from Grado";
         
        
        try {
            listagrado =ses.createQuery(hql).list();
            ts.commit();
            ses.close();
        } catch (Exception e) {
             System.out.println(e.getMessage());
             ts.rollback();
        }
        
        return listagrado;
    }

    @Override
    public void CreateGrado(Grado grado) {
    Session ses = null;
     
        try {
            ses = HibernateUtil.getSessionFactory().openSession();
            ses.beginTransaction();
            ses.save(grado);
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
    public void UpdateGrado(Grado grado) {
    Session ses = null;
     
        try {
            ses = HibernateUtil.getSessionFactory().openSession();
            ses.beginTransaction();
            ses.update(grado);
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
    public void DeleteGrado(Grado grado) {
       Session ses = null;
     
        try {
            ses = HibernateUtil.getSessionFactory().openSession();
            ses.beginTransaction();
            ses.delete(grado);
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
