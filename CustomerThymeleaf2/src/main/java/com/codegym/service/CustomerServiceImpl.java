package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customerMap;

    static {
        customerMap = new HashMap<>();
        customerMap.put(1, new Customer(1, "John", "26/05/1991", "john@codegym.vn", "HaNoi"));
        customerMap.put(2, new Customer(2, "Bill", "03/03/1996", "bill@codegym.vn", "DaNang"));
        customerMap.put(3, new Customer(3, "Alex", "04/06/1992", "alex@codegym.vn", "SaiGon"));
        customerMap.put(4, new Customer(4, "Adam", "12/12/2000", "adam@codegym.vn", "England"));
        customerMap.put(5, new Customer(5, "Sophia", "23/8/1997", "sophia@codegym.vn", "Miami"));
        customerMap.put(6, new Customer(6, "Rose", "25/06/2001", "rose@codegym.vn", "NewYork"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public void save(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customerMap.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customerMap.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customerMap.remove(id);
    }
}
