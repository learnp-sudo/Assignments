package com.company;

import java.util.Scanner;

public class DatadasePersistence extends Persistence
{
    public void client()
    {
        System.out.println("Enter the name of the client");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        persist();
    }
    public void persist()
    {
        System.out.println(" content of database");
    }


}
