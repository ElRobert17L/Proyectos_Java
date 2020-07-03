/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rob-c
 */
public class Aritmetica {
    
    int a;
    int b;

    public Aritmetica() {
        System.out.println("Constructor vacio");
    }
    
    public Aritmetica(int arg1, int arg2){
        a = arg1;
        b = arg2;
    }
    
    public int sumar (){
        int res = a + b;
        return res;
    }
    
}
