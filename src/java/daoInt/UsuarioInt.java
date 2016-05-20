
package daoInt;

import java.util.List;
import modelo.Persona;
import modelo.Rol;
import modelo.Usuario;

/**
 *
 * @author sparta
 */
public interface UsuarioInt {
     
    public List<Usuario> findAllUser();
    public void createUser(Usuario user);
      
//   metodo para ingresar los roles
    
    public List<Rol> listaRol();
    public List<Persona> listapersona();
}
