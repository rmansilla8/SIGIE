/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoInt;

import modelo.Persona;
import org.hibernate.Session;

/**
 *
 * @author sparta
 */
public interface PersonaInt {
//    metodo para guardar en registro en la tabla de personas
    public boolean InsertPersona(Session ses, Persona persona)throws Exception;   
    
}