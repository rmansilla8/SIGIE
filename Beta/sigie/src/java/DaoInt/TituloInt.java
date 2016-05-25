/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoInt;

import modelo.Titulo;
import org.hibernate.Session;

/**
 *
 * @author sparta
 */
public interface TituloInt {
 public boolean insert(Session ses, Titulo titulo )throws Exception;  
    
}
