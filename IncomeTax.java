package com.company;

import java.util.Scanner;

public class IncomeTax {

    public static void main(String[] args) {
        System.out.println("Enter CTC");
        Scanner obj=new Scanner(System.in);
        double CTC= obj.nextDouble();
        System.out.println("CTC="+CTC);
        if ((CTC>=0)&&(CTC<=180000))
        {
            System.out.println("Tax percent zero");
        }
        else if(CTC<=300000)
        {
            double Tax=(0.1)*CTC;
            System.out.println("Tax amount="+Tax);
        }
        else if(CTC<=500000)
        {
            double Tax1=(0.2)*CTC;
            System.out.println("Tax amount="+Tax1);
        }
        else if(CTC<=1000000)
        {
            double Tax2=(0.3)*CTC;
            System.out.println("Tax amount="+Tax2 );
        }
    }
}
