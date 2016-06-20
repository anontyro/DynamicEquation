/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartequation;

import java.util.*;

/**
 *
 * @author Alex
 */
public class SmartMap extends SmartEquation{
    
    public SmartMap(String equName, String equation){
        super(equName,equation);
    }
    
    public static Map<String,Integer> symEquation = new HashMap<String,Integer>(10);
    
    
    public static void addSymbol(String letterEquation, int value){
       symEquation.put(letterEquation, value);
    }
    
    public static void addSymbol(String letterEquation){
        int value = 0;
        symEquation.put(letterEquation, value);
    }
    
    public static int getValue(String letterEquation){
        
        return symEquation.get(letterEquation);
        
    }
    
    public static void setNewValue(String letterEquation, int value){
        if(symEquation.containsKey(letterEquation)){
            symEquation.replace(letterEquation, value);
        }
        else{
            System.err.println("Key not found");
        }
    }
    
    public static Collection getMap(){
        return symEquation.values();
    }
    
    
    
    
}
