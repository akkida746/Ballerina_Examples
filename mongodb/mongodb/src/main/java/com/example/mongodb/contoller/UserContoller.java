package com.example.mongodb.contoller;

import com.example.mongodb.entity.Customer;
import com.example.mongodb.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserContoller {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/saveCustomer/{name}")
    public String saveCustomer(@PathVariable String name){
        System.out.println("Saving Customer...");
        Customer customer = new Customer("Ram", "Singh");
        customerService.saveCustomer(customer);
        System.out.println("Saved Customer...");
        return customer.toString();
    }
}
