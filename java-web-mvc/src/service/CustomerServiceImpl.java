package service;

import model.Customer;

import java.time.LocalDate;
import java.util.*;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customerMap;

    static {
        customerMap = new HashMap<>();
        customerMap.put(1, new Customer(1,"John","18/09/1990","john@codegym.vn","Hanoi"));
        customerMap.put(2, new Customer(2,"Bill","26/05/1994","bill@codegym.vn","Danang"));
        customerMap.put(3, new Customer(3,"Alex","01/01/1997","alex@codegym.vn","Saigon"));
        customerMap.put(4, new Customer(4,"Adam","19/05/1996","adam@codegym.vn","Beijin"));
        customerMap.put(5, new Customer(5,"Sophia","09/05/1992","sophia@codegym.vn","Miami"));
        customerMap.put(6, new Customer(6,"Rose","20/04/1995","rose@codegym.vn","Newyork"));
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
