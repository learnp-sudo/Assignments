package com.company;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test
{

}
 class AnnotationTest {
    @Test
    public int testcase()
    {
int a=10;
return a;
    }
    public static void main(String[] args)
    {
        AnnotationTest t = new AnnotationTest();
        System.out.println(t.testcase());
    }

}
