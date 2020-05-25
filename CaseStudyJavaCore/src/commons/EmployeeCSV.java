package commons;

import models.Employee;
import models.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.TreeMap;

public class EmployeeCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LIFE_SEPARATOR = "\n";
    private static final String fileNameEmployee = "src/data/Employee.csv";
    private static final String FILE_HEADER_EMPLOYEE = "nameEmployee,age,address";

    public static void writerEmployeeToFileCSV(TreeMap<String, Employee> employeeTreeMap) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameEmployee);
            fileWriter.append(FILE_HEADER_EMPLOYEE);
            fileWriter.append(NEW_LIFE_SEPARATOR);
            for (String key : employeeTreeMap.keySet()) {
                Employee employee = employeeTreeMap.get(key);
                fileWriter.append(employee.getIdEmployee());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(employee.getNameEmployee());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(employee.getAge()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(employee.getAddress());
                fileWriter.append(NEW_LIFE_SEPARATOR);
            }
            System.out.println("CSV file was created successfully");
        } catch (Exception e) {
            System.out.println("Error in CSV file writer !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
    public static TreeMap<String, Employee> getFileCSVtoListEmployee() {
        BufferedReader br = null;
        TreeMap<String, Employee> employeeTreeMap = new TreeMap<>();
        Path path = Paths.get(fileNameEmployee);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileNameEmployee);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameEmployee));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                Employee employee = new Employee();
                employee.setIdEmployee(splitData[0]);
                employee.setNameEmployee(splitData[1]);
                employee.setAge(Integer.parseInt(splitData[2]));
                employee.setAddress(splitData[3]);
                employeeTreeMap.put(employee.getIdEmployee(), employee);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return employeeTreeMap;
    }
}
