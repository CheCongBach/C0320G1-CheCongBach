package service;

import commons.EmployeeCSV;
import models.Employee;

import javax.swing.*;
import java.util.Set;
import java.util.TreeMap;

public class ShowAllEmployee {
    public static void showAllEmployee() {
        TreeMap<String, Employee> employeeTreeMap = EmployeeCSV.getFileCSVtoListEmployee();
        Set<String> set = employeeTreeMap.keySet();
        for (String key : set) {
            System.out.println(key + " " + employeeTreeMap.get(key).toString());
        }
    }
}
