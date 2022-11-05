package com.company;
import java.util.Scanner;
import java.lang.*;

public class ArithematicException {

    public static void main(String[] args) {
        System.out.println("enter a,b");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        float c;
        try
        {
        c=a/b;
        System.out.println(c);
    }
    catch(ArithmeticException e)
    {
        System.out.println("Divided by  0 is not valid");
    }
    }
}
