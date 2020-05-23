package commons;

import models.Customer;

import java.io.FileWriter;
import java.util.ArrayList;

public class CustomerCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LIFE_SEPARATOR = "\n";
    private static final String fileNameCustomer = "src/data/Villa.csv";
    private static final String FILE_HEADER_CUSTOMER = "nameCustomer,birthday,gender,cmnd,phoneNumber,email,typeCustomer,address,service";

    public static void writerCustomerToFileCSV(ArrayList<Customer> customerArrayList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameCustomer);
            fileWriter.append(FILE_HEADER_CUSTOMER);
            fileWriter.append(NEW_LIFE_SEPARATOR);
            for (Customer customer : customerArrayList) {
                fileWriter.append(customer.getNameCustomer());
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

            }
        } catch (Exception e) {
            System.out.println("Error in CSV file writer!!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                System.out.println("Error when flush or close");
            }
        }
    }
}
