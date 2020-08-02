/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise1;
import java.util.Scanner;
class Customer{
    int id;
    String name="";
    int dis;
    customer(int i,String n,int d)
    {
        id=i;
        name=n;
        dis=d;
    }
    int getid()
    {
        return id;
    }
    String getname()
    {
        return name;
    }
    int getdis()
    {
        return dis;
    }
    void setdiscount(int d1)
    {
        dis=d1;
    }
    Public StringtoString()
    {
        return "Name"+name+"ID"+id;"
    }
    }

/**
 *
 * @author user
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        customer c1=new customer(100,"AAA",10);
        System.out.println(c1.getid());
        System.out.println(c1.getname());
        System.out.println(c1.getdis());
        c1.setdiscount(15);
        System.out.println(c1.setdiscount());
        System.out.println(c1);
        invoice in= new invoice(1000,c1,2000);
        System.out.println(in.getid());
        System.out.println(in.getcustomer());   
        customer c2=new customer(101,"BBB",15);
        in.setcustomer(c2);
        System.out.println(in.getamount());
        in.setamount(2500);
        System.out.println(in.getcustomername());
        System.out.println(in.getamountafterdiscount());
    }
    
}


class invoice{
    int id;
    customer o;
    double amount;
    invoice(int i,customer n,double a)
    {
        id=i;
        o=o1;
        amount=a;
    }
    int getid()
    {
        return id;
    }
    Customer getcustomer()
    {
        return o ;
    }
    void setcustomer(customer o2)
    {
        o=o2;
    }
    double getamount()
    {
        return amount;
    }
    void setamount()
    {
        amount=a;
        
    }
    String getcustomername()
    {
        return o.name;
    }
    double getamountafterdiscount()
    {
        return amount-(amount*o.discount)/100;
    }
    }