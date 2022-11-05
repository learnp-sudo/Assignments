package com.company;

import java.util.Scanner;

public class FilePersistence extends Persistence
{
    public void client()
    {
        System.out.println("Enter the name of the file");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        persist();
    }
    public void persist()
    {

        System.out.println(" content of the file");
    }

}
