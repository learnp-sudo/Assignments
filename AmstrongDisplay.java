package com.company;

public class AmstrongDisplay {

    public static void main(String[] args) {
        int rem,sum=0;
        for(int i=100;i<1000;i++) {
           int n=i;
            while (n > 0) {
                rem = n % 10;
                sum = sum + (rem * rem * rem);
                n = n / 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
            sum=0;
        }

    }

}

