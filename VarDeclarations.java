package com.company;
interface Demo
{
    void demo(int a);
}

public class VarDeclarations {
    //var p; var cannot be used
    public static void main(String[] args)
    {
    //var x; var cannot be used in instance
        Demo demo1=(var a)->{
            System.out.println(a);
        };
        demo1.demo(10);
    }
}
