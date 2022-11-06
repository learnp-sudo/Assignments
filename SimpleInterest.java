package com.company;
@FunctionalInterface
interface Interest
        {
            double calculate(double principle,double time,double rate);
        }

public class SimpleInterest {
    public static void main(String[] args)
    {
        Interest interest = (var principle,var time,var ROI)->{
            double SimpleInterest;
            SimpleInterest=(principle*time*ROI)/100;
            System.out.println(SimpleInterest);
            return(SimpleInterest);
        };
        interest.calculate(20000,3,2);
    }
}
