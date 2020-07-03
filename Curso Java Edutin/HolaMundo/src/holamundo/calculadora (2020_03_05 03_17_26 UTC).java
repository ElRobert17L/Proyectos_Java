/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author rob-c
 */
public class calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        Scanner sc3 = new Scanner (System.in);
        float num1, num2, res;
        String op;
        
        System.out.println("Ingresa el primer número");
        num1 = sc.nextFloat();
        
        System.out.println("Ingresa el segundo número");
        num2 = sc2.nextFloat();
        
        System.out.println("Escribe la operacion que deseas realizar");
        op = sc3.next();
        switch(op){
            case "suma":
                res = num1 + num2;
                System.out.println("El resultado de la suma es: "+res);
           break;
           case "resta":
                res = num1 - num2;
                System.out.println("El resultado de la resta es: "+res);
           break;
           case "multiplicacion":
                res = num1 * num2;
                System.out.println("El resultado de la multiplicacion es: "+res);
           break;
           case "division":
                res = num1 / num2;
                System.out.println("El resultado de la division es: "+res);
           break;
            default: 
                System.out.println("Mal :(");
        }
            
    }
    
}
