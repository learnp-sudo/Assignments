package com.company;
import java.lang.*;
import java.util.*;
class Date
{  Integer date;
    Integer Month;
    Integer year;
    public Date(Integer date,Integer Month,Integer year)
    {
        this.date=date;
        this.Month=Month;
        this.year=year;
    }

    @Override
    public String toString() {
        return date+"-"+Month+"-"+year;
    }
}

public class DateOfBirths {
    public static void main(String args[])
    {
        LinkedList<Date> list=new LinkedList<>();
        Date d1=new Date(1,1,2003);
        Date d2=new Date(2,7,2005);
        Date d3=new Date(28,3,2012);
        Date d4=new Date(10,11,2016);
        Date d5=new Date(24,5,2019);
        list.add(d5);
        list.add(d4);
        list.add(d3);
        list.add(d2);
        list.add(d1);
        System.out.println(list);
        Iterator<Date> itr=list.iterator();
        while(itr.hasNext())
        {
            Date d=itr.next();
            Integer date=d.date;
            Integer month=d.Month;
            Integer year=d.year;
            if(year%4==0) {
                System.out.println("Your date of birth is " + date + "-" + month + "-" + year + " is leap year");
            }

            else {
                System.out.println("Your date of birth is "+date+"-"+month+"-"+year+" is not leap year");
            }
        }

    }
}


