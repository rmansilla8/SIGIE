/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImp;

import daoInt.PersonaInt;
import modelo.Persona;
import org.hibernate.Session;

/**
 *
 * @author sparta
 */
public class PersonaImp implements PersonaInt {

    @Override
    public boolean InsertPersona(Session ses, Persona persona) throws Exception {
    ses.save(persona);
    return true;
    }
    
}
