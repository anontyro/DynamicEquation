/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartequation;

import java.util.Map;

/**
 *
 * @author Alex
 */
public class SmartEquation {
    private String equName = "";
    private String equation ="";

    
    public SmartEquation(String equName, String equation){
        this.equName = equName;
        this.equation = equation;
    }
    
    public String getEquation(){
        return equation;
    }
    
    public String getName(){
        return equName;
    }
    
    public void setEquation(String equation){
        this.equation = equation;
    }
    
    public void setName(String equName){
        this.equName = equName;
    }
    
    /**
     * Main logic class that will pull the equation input and convert it's 
     * values into the map to be used later
     */
    public void equationTOmap(){
        
    }
    
    

    
}
