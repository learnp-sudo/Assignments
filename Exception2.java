package com.company;
import java.util.Scanner;
import java.lang.*;

public class Exception2 {

    public static void main(String[] args) {
        System.out.println("enter a,b");
        Scanner obj=new Scanner(System.in);
        float a=obj.nextFloat();
        float b=obj.nextFloat();
        float c;
        try
        {
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            
        }
    }
}

