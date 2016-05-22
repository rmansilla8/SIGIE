/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoInt;


import java.util.List;
import modelo.AreaCurricular;

/**
 *
 * @author Roberto
 */
public interface AreaInt {
    public List<AreaCurricular> listaarea();      
    public void CreateArea(AreaCurricular area);    
    public void UpdateArea(AreaCurricular area);
    public void DeleteArea(AreaCurricular area);  
}
