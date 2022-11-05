package com.company;

import java.util.*;

public class StringMethods {

    public static void main(String[] args) {
	String s1="Java String pool refers to collection of strings which are stored in heap memory";
    System.out.println(s1);
    System.out.println("tolower:"+s1.toLowerCase());
        System.out.println("toUpper:"+s1.toUpperCase());
        System.out.println("replace:"+s1.replace("a","$"));
        System.out.println("check collection:"+s1.contains("collection"));
        System.out.println("check:"+s1.contains("java string pool refers to collection of strings which are stored in heap memory"));
        System.out.println("match:"+s1.matches("java string pool refers to collection of strings which are stored in heao memory"));

    }
}
