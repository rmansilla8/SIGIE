/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoInt;

import modelo.DatoProfesion;
import org.hibernate.Session;

/**
 *
 * @author sparta
 */
public interface DatoProfesionInt {
   public boolean insert(Session ses, DatoProfesion datoprofesion)throws Exception;
}
