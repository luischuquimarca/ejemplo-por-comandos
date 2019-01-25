/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasunitarias;

/**
 *
 * @author Personal
 */
public class Operaciones {
    float a,b,resultado;
    
    public float suma(float a,float b){
        resultado=a+b;
        return resultado;
    }
    public float resta(float a,float b){
        resultado=a-b;
        return resultado;
    }
    public float multiplicacion(float a,float b){
        resultado=a*b;
        return resultado;
    }
    public float division(float a,float b){
        resultado= a/b;
        return resultado;
    }
}
