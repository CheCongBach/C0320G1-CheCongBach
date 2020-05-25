package service;

import commons.CustomerCSV;
import commons.EmployeeCSV;
import models.Customer;
import models.Employee;
import validation.checkInput;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class AddNewEmployee {
    public static void addNewEmployee() {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();
        checkInput checkInput = new checkInput();
        TreeMap<String, Employee> employeeTreeMap = new TreeMap<>();
        employeeTreeMap = EmployeeCSV.getFileCSVtoListEmployee();
        System.out.println("Enter Id Card Employee : ");
        employee.setIdEmployee(checkInput.checkIdCardCustomer());
        System.out.println("Enter Name Employee: ");
        employee.setNameEmployee(checkInput.checkNameCustomer());
        System.out.println("Enter Age Employee: ");
        employee.setAge(scanner.nextInt());
        System.out.println("Enter Address Employee: ");
        employee.setAddress(scanner.nextLine());
        employeeTreeMap.put(employee.getIdEmployee(), employee);
        EmployeeCSV.writerEmployeeToFileCSV(employeeTreeMap);
    }
}
