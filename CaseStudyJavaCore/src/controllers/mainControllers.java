package controllers;

import commons.HouseCSV;
import commons.RoomCSV;
import commons.VillaCSV;
import models.House;
import models.Room;
import models.Villa;
import java.util.ArrayList;
import java.util.Scanner;

public class mainControllers {
    Scanner scanner = new Scanner(System.in);
    public void displayMainMenu() {
        String choice;
        System.out.println("1.Add New Services: " + "\n" + "2.Show Services: " + "\n" + "3.Add New Customer: " + "\n" +
                "4.Show Information of Customer: " + "\n" + "5.Add New Booking: " + "\n"
                + "6.Show Information of Employee" + "\n" + "7.Exit: ");
        System.out.println("Enter your choice: ");
        choice = scanner.nextLine();
        switch (choice) {
            case "1": {
                addNewServices();
                break;
            }
            case "2": {
                showServices();
                break;
            }
            case "3": {
                addNewCustomer();
                break;
            }
            case "4": {
                showInformationCustomers();
                break;
            }
            case "5": {
                addNewBooking();
                break;
            }
            case "6": {
                showInformationEmployee();
                break;
            }
            case "7": {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Fail! Please choice again! Enter to continue....");
                scanner.nextLine();
                displayMainMenu();
                break;
            }
        }
    }

    private void showInformationEmployee() {

    }

    private void addNewBooking() {

    }

    private void showInformationCustomers() {

    }

    private void addNewCustomer() {

    }

    private void addNewServices() {
        String choice;
        System.out.println("1.Add New Villa: " + "\n" + "2.Add New House: " + "\n" + "3.Add New Room: " +
                "\n" + "4.Back To Menu: " + "\n" + "5.Exit: ");
        choice = scanner.nextLine();
        switch (choice) {
            case "1": {
                addListVillaService();
                break;
            }
            case "2": {
                addListHouseService();
                break;
            }
            case "3": {
                addListRoomService();
                break;
            }
            case "4": {
                displayMainMenu();
                break;
            }
            case "5": {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Fail! Please choice again! Enter to continue....");
                scanner.nextLine();
                addNewServices();
                break;
            }
        }
    }

    private void addListRoomService() {
        scanner = new Scanner(System.in);
        ArrayList<Room> roomArrayList = new ArrayList<>();
        roomArrayList = RoomCSV.getFileCSVtoListRoom();
        Room room = new Room();
        System.out.println("Enter Service Name: ");
        room.setServiceName(scanner.nextLine());
        System.out.println("Enter Area: ");
        do {
            try {
                double area = Double.parseDouble(scanner.nextLine());
                room.setArea(area);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter again: ");
            }
        } while (true);
        System.out.println("Enter RentalFee: ");
        do {
            try {
                double rentalFee = Double.parseDouble(scanner.nextLine());
                room.setRentalFee(rentalFee);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter again: ");
            }
        } while (true);
        System.out.println("Enter Max Guest: ");
        do {
            try {
              int maxGuest = Integer.parseInt(scanner.nextLine());
              room.setMaxGuest(maxGuest);
              break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter again: ");
            }
        } while (true);
        System.out.println("Enter Rental Type: ");
        room.setRentalFee(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter Room External Services: ");
        room.setExternalServices(scanner.nextLine());
        roomArrayList.add(room);
        RoomCSV.writerRoomToFileCSV(roomArrayList);
        System.out.println("Add new Room complete!!! Enter to continue...");
        scanner.nextLine();
        displayMainMenu();
    }

    private void addListHouseService() {
        scanner = new Scanner(System.in);
        ArrayList<House> houseArrayList = new ArrayList<>();
        houseArrayList = HouseCSV.getFileCSVtoListHouse();
        House house = new House();
        System.out.println("Enter Service Name: ");
        house.setServiceName(scanner.nextLine());
        System.out.println("Enter Area: ");
        do {
            try {
                double area = Double.parseDouble(scanner.nextLine());
                house.setArea(area);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter again: ");
            }
        } while (true);
        System.out.println("Enter RentalFee: ");
        do {
            try {
                double rentalFee = Double.parseDouble(scanner.nextLine());
                house.setRentalFee(rentalFee);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter again: ");
            }
        } while (true);
        System.out.println("Enter Max Guest: ");
        do {
            try {
                int maxGuest = Integer.parseInt(scanner.nextLine());
                house.setMaxGuest(maxGuest);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter again: ");
            }
        } while (true);
        System.out.println("Enter Rental Type: ");
        house.setRentalType(scanner.nextLine());
        System.out.println("Enter Room Standard: ");
        house.setRoomStandard(scanner.nextLine());
        System.out.println("Enter House Description");
        house.setHouseDescription(scanner.nextLine());
        System.out.println("Enter Number Of Floors");
        do {
            try {
                int numberOfFloors = Integer.parseInt(scanner.nextLine());
                house.setNumberOfFloors(numberOfFloors);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter again: ");
            }
        } while (true);
        houseArrayList.add(house);
        HouseCSV.writerHouseToFileCSV(houseArrayList);
        System.out.println("Add new House complete!!! Enter to continue...");
        scanner.nextLine();
        displayMainMenu();
    }

    private void addListVillaService() {
        scanner = new Scanner(System.in);
        ArrayList<Villa> villaArrayList = new ArrayList<>();
        villaArrayList = VillaCSV.getFileCSVtoListVilla();
        Villa villa = new Villa();
        System.out.println("Enter Service Name: ");
        villa.setServiceName(scanner.nextLine());
        System.out.println("Enter Area: ");
        do {
            try {
                 double area = Double.parseDouble(scanner.nextLine());
                 villa.setArea(area);
                 break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter again: ");
            }
        } while (true);
        System.out.println("Enter RentalFee: ");
        do {
            try {
                double rentalFee = Double.parseDouble(scanner.nextLine());
                villa.setRentalFee(rentalFee);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter again: ");
            }
        } while (true);
        System.out.println("Enter Max Guest: ");
        do {
            try {
                int maxGuest = Integer.parseInt(scanner.nextLine());
                villa.setMaxGuest(maxGuest);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter again: ");
            }
        } while (true);
        System.out.println("Enter Rental Type: ");
        villa.setRentalType(scanner.nextLine());
        System.out.println("Enter Room Standard: ");
        villa.setRoomStandard(scanner.nextLine());
        System.out.println("Enter Villa Description: ");
        villa.setVillaDescription(scanner.nextLine());
        System.out.println("Enter Number Of Floors: ");
        do {
            try {
                int numberOfFloors = Integer.parseInt(scanner.nextLine());
                villa.setNumberOfFloors(numberOfFloors);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter again: ");
            }
        } while (true);
        System.out.println("Enter Pool Area: ");
        do {
            try {
                double poolArea = Double.parseDouble(scanner.nextLine());
                villa.setPoolArea(poolArea);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter again: ");
            }
        } while (true);
        villaArrayList.add(villa);
        VillaCSV.writerVillaToFileCSV(villaArrayList);
        System.out.println("Add new Villa complete!!! Enter to continue...");
        scanner.nextLine();
        displayMainMenu();
    }

    private void showServices() {
        String choice;
        System.out.println("1.Show All Villa: " + "\n" + "2.Show All House: " + "\n" + "3.Show All Room: " + "\n"
                + "4.Show All Name Villa Not Duplicate: " + "\n" + "5.Show All Name House Not Duplicate:" +
                "\n" + "6.Show All Name Room Not Duplicate: " + "\n" + "7.Back To Menu: " +
                "\n" + "7.Exit");
        choice = scanner.nextLine();
        switch (choice) {
            case "1": {
                showAllVilla();
                break;
            }
            case "2": {
                showAllHouse();
                break;
            }
            case "3": {
                showAllRoom();
                break;
            }
            case "4": {
                showAllNameVillaNotDuplicate();
                break;
            }
            case "5": {
                showAllNameHouseNotDuplicate();
                break;
            }
            case "6": {
                showAllNameRoomNotDuplicate();
                break;
            }
            case "7": {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Fail! Please choice again! Enter to continue....");
                scanner.nextLine();
                showServices();
                break;
            }
        }
    }

    private void showAllNameRoomNotDuplicate() {

    }

    private void showAllNameHouseNotDuplicate() {

    }

    private void showAllNameVillaNotDuplicate() {

    }

    private void showAllRoom() {
        ArrayList<Room> roomArrayList = RoomCSV.getFileCSVtoListRoom();
        for (Room room : roomArrayList) {
            System.out.println("---------------------------------");
            System.out.println("Information Villa:" + room.showInfo());
            System.out.println("---------------------------------");
        }
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        showServices();
    }

    private void showAllHouse() {
        ArrayList<House> houseArrayList = HouseCSV.getFileCSVtoListHouse();
        for (House house : houseArrayList) {
            System.out.println("---------------------------------");
            System.out.println("Information Villa:" + house.showInfo());
            System.out.println("---------------------------------");
        }
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        showServices();
    }

    private void showAllVilla() {
        ArrayList<Villa> villaArrayList = VillaCSV.getFileCSVtoListVilla();
        for (Villa villa : villaArrayList) {
            System.out.println("---------------------------------");
            System.out.println("Information Villa:" + villa.showInfo());
            System.out.println("---------------------------------");
        }
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        showServices();
    }
}
