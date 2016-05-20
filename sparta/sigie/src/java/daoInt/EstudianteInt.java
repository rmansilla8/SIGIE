/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoInt;

import modelo.Estudiante;
import org.hibernate.Session;

/**
 *
 * @author sparta
 */
public interface EstudianteInt {
    
    public boolean insertEstudiante( Session ses, Estudiante estudiante)throws Exception;
    
}
