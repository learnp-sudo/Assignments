package com.company;
interface Demo
{
    void demo(int a);
}
//var v=10; cannot be declared in global
public class VarDeclarations {
    //var p; //var cannot be used in instance
    public static void main(String[] args)
    {
    var x=23;
        Demo demo1=(var a)->{
            System.out.println(a);
        };
        demo1.demo(10);
    }
}
