/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.util.Scanner;
class student{
    String name="";
    String dept="";
    float m1,m2,m3;
    float avg;

    void getdata(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the student name");
        name=obj.nextLine();
        System.out.println("Enter the department");
        dept=obj.nextLine();
        System.out.println("Enter the marks m1,m2,m3");
        m1=obj.nextFloat();
        m2=obj.nextFloat();
        m3=obj.nextFloat();
    }
    void markcal(){
        float avg=(m1+m2+m3)/3;
        System.out.println("The average is"+avg);
        if(avg>=80)
            System.out.println("First class");
        else if((70 <= avg)&& (79 >= avg))
            System.out.println("Second class");
        else if((60 <= avg)&& (69 >= avg))
            System.out.println("Third class");
        else if(50>avg)
            System.out.println("Fail");
    }
}

/**
 *
 * @author user
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student obj[]= new Student[10];
        for(int i=0;i<10;i++)
            obj[i]= new Student();
            obj[i].getdata();
            obj[i].markcal();
    }
    
}
