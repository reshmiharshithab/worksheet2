/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arithmetic;
import java.util.Scanner;
class arithmetic{
    float add,sub,mul,div;
    float a,b;
    void getvalue(){
        Scanner obj=new Scanner (System.in);
        System.out.println("Enter the value of a and b");
        a=obj.nextFloat();
        b=obj.nextFloat();
        
    }
    void execution(){
        float add=a+b;
        float sub=a-b;
        float mul=a*b;
        float div=a/b;
        System.out.println("The sum is"+add);
        System.out.println("The difference is"+sub);
        System.out.println("The product is"+mul);
        System.out.println("The quotient is"+div);
    }
}

/**
 *
 * @author user
 */
public class Operation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        arithmetic obj = new arithmetic();
        obj.getvalue();
        obj.execution();
        
    }
    
}
