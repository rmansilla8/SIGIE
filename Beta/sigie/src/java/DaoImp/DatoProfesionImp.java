/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImp;

import DaoInt.DatoProfesionInt;
import modelo.DatoProfesion;
import org.hibernate.Session;

/**
 *
 * @author sparta
 */
public class DatoProfesionImp  implements DatoProfesionInt {

    @Override
    public boolean insert(Session ses, DatoProfesion datoprofesion) throws Exception {
    ses.save(datoprofesion);
    return true;
    }
    
}
