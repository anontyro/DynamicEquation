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
    
    public static Map<String,Integer>equationMap;
    
}
