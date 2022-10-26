package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int i,j,se,sz=num.length;
        System.out.println("Enter a searching elememt");
        Scanner obj=new Scanner(System.in);
        se =obj.nextInt();
        for(i=0;i<sz-1;i++)
        {
            for(j=i+1;j<sz;j++)
            {
                if(num[i]>num[j]) {
                   int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for(i=0;i<sz;i++)
        {
            if(num[i]==se)
            {
                System.out.println("location no="+(i+1));
            }

        }
    }
}

