package com.company;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.lang.reflect.*;
import java.util.ArrayList;
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)

    @interface Execute {
        int Sequence();
    }
    class MyClass {
        @Execute(Sequence = 2)
        public void myMethod1() {
            System.out.println("Method 1");
        }

        @Execute(Sequence = 1)
        public void myMethod2() {
            System.out.println("Method 2");
        }

        @Execute(Sequence = 3)
        public void myMethod3() {
            System.out.println("Method 3");
        }
    }

    public class MyClassExecute
    {
        public static void main(String[] args) throws Exception
        {
            MyClass c=new MyClass();
            Method m1=c.getClass().getMethod("myMethod2");
            Method m2=c.getClass().getMethod("myMethod1");
            Method m3=c.getClass().getMethod("myMethod3");
            Execute e1=m1.getAnnotation(Execute.class);
            Execute e2=m2.getAnnotation(Execute.class);
            Execute e3=m3.getAnnotation(Execute.class);
            System.out.println(e1.Sequence());
            System.out.println(e2.Sequence());
            System.out.println(e3.Sequence());
            c.myMethod1();
            c.myMethod3();
            c.myMethod2();
        }
    }

