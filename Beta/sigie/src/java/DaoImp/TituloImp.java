/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImp;

import DaoInt.TituloInt;
import modelo.Titulo;
import org.hibernate.Session;

/**
 *
 * @author sparta
 */
public class TituloImp implements TituloInt {

    @Override
    public boolean insert(Session ses, Titulo titulo) throws Exception {
    ses.save(titulo);
    return true;
    }
    
}
