package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Trader {
  String name;
  String city;

  @Override
  public String toString() {
   return "Trader{" +
           "name='" + name + '\'' +
           ", city='" + city + '\'' +
           '}';
  }

  public Trader(String name, String city)
  {
   this.name = name;
   this.city = city;
  }
  public String getName() {
   return name;
  }

  public void setName(String name) {
   this.name = name;
  }

  public String getCity() {
   return city;
  }

  public void setCity(String city) {
   this.city = city;
  }
}
 public class Trader1
 {
  public static void main(String[] args)
  {
   List<Trader> trader= Arrays.asList(new Trader("ramu","Hyderabad"),new Trader("Sreeja","Nizamabad"),
   new Trader("Bhuvana","Bengaluru"));
   trader.stream().distinct().forEach(p->System.out.println(p.getCity()));
   List<Trader> sortedlist=trader.stream().filter(p->p.getCity().equals("pune")).sorted(Comparator.comparing(Trader::getName)).
           collect(Collectors.toList());
   sortedlist.forEach(System.out::println);
   List<Trader> sortedList1=trader.stream().sorted(Comparator.comparing(Trader::getCity)).collect(Collectors.toList());
   sortedList1.forEach(System.out::println);
      List<Trader> sortedlist2=trader.stream().filter(p->p.getCity().equals("Hyderabad")).
              collect(Collectors.toList());
      sortedlist2.forEach(System.out::println);
      trader.stream().sorted(Comparator.comparing(Trader::getName)).forEach(p->System.out.println(p.getName()));
  }
 }
