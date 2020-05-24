package controllers;

import add.AddNewCustomer;
import add.AddNewHouse;
import add.AddNewRoom;
import add.AddNewVilla;
import show.*;

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

    private void showInformationEmployee() {

    }

    private void addNewBooking() {

    }

    private void showInformationCustomers() {
        ShowCustomer.showInformationCustomerSort();
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        displayMainMenu();
    }

    private void addNewCustomer() {
        AddNewCustomer.addNewCustomer();
        System.out.println("Add new Customer complete!!! Enter to continue...");
        scanner.nextLine();
        displayMainMenu();
    }

    private void addListRoomService() {
        AddNewRoom.addNewRoom();
        System.out.println("Add new Room complete!!! Enter to continue...");
        scanner.nextLine();
        displayMainMenu();
    }

    private void addListHouseService() {
        AddNewHouse.addNewHouse();
        System.out.println("Add new House complete!!! Enter to continue...");
        scanner.nextLine();
        displayMainMenu();
    }

    private void addListVillaService() {
        AddNewVilla.addNewVilla();
        System.out.println("Add new Villa complete!!! Enter to continue...");
        scanner.nextLine();
        displayMainMenu();
    }

    private void showAllNameRoomNotDuplicate() {
        ShowRoomNotDuplicate.showRoomNotDuplicate();
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        displayMainMenu();
    }

    private void showAllNameHouseNotDuplicate() {
        ShowHouseNotDuplicate.showHouseNotDuplicate();
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        displayMainMenu();
    }

    private void showAllNameVillaNotDuplicate() {
        ShowVillaNotDuplicate.showVillaNotDuplicate();
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        displayMainMenu();
    }

    private void showAllRoom() {
        ShowRoom.showRoom();
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        displayMainMenu();
    }

    private void showAllHouse() {
        ShowHouse.showHouse();
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        displayMainMenu();
    }

    private void showAllVilla() {
        ShowVilla.showVilla();
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        displayMainMenu();
    }
}
