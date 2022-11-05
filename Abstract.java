package com.company;
abstract class abstract1 {
   public abstract void disp();
}
class B extends abstract1
    {
        public void disp()
        {
            System.out.println("demo of abstact");
        }
    }

public class Abstract {

    public static void main(String[] args) {
        absract1 obj=new B();
        obj.disp();
    }
}
