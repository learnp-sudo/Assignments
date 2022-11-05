package com.company;
import java.lang.String;
import java.util.*;
class Contact
{
    String name;
    String email;
    char gender;
    Contact( String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}

class number
{
    long phoneNumber;
    number(long phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }

    @Override
    public String toString() {
        return "number{" +
                "phoneNumber=" + phoneNumber+
                '}';
    }
}
class SortbyphoneNumber implements Comparator
{
    public int compare(Object str1, Object str2)
    {
        String i1=str1.toString();
        String i2= str2.toString();
        return i2.compareTo(i1);
    }
}
public class PhoneNumbers
{
    public static void main(String[] args)
    {
        number n1=new number(98765432);
        number n2=new number(84876977);
        number n3=new number(94876978);
        Contact c1=new Contact("ramya","a__@gmail.com",'f');
        Contact c2=new Contact("ragi","b__@gmail.com",'f');
        Contact c3=new Contact("ravali","c__@gmail.com",'f');
        TreeMap<number,Contact> t1 = new TreeMap<number,Contact>(new SortbyphoneNumber());
        t1.put(n1,c1);
        t1.put(n2,c2);
        t1.put(n3,c3);
        System.out.println(t1);
        Set s1=t1.keySet();
        System.out.println(s1);
        Collection s2=t1.values();
        System.out.println(s2);
        Set s3=t1.entrySet();
        System.out.println(s3);
    }
}
