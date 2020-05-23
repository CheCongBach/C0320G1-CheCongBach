package controllers;

import commons.HouseCSV;
import commons.RoomCSV;
import commons.VillaCSV;
import models.House;
import models.Room;
import models.Villa;
import validation.checkInput;

import java.util.*;

public class MainControllers {
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
        scanner = new Scanner(System.in);


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
        checkInput checkInput = new checkInput();
        System.out.println("Enter id: ");
        room.setId(scanner.nextLine());
        System.out.println("Enter Service Name: ");
        room.setServiceName(checkInput.checkServiceName());
        System.out.println("Enter Area: ");
        room.setArea(checkInput.checkAreaUseOrAreaPool());
        System.out.println("Enter RentalFee: ");
        room.setRentalFee(checkInput.checkRentalFee());
        System.out.println("Enter Max Guest: ");
        room.setMaxGuest(checkInput.checkMaxGuest());
        System.out.println("Enter Rental Type: ");
        room.setRentalType(checkInput.checkRentalTypeOrRoomStandard(scanner.nextLine()));
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
        checkInput checkInput = new checkInput();
        System.out.println("Enter id: ");
        house.setId(scanner.nextLine());
        System.out.println("Enter Service Name: ");
        house.setServiceName(checkInput.checkServiceName());
        System.out.println("Enter Area: ");
        house.setArea(checkInput.checkAreaUseOrAreaPool());
        System.out.println("Enter RentalFee: ");
        house.setRentalFee(checkInput.checkRentalFee());
        System.out.println("Enter Max Guest: ");
        house.setMaxGuest(checkInput.checkMaxGuest());
        System.out.println("Enter Rental Type: ");
        house.setRentalType(checkInput.checkRentalTypeOrRoomStandard(scanner.nextLine()));
        System.out.println("Enter Room Standard: ");
        house.setRoomStandard(checkInput.checkRentalTypeOrRoomStandard(scanner.nextLine()));
        System.out.println("Enter House Description");
        house.setHouseDescription(scanner.nextLine());
        System.out.println("Enter Number Of Floors");
        house.setNumberOfFloors(checkInput.checkNumberOfFloors());
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
        checkInput checkInput = new checkInput();
        System.out.println("Enter id: ");
        villa.setId(scanner.nextLine());
        System.out.println("Enter Service Name: ");
        villa.setServiceName(checkInput.checkServiceName());
        System.out.println("Enter Area: ");
        villa.setArea(checkInput.checkAreaUseOrAreaPool());
        System.out.println("Enter RentalFee: ");
        villa.setRentalFee(checkInput.checkRentalFee());
        System.out.println("Enter Max Guest: ");
        villa.setMaxGuest(checkInput.checkMaxGuest());
        System.out.println("Enter Rental Type: ");
        villa.setRentalType(checkInput.checkRentalTypeOrRoomStandard(scanner.nextLine()));
        System.out.println("Enter Room Standard: ");
        villa.setRoomStandard(checkInput.checkRentalTypeOrRoomStandard(scanner.nextLine()));
        System.out.println("Enter Villa Description: ");
        villa.setVillaDescription(scanner.nextLine());
        System.out.println("Enter Number Of Floors: ");
        villa.setNumberOfFloors(checkInput.checkNumberOfFloors());
        System.out.println("Enter Pool Area: ");
        villa.setPoolArea(checkInput.checkAreaUseOrAreaPool());
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
        List<Room> rooms = RoomCSV.getFileCSVtoListRoom();
        Set<Room> roomSet = new HashSet<>();
        for (Room room : rooms) {
            roomSet.add(room);
        }
        for (Room room : roomSet) {
            System.out.println("---------------------------------");
            System.out.println("Information Room not duplicate: " + room.showInfo());
        }
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        showServices();
    }

    private void showAllNameHouseNotDuplicate() {
        List<House> houses = HouseCSV.getFileCSVtoListHouse();
        Set<House> houseSet = new HashSet<>();
        for (House house : houses) {
            houseSet.add(house);
        }
        for (House house : houseSet) {
            System.out.println("---------------------------------");
            System.out.println("Information House not duplicate: " + house.showInfo());
        }
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        showServices();
    }

    private void showAllNameVillaNotDuplicate() {
        List<Villa> villas = VillaCSV.getFileCSVtoListVilla();
        Set<Villa> villaSet = new HashSet<>();
        for (Villa villa : villas) {
            villaSet.add(villa);
        }
        for (Villa villa : villaSet) {
            System.out.println("---------------------------------");
            System.out.println("Information Villa not duplicate: " + villa.showInfo());
        }
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        showServices();
    }

    private void showAllRoom() {
        List<Room> roomArrayList = RoomCSV.getFileCSVtoListRoom();
        for (Room room : roomArrayList) {
            System.out.println("---------------------------------");
            System.out.println("Information Villa:\n" + room.showInfo());
            System.out.println("---------------------------------");
        }
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        showServices();
    }

    private void showAllHouse() {
        List<House> houseArrayList = HouseCSV.getFileCSVtoListHouse();
        for (House house : houseArrayList) {
            System.out.println("---------------------------------");
            System.out.println("Information Villa:\n" + house.showInfo());
            System.out.println("---------------------------------");
        }
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        showServices();
    }

    private void showAllVilla() {
        List<Villa> villaArrayList = VillaCSV.getFileCSVtoListVilla();
        for (Villa villa : villaArrayList) {
            System.out.println("---------------------------------");
            System.out.println("Information Villa:\n" + villa.showInfo());
            System.out.println("---------------------------------");
        }
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        showServices();
    }
}
