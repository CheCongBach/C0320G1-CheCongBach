package commons;

import models.Customer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CustomerCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LIFE_SEPARATOR = "\n";
    private static final String fileNameCustomer = "src/data/Customer.csv";
    private static final String FILE_HEADER_CUSTOMER = "nameCustomer,idCard,birthday,gender,cmnd,phoneNumber,email,typeCustomer,address,service";

    public static void writerCustomerToFileCSV(ArrayList<Customer> customerArrayList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameCustomer);
            fileWriter.append(FILE_HEADER_CUSTOMER);
            fileWriter.append(NEW_LIFE_SEPARATOR);
            for (Customer customer : customerArrayList) {
                fileWriter.append(customer.getNameCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getIdCard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getBirthday());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getGender());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getCmnd());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getPhoneNumber());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getTypeCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getAddress());
                fileWriter.append(NEW_LIFE_SEPARATOR);
            }
            System.out.println("Success add");
        } catch (Exception e) {
            System.out.println("Error in CSV file writer!!!");
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
    public static ArrayList<Customer> getFileCSVtoListCustomer() {
        BufferedReader bufferedReader = null;
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        Path path = Paths.get(fileNameCustomer);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileNameCustomer);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(fileNameCustomer));

            while ((line = bufferedReader.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("nameCustomer")) {
                    continue;
                }
                Customer customer = new Customer();
                customer.setNameCustomer(splitData[0]);
                customer.setIdCard(splitData[1]);
                customer.setBirthday(splitData[2]);
                customer.setGender(splitData[3]);
                customer.setCmnd(splitData[4]);
                customer.setPhoneNumber(splitData[5]);
                customer.setEmail(splitData[6]);
                customer.setTypeCustomer(splitData[7]);
                customer.setAddress(splitData[8]);
                customerArrayList.add(customer);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return customerArrayList;
    }
}
