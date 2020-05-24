package show;

import commons.CustomerCSV;
import models.Customer;
import sort.NameCustomerComparator;

import java.util.ArrayList;
import java.util.Collections;

public class ShowCustomer {
    public static void showInformationCustomerSort() {
        ArrayList<Customer> customers = CustomerCSV.getFileCSVtoListCustomer();
        Collections.sort(customers,new NameCustomerComparator());
        for (Customer customer : customers) {
            System.out.println("---------------------------------");
            System.out.println(customer.showInfo());
        }
    }
}
