package com.company;
public class Singleton {
  private static Singleton singleton;
    private Singleton()
    {
System.out.println("Singleton");
    }
    public static Singleton getInstance()
    {
        if(null==singleton)
        {
            singleton=new Singleton();
        }
        return singleton;
    }
}
public class SingletonMain {

    public static void main(String[] args)
    {
        Singleton singleton=Singleton.getInstance();

    }
}
