package service;

import commons.*;
import models.Customer;
import models.House;
import models.Room;
import models.Villa;
import sort.NameCustomerComparator;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AddNewBooking {
    public static void addNewBooking() {
        Scanner scanner = new Scanner(System.in);
        List<Customer> customerList = CustomerCSV.getFileCSVtoListCustomer();
        Collections.sort(customerList, new NameCustomerComparator());
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println("---------------------------------");
            System.out.println((i + 1) + ". " + customerList.get(i).showInfo());
        }
        System.out.println("Enter your choice: ");
        String choice;
        while (true) {
            choice = scanner.nextLine();
            if (Integer.parseInt(choice) < 1 || new Integer(choice) > customerList.size()) {
                System.out.println("The customer you selected is not in the list");
            } else {
                break;
            }
        }
        Customer customer = customerList.get(Integer.parseInt(choice) - 1);
        System.out.println("1.Booking Villa: " + "\n" + "2.Booking House: " + "\n" + "3.Booking Room: " + "\n" + "4.Exit: ");
        switch (choice) {
            case "1": {
                List<Villa> villaList = VillaCSV.getFileCSVtoListVilla();
                for (int i = 0 ; i < villaList.size(); i++) {
                    System.out.println("---------------------------------");
                    System.out.println("No" + (i + 1) + villaList.get(i).showInfo());
                }
                System.out.println("Enter your choice Villa: ");
                Villa villa = villaList.get(scanner.nextInt() - 1);
                customer.setServices(villa);
                break;
            }
            case "2": {
                List<House> houseList = HouseCSV.getFileCSVtoListHouse();
                for (int i = 0; i < houseList.size(); i++) {
                    System.out.println("---------------------------------");
                    System.out.println("No" + (i + 1) + houseList.get(i).showInfo());
                }
                System.out.println("Enter you choice House: ");
                House house = houseList.get(scanner.nextInt() - 1);
                customer.setServices(house);
                break;
            }
            case "3": {
                List<Room> roomList = RoomCSV.getFileCSVtoListRoom();
                for (int i = 0; i < roomList.size(); i++) {
                    System.out.println("---------------------------------");
                    System.out.println("No" + (i + 1) + roomList.get(i).showInfo());
                }
                System.out.println("Enter your choice Room: ");
                Room room = roomList.get(scanner.nextInt() - 1);
                customer.setServices(room);
                break;
            }
            case "4": {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Fail! Please choice again!....");
                break;
            }
        }
        List<Customer> listBooking = BookingCSV.getFileCSVtoListBooking();
        listBooking.add(customer);
        BookingCSV.writerBookingToFileCSV(listBooking);
    }
}
