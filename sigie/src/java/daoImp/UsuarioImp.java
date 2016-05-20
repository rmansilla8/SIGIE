
package daoImp;

import daoInt.UsuarioInt;
import modelo.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;


public class UsuarioImp implements UsuarioInt{

    @Override
    public Usuario obtenerDatosPorUsuario(Usuario usuario) {
      Session ses = HibernateUtil.getSessionFactory().openSession();
        String hql = " FROM Usuario  where username = :usename";
        Query q = ses.createQuery(hql);
        q.setParameter("username", usuario.getNombreUser());

        return (Usuario) q.uniqueResult(); 
    }

    @Override
    public Usuario logi(Usuario usuario) {
        Usuario user = this.obtenerDatosPorUsuario(usuario);

        if (user != null) {
            if (!user.getPassword().equals(usuario.getPassword())) {
                user = null;
            }
        }
        return user;
    }
    
}
