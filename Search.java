package com.company;

import java.util.Scanner;

public class Search {

    public static void main(String[] args) {
	int num[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
    int i,se,sz=num.length;
    System.out.println("Enter a searching elememt");
    Scanner obj=new Scanner(System.in);
    se =obj.nextInt();
    for(i=0;i<sz;i++)
    {
        if(num[i]==se)
        {
            System.out.println("location no="+(i+1));
        }

    }
    }
}
