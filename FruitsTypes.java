package com.company;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Fruits
{
    private String name;
    private int calories;
    private int price;
    private String color;

    @Override
    public java.lang.String toString() {
        return "Fruits{" +
                "name=" + name +
                ", calories=" + calories +
                ", price=" + price +
                ", color=" + color +
                '}';
    }

    public Fruits(String name, int calories, int price, String color) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
public class FruitsTypes {
    public static void main(String[] args){
        Fruits fruit1=new Fruits("Apple",100,200,"red");
        Fruits fruit2=new Fruits("Banana",200,50,"yellow");
        Fruits fruit3=new Fruits("orange",30,80,"orange");
        Fruits fruit4=new Fruits("jackfruit",50,190,"green");
        Fruits fruit5=new Fruits("green apple",60,190,"green");
        ArrayList<Fruits> list=new ArrayList<Fruits>();
        list.add(fruit1);
        list.add(fruit2);
        list.add(fruit3);
        list.add(fruit4);
        list.add(fruit5);
        System.out.println("Total list");
       list.forEach(System.out::println);
        List sortedlist=list.stream().filter(c->(c.getCalories()<(100))).sorted(Comparator.comparingInt(Fruits::getCalories)).collect(Collectors.toList());
System.out.println("Sorted list");
        sortedlist.forEach(System.out::println);
        System.out.println("Accordind to color");
        List colourList= list.stream().sorted(Comparator.comparing(Fruits::getColor)).collect(Collectors.toList());

 System.out.println(colourList);
 System.out.println("Red Fruits");
        List RedColour= list.stream().filter(p->p.getColor().equals("red")).sorted(Comparator.comparing(Fruits::getColor)).collect(Collectors.toList());
System.out.println(RedColour);








        // List sortedlist=list.stream().sorted(Comparator.comparingInt(Fruits::getCalories)).collect(Collectors.toList());
        /*ListIterator<Fruits> itr=list.listIterator();
      while(itr.hasNext()) {
      System.out.println(itr.next());
}*/
     // List <Fruits> list1=Arrays.asList(new Fruits("Apple",100,200,"Red"),
           //   new Fruits("Banana",200,50,"Yellow""));
      //list.stream().filter(f ->f.getName().equals(calories<100))
    }
}
