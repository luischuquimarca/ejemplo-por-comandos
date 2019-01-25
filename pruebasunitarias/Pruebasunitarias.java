/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasunitarias;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Pruebasunitarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec=new Scanner(System.in);
        
        float a,b,resultado;int op;
        Operaciones obj1;
                System.out.print("ingrese el primer valor: ");
                a=tec.nextFloat();
                System.out.print("ingrese el segundo valor: ");
                b=tec.nextFloat();
                obj1=new Operaciones();
        do{
        System.out.println("menu de operaciones");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion");
        System.out.println("4.division");
        System.out.println("5. salir");
        System.out.println("elija la opcion: ");
        op=tec.nextInt();
        if(op==1){
            resultado=obj1.suma(a,b);
            System.out.println("la suma es: "+resultado);
        }
        if(op==2){
            resultado=obj1.resta(a,b);
            System.out.println("la resta es: "+resultado);
        }
        if(op==3){
            resultado=obj1.multiplicacion(a,b);
            System.out.println("la multiplicacion es: "+resultado);
        }
        if(op==4){
            resultado=obj1.division(a,b);
            System.out.println("la division es: "+resultado);
        }
       
        }while(op!=5);
    }
    
}
