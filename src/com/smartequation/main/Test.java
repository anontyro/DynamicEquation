/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartequation.main;

/**
 *
 * @author Alex
 *
public class Test {
    
    public static void main(String[]args){
        SmartEquation equation = new SmartEquation("Voltage","V = IE");
        
        equation.equationTOmap();
        System.out.println(SmartMap.makeString());
        
    }
    
}
* 
*/ 
