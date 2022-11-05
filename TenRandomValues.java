package com.company;
import java.util.*;

public class TenRandomValues {
    public static void main(String args[]) {
        HashMap<Integer, Double> hash = new HashMap<Integer, Double>();
        hash.put(5, 3.5);
        hash.put(2, 3.5);
        hash.put(1, 8.6);
        hash.put(4, 3.6);
        hash.put(7, 6.0);
        hash.put(6,3.5);
        hash.put(10,5.6);
        hash.put(9,6.5);
        hash.put(11,6.4);
        hash.put(18,4.5);

        Set s = hash.entrySet();
        System.out.println(s);
    }
}

