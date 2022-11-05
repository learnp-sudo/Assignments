package com.company;

import java.util.Scanner;

public class SimpleAndCompound {

    public static void main(String[] args) {
	double A;double Amount;
    double T;
    double R; double SI;
    System.out.println("enter amount,time(years) and rate of interset");
        Scanner obj = new Scanner(System.in);
        A = obj.nextDouble();
        T =obj.nextDouble();
        R =obj.nextDouble();
        SI=(A*T*R)/100;
        Amount=A*Math.pow((1+(R/100)),T);
        double CI=Amount-A;
        System.out.println("compound interest="+CI);
        System.out.println("simple interest="+SI);
    }
}
