package com.company;

import java.util.Scanner;

public class ThreeSubjectMarks {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
	System.out.println("enter marks in maths");
    int Maths= obj.nextInt();
        System.out.println("enter marks in physics");
        int Phy= obj.nextInt();
        System.out.println("enter marks in Chem");
        int Chem= obj.nextInt();
        int sum=M+P+C; int sum1=M+P; int sum2=P+C; int sum3=C+M;
        if((Maths>60)||(Phy>60)||(Chem>60)||(sum<60))
            System.out.println("failed");1
        else if(sum>60)
            System.out.println("Passed");
        else if ((sum1>60)||(sum2>60)||(sum3>60))
            System.out.println("promoted");
        else
            System.out.println("not valid");


    }
}
