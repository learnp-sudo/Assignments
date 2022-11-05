package com.company;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class LambdaSingleString {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap();
        m.put("A", "BCD");
        m.put("E", "FGH");
        m.put("I", "JKL");
        m.put("M", "NOP");
        Set<Map.Entry<String, String>> entryset = m.entrySet();
        StringBuilder s = new StringBuilder();
        {

            for (Map.Entry<String,String> str:m.entrySet())
            {
                String str1=str.getKey()+str.getValue();
                s.append(str1);
            }
            System.out.println(s);
        }
    }
}