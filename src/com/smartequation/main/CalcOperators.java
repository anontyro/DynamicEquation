/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartequation.main;

/**
 *
 * @author Alex
 */
public enum CalcOperators {
    
    Plus("+"){
        double apply(double x, double y){
            return x + y;
        }
    },
    MINUS("-"){
        double apply(double x, double y){
            return x - y;
        }        
    },
    TIMES("*"){
        double apply(double x, double y){
            return x*y;
        }
    },
    DIVIDE("/"){
        double apply(double x, double y){
            return x*y;
        }
    };
    
    private final String symbol;
    
    CalcOperators(String symbol){
        this.symbol = symbol;
    }
    
    public String toString(){
        return symbol;
    }
    
    abstract double apply(double x, double y);
}
