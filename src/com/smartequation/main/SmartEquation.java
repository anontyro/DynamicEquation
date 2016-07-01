/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartequation.main;

import java.util.*;

/**
 * the core class for the smartEquation that will contain all the central methods
 * the idea is the user will be able to input an equation and the problem will
 * pull it apart ask for input for each variable and then preform the equation
 * with an output.
 * @author Alex
 */
public class SmartEquation {
    private String equName = "";
    private String equation ="";
    private ArrayList<Character>whatToFind = new ArrayList<>();

/**
 * 
 * @param equName
 * @param equation 
 */    
    public SmartEquation(String equName, String equation){
        this.equName = equName;
        this.equation = equation;
        symbolsToFind();
    }

/**
 * 
 * @param equation 
 */    
    public SmartEquation(String equation){
        this.equName = equation;
        this.equName = "Standard Equation";
    }

/**
 * 
 * @return 
 */    
    public String getEquation(){
        return equation;
    }

/**
 * 
 * @return 
 */    
    public String getName(){
        return equName;
    }

/**
 * 
 * @param equation 
 */    
    public void setEquation(String equation){
        this.equation = equation;
    }

/**
 * 
 * @param equName 
 */    
    public void setName(String equName){
        this.equName = equName;
    }
    
/**
 * Main logic class that will pull the equation input and convert it's 
 * values into the map to be used later
 */
    public void equationTOmap(){
        String input = getEquation();
        input = input.replaceAll("[\\s =]", "");
        
        for(int i = 0; i < input.length();i++){
            SmartMap.addSymbol(input.substring(i, i+1), 0);
            
        }
        System.out.println(input);
        
        
    }
    
/**
 * creates an ArrayList<Character> to find all of the values before the equals sign
 * and puts them into the list, Called in the constructor
 * @return 
 */    
    private ArrayList<Character> symbolsToFind(){
        //ArrayList<String>whatToFind = new ArrayList<>();
        int x = 0;
        
        while(equation.charAt(x)!='='){ 
           whatToFind.add(equation.charAt(x));  
           x++;
        }
        
        return whatToFind;
    }
    
/**
 * is used to create a String that will show all the values before the equals sign
 * in the equation
 * @return String of symbols before the equals sign
 */    
    public String getSymbolsToFind(){
        String output = "";
        for(Character x:whatToFind){
            output+= x + "\n";
        }
        
        return output;
    }
    
    public String computeEquation(){
        String result = "";
        String startOFequation = getEquation();
        String bodyOFequation= getEquation();
        
        
        
        return result;
    }
    
/**
 * This method allows the user to assign values for the letters in the equation
 * any int exception is caught in the code itself and returns a zero value
 */    
    public void assignVars(){
        Scanner input = new Scanner(System.in);
        int valToAdd = 0;
        for(String x:SmartMap.symbolsList){
            
            
            System.out.println("Enter a value for " + x + ": ");
            String userValue = input.nextLine();
            try{
                valToAdd = Integer.parseInt(userValue);
            }
            catch(IllegalArgumentException e){
                System.err.println(e);
            }
            finally{
                SmartMap.symbolsMap.put(x, 0);
            }
            
            SmartMap.symbolsMap.put(x, (int)valToAdd);
            
        }
        
        System.out.println(SmartMap.makeString());
    }
    
    

    
}
