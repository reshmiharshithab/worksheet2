/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volume;
import java.util.Scanner;
class box{
    double height;
    double width;
    double depth;;
    void volume(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of depth");
        System.out.println("Enter the value of width");
        System.out.println("Enter the value of height");
        depth=obj.nextDouble();
        width=obj.nextDouble();
        height=obj.nextDouble();   
        double vol=depth*width*height;
        System.out.println("volume"+vol);
    }
}

/**
 *
 * @author user
 */
public class Volumemain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        box obj=new box();
        obj.volume();
        
    }
}
        
        // TODO code application logic here
    
    

