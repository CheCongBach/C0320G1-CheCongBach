package commons;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import models.Customer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BookingCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LIFE_SEPARATOR = "\n";
    private static final String fileNameBooking = "src/data/Booking.csv";
    private static final String FILE_HEADER_BOOKING = "nameCustomer,idCard,birthday,gender,cmnd,phoneNumber,email,typeCustomer,address,service,id,serviceName,area,rentalFee,maxGuest,rentalType";

    public static void writerBookingToFileCSV(List<Customer> customerList) {
        FileWriter fileWriter = null;
        try {
            FileWriter fileWriter1 = new FileWriter(fileNameBooking);
            fileWriter.append(FILE_HEADER_BOOKING);
            fileWriter.append(NEW_LIFE_SEPARATOR);
            for (Customer customer : customerList) {
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
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getServices().getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getServices().getServiceName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getServices().getArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getServices().getRentalFee()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getServices().getMaxGuest()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getServices().getRentalType());
                fileWriter.append(NEW_LIFE_SEPARATOR);
            }
            System.out.println("CSV file was created successfully");
        } catch (Exception e) {
            System.out.println("Error in file writer!!!");
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
    public static List<Customer> getFileCSVtoListBooking() {
        BufferedReader bufferedReader = null;
        List<Customer> customerList = new ArrayList<>();
        Path path = Paths.get(fileNameBooking);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileNameBooking);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(fileNameBooking));

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
                customer.setTypeServices(splitData[9],splitData[10],Double.parseDouble(splitData[11]),Double.parseDouble(splitData[12]),Integer.parseInt(splitData[13]),splitData[14]);
                customerList.add(customer);
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
        return customerList;
    }
}
