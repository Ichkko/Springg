package org.example.onlinrshop;

import org.example.onlinrshop.model.entity.Customer;
import org.example.onlinrshop.service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class CommandLineRunnerImpl implements CommandLineRunner {
    private final CustomerService customerService;

    public CommandLineRunnerImpl(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void run(String... args) throws Exception {
//        List<Customer> customers = customerService.searchByName("Бат");
        List<Customer> customers = customerService.findByCustomerAddress("UB");

        for (Customer customer: customers) {
            System.out.println("Нэр: " + customer.getName() + "\nУтас: " + customer.getPhone() + "\nХаяг: " + customer.getAddress());
        }
    }
}