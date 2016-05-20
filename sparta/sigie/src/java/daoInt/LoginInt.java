/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoInt;


import modelo.Usuario;

/**
 *
 * @author sparta
 */
public interface LoginInt {    
    public Usuario obtenerDatosPorUsuario(Usuario usuario);
    public Usuario login(Usuario usuario);   
  
    
}
