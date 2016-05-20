/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImp;

import daoInt.PersonaInt;
import java.util.List;
import modelo.Persona;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author sparta
 */
public class PersonaImp implements PersonaInt {

    @Override
    public List<Persona> listapersona() {
     List<Persona> listarpersona=null;
        Session ses = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = ses.beginTransaction();
        String hql="from Persona";
         
        
        try {
            listarpersona =ses.createQuery(hql).list();
            ts.commit();
            ses.close();
        } catch (Exception e) {
             System.out.println(e.getMessage());
             ts.rollback();
        }
        
        return listarpersona;
    }

    @Override
    public void CreatePersona(Persona persona) {
    Session ses = null;
     
        try {
            ses = HibernateUtil.getSessionFactory().openSession();
            ses.beginTransaction();
            ses.save(persona);
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
    public void UpdatePersona(Persona persona) {
    Session ses = null;
     
        try {
            ses = HibernateUtil.getSessionFactory().openSession();
            ses.beginTransaction();
            ses.update(persona);
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
    public void DeletePersona(Persona persona) {
       Session ses = null;
     
        try {
            ses = HibernateUtil.getSessionFactory().openSession();
            ses.beginTransaction();
            ses.delete(persona);
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
