package add;

import commons.CustomerCSV;
import models.Customer;
import validation.checkInput;

import java.util.ArrayList;
import java.util.Scanner;

public class AddNewCustomer {
    public static void addNewCustomer() {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        checkInput checkInput = new checkInput();
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        customerArrayList = CustomerCSV.getFileCSVtoListCustomer();
        System.out.println("Enter Name Customer: ");
        customer.setNameCustomer(checkInput.checkNameCustomer());
        System.out.println("Enter Id Card Customer: ");
        customer.setIdCard(checkInput.checkIdCardCustomer());
        System.out.println("Enter Birthday Customer: ");
        customer.setBirthday(checkInput.checkBirthdayCustomer());
        System.out.println("Enter Gender Customer: ");
        customer.setGender(checkInput.checkGenderCustomer());
        System.out.println("Enter Phone Number Customer: ");
        customer.setPhoneNumber(checkInput.checkPhoneNumberCustomer());
        System.out.println("Enter Email Customer: ");
        customer.setEmail(checkInput.checkEmailCustomer());
        System.out.println("Enter Type Customer: ");
        customer.setTypeCustomer(scanner.nextLine());
        System.out.println("Enter Address Customer: ");
        customer.setAddress(scanner.nextLine());
        customerArrayList.add(customer);
        CustomerCSV.writerCustomerToFileCSV(customerArrayList);
    }
}
