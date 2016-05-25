/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImp;

import DaoInt.EmpleadoInt;
import modelo.Empleado;
import org.hibernate.Session;

/**
 *
 * @author sparta
 */
public class EmpleadoImp implements EmpleadoInt {

    @Override
    public boolean insert(Session ses, Empleado empleado) throws Exception {
    ses.save(empleado);
    return true;
    }
    
}
