package com.company;
import java.util.*;
import java.lang.*;

public class UniqueProduct {
    public static void main(String[] args)
    {

        HashSet<String> hash=new HashSet<>();
        hash.add("wire");
        hash.add("chairs");
        hash.add("book");
        hash.add("phone");
        hash.add("ring");
        hash.add("cock");
        hash.add("pencils");
        hash.add("mobiles");
        hash.add("cock");
        hash.add("books");
        System.out.println(hash);
        System.out.println(hash.size());
    }
}
