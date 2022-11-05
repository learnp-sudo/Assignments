package com.company;

import java.util.Scanner;

public class CUI {

    public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
            System.out.println("enter username");
    String s = obj.nextLine();
    System.out.println("enter password");
    String p = obj.nextLine();
            for(int i=0;i<3;i++)
            {
    if(p.equals(p)) {
        System.out.println(s);
        System.out.println("wel come");
        break;
    }
}
    }
}
