/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImp;

import daoInt.UsuarioInt;
import java.util.List;
import modelo.Persona;
import modelo.Rol;
import modelo.Usuario;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author sparta
 */
public class UsuarioImp implements UsuarioInt {

    @Override
    public List<Usuario> findAllUser() {
        List<Usuario> listarUsuario = null;
        Session ses = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = ses.beginTransaction();
        String hql = "From Usuario u  inner join fetch u.rol";

        try {
            listarUsuario = ses.createQuery(hql).list();
            ts.commit();
            ses.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ts.rollback();
        }

        return listarUsuario;
    }

    @Override
    public List<Rol> listaRol() {
        List<Rol> listarRol = null;
        Session ses = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = ses.beginTransaction();
        String hql = "From Rol";

        try {
            listarRol = ses.createQuery(hql).list();
            ts.commit();
            ses.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ts.rollback();
        }

        return listarRol;
    }

    @Override
    public void createUser(Usuario user) {
        Session ses = null;

        try {
            ses = HibernateUtil.getSessionFactory().openSession();
            ses.beginTransaction();
            ses.save(user);
            ses.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ses.getTransaction().rollback();
        } finally {
            if (ses != null) {
                ses.close();
            }
        }
    }

    @Override
    public List<Persona> listapersona() {
     List<Persona> listarPersona = null;
        Session ses = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = ses.beginTransaction();
        String hql = "From Persona";

        try {
            listarPersona = ses.createQuery(hql).list();
            ts.commit();
            ses.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ts.rollback();
        }

        return listarPersona; 
    }
    
    
    

}
