package com.company;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

interface Order
{
    public void placingorder();
}
public class Orders {
    public static void main(String[] args)
    {
        Order orderstatus=()->System.out.println("Order Accepted");
        Order orderprice = ()->{
            long totalprice;
            Scanner obj=new Scanner(System.in);
   System.out.println("enter order price");
            totalprice=obj.nextLong();
            if(totalprice>10000)
                orderstatus.placingorder();
            else
                System.out.println("Not placed");
        };
        //Order orderstatus=()->System.out.println("Order Accepted");
         orderprice.placingorder();


    }
}
