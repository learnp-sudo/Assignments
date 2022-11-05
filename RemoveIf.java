package com.company;
import java.util.ArrayList;
import java.util.Arrays;
public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Hi", "GoodMorning", "Wel come", "to", "meeting"));
        System.out.println(list);
        for (String word : list)
            System.out.println(word);
        System.out.println("the words with the even number length:");
        list.removeIf(word -> ((word.length() % 2) != 0));
        for (String word : list) {
            System.out.println(word);
        }
    }
}


