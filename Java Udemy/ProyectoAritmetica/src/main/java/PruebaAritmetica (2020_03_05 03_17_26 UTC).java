
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rob-c
 */
public class PruebaAritmetica {
    
    public static void main(String[] args) {
        Aritmetica ari = new Aritmetica();
        Scanner sc = new Scanner(System.in);
        
        ari.a= sc.nextInt();
        ari.b= sc.nextInt();
        
        int res= ari.sumar();
        
        System.out.println(res);
        
        //Creacion de un segundo objeto
        Aritmetica ari2 = new Aritmetica(1,2);
        System.out.println(ari2.sumar());
        
    }
    
}
