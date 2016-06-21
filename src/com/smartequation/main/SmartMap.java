/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartequation.main;

import java.util.*;

/**
 *
 * @author Alex
 */
public class SmartMap extends SmartEquation{
    
    public SmartMap(String equName, String equation){
        super(equName,equation);
    }
    
    public static Map<String,Integer> symbolsMap = new HashMap<String,Integer>(10);
    public static ArrayList<String> symbolsList = new ArrayList<>(10);
    
    
    public static void addSymbol(String letterEquation, int value){
       symbolsMap.put(letterEquation, value);
       symbolsList.add(letterEquation);
    }
    
    public static void addSymbol(String letterEquation){
        int value = 0;
        symbolsMap.put(letterEquation, value);
        symbolsList.add(letterEquation);
    }
    
    public static int getValue(String letterEquation){
        
        return symbolsMap.get(letterEquation);
        
    }
    
    public static void setNewValue(String letterEquation, int value){
        if(symbolsMap.containsKey(letterEquation)){
            symbolsMap.replace(letterEquation, value);
        }
        else{
            System.err.println("Key not found");
        }
    }
    
    public static Collection getMap(){
        return symbolsMap.values();
    }
    
    public static String makeString(){
        return symbolsMap.toString() + "\n" + symbolsList.toString();
        
    }
    
    
    
}
