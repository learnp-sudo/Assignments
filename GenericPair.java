package com.company;

import java.lang.String;
import java.util.Date;

class Pair<K,V>
    {
        private K key;
        private V value;
        public Pair(K key,V value)
        {
            this.key=key;
            this.value=value;
        }
        public K setKey()
        {
            System.out.println(key);
            return key;
        }
        public V setValue()
        {
            System.out.println(value);
            return value;
        }
    }
    public class GenericPair {
        public static void main(String[] args) {
            Pair<String,String> myobj1=new Pair<>("1","Hello");
            myobj1.setKey();
            myobj1.setValue();
            Pair<String, java.util.Date> myobj2=new Pair<String, Date>("Today is",new java.util.Date());
            myobj2.setKey();
            myobj2.setValue();
        }
    }

