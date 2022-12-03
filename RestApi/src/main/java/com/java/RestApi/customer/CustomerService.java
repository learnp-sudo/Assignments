package com.java.RestApi.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.springframework.stereotype.Component;
@Component
public class CustomerService {
private static List<CustomerDetails> cust = new ArrayList<>();
private static int count = 0;

    static
    {
        cust.add(new CustomerDetails(++count,"Radhika","radhika@gmail.com",19));
        cust.add(new CustomerDetails(++count,"sonu","sonu@gmail.com",26));
        cust.add(new CustomerDetails(++count,"Shilpa","shilpa@gmail.com",22));
    }
    public List<CustomerDetails> findAll() {
        return cust;
    }

    public CustomerDetails save(CustomerDetails customer) {
        customer.setId(++count);
        cust.add(customer);
        return customer;

    }


    public CustomerDetails findOne(int id) {
        Predicate<? super CustomerDetails> predicate = customer -> customer.getId().equals(id) ;
        return cust.stream().filter(predicate).findFirst().get();
        }

    public void deleteById(int id) {
        Predicate<? super CustomerDetails> predicate = customer -> customer.getId().equals(id);
        cust.removeIf(predicate);
    }



}