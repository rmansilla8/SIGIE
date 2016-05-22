/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoInt;

import java.util.List;
import modelo.Usuario;
import org.hibernate.Session;

/**
 *
 * @author sparta
 */
public interface UsuarioInt {
    public List<Usuario> mostrarUsuarios(); 
    public void UpdateUsuario(Usuario usuario);
    public void DeleteUsuario(Usuario usuario);
    public boolean CreateUser(Session ses, Usuario usuario)throws Exception;
    
    
    
}
