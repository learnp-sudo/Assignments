package com.company;
import java.util.*;
@FunctionalInterface
interface Operations
{
    public int arthematicoperations(int num1,int num2);
}
public class ArithematicOperations {
    public static void main(String[] args)
    {
        Operations addition=(int num1,int num2)->num1+num2;
        Operations substraction=(int num1,int num2)->num1-num2;
        Operations division=(int num1,int num2)->num1/num2;
        Operations multiplication=(int num1,int num2)->num1*num2;
        System.out.println("Multiplication="+multiplication.arthematicoperations(5,6));
       System.out.println("Substraction="+substraction.arthematicoperations(5,6));
       System.out.println("Addition="+addition.arthematicoperations(5,6));
        System.out.println("Division="+division.arthematicoperations(5,6));

    }

}
