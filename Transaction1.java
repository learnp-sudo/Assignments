package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Transcation
{
    Trader trader;
    int year;
    int value;

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Transcation{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }

    public Transcation(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }
}

public class Transaction1 {
    public static void main(String[] args)
    {
        List<Transcation> transactions = Arrays.asList(new Transcation(new Trader("Sai","Hyderabad"),2003,1400),
                new Transcation(new Trader("Krishna","Nizamabad" + ""),2001,1500),
                new Transcation(new Trader("Ram","pune"),2001,1400),
                new Transcation(new Trader("Rahul","Delhi"),2002,4000));
        transactions.stream().filter(p->p.trader.getCity().equalsIgnoreCase("Delhi")).forEach(p->System.out.println(p.getValue()));

        List<Transcation>sortedlist3=  transactions.stream().filter(p->p.getYear()==(2011)).sorted(Comparator.comparingInt(Transcation::getValue)).collect(Collectors.toList());
        sortedlist3.forEach(System.out::println);
        Optional<Transcation> sortedlist9=transactions.stream().max(Comparator.comparingInt(Transcation::getValue));
        System.out.println(sortedlist9);
        Optional<Transcation>sortedlist10=transactions.stream().min(Comparator.comparingInt(Transcation::getValue));
        System.out.println(sortedlist10);
    }
}
