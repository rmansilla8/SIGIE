/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoInt;

import java.util.List;
import modelo.Grado;


/**
 *
 * @author Roberto
 */
public interface GradoInt {
    public List<Grado> listagrado();      
    public void CreateGrado(Grado grado);    
    public void UpdateGrado(Grado grado);
    public void DeleteGrado(Grado grado);  
    
}
