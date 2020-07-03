/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author rob-c
 */
public class Operacion {
    int suma;
    int resta;
    int multi;
    int divi;
    
    //Metodos
    
    public void suma(int num1, int num2){
      suma= num1 + num2;
    }
    
    public void resta(int num1, int num2){
       resta = num1 - num2;
    }
    
    public void multi(int num1, int num2){
        multi = num1 * num2;
    }
    
    public void division(int num1, int num2){
        divi = num1 / num2;
    }
    
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multi);
        System.out.println("La division es: "+divi);
    }
}
