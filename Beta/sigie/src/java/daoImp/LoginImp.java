package daoImp;

import daoInt.LoginInt;
import modelo.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

public class LoginImp implements LoginInt {

    @Override
    public Usuario obtenerDatosPorUsuario(Usuario usuario) {
        Session ses = HibernateUtil.getSessionFactory().openSession();
        String hql = " FROM Usuario  WHERE nombreUser =:nombreUser";
        Query q = ses.createQuery(hql);
        q.setParameter("nombreUser", usuario.getNombreUser());

        return (Usuario) q.uniqueResult();
    }

    @Override
    public Usuario login(Usuario usuario) {
        Usuario user = this.obtenerDatosPorUsuario(usuario);

        if (user != null) {
            if (!user.getPassword().equals(usuario.getPassword())) {
                user = null;
            }
        }
        return user;
    }

    
    

}