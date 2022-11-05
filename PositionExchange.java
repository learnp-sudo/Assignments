package com.company;

public class PositionExchange {

        public <T> void swapping(T[] arr, int i, int j) {
            T temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static void main(String args[]) {
            PositionExchange swap = new PositionExchange();
            Integer[] array = {10,20,30,40,50,60};
            System.out.println("Before Exchanging Positions:");
            for(int i: array) {
                System.out.print(i+ " ");
            }
            System.out.println();
            System.out.println("After Exchanging Positions:");
            swap.<Integer>swapping(array, 0,3);
            for(int i: array) {
                System.out.print(i+ " ");
            }
            System.out.println();
            String[] array1 = {"seeta","Kumari"};
            System.out.println("Before Exchanging Positions:");
            for(String i: array1) {
                System.out.print(i+ " ");
            }
            System.out.println();
            System.out.println("After Exchanging Positions:");
            swap.<String>swapping(array1,1,0);
            for(String i: array1) {
                System.out.print(i+ " ");
            }

        }

    }

