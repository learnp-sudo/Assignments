package com.company;

public class PersistenceMain {

    public static void main(String[] args)
    {
        FilePersistence fp=new FilePersistence();
        DatadasePersistence dp=new DatadasePersistence();
        fp.client();
        dp.client();


    }
}
