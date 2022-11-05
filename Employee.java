package com.company;
import java.lang.*;
class Employee1
{
    public void salary(long salary)
    {
        System.out.println("salary="+salary);
    }
}
class Labour extends Employee {
    public void salary(long salary,long overtime) {
        overtime = 500;
        salary = salary + overtime;
        System.out.println("salary of Labour:" + salary);
    }
}
class Manager extends Employee{
    public void salary(long salary,long incentive)
    {
        incentive=500;
        salary=salary+incentive;
        System.out.println("salary of Manager:"+salary);
    }
}


public class Employee {

    public static void main(String[] args) {
        Employee1 obj1 = new Employee1();
        Manager obj2=new Manager();
        Labour obj3= new Labour();
        obj1.salary(10000);
        obj2.salary(10000,500);
        obj3.salary(10000,200);
    }
}
