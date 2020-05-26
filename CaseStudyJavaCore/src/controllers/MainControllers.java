package controllers;

import service.*;

import java.util.*;

public class MainControllers {
    Scanner scanner = new Scanner(System.in);
    public void displayMainMenu() {
        String choice;
        System.out.println("1.Add New Services: " + "\n" + "2.Show Services: " + "\n" + "3.Add New Customer: " + "\n" +
                "4.Show Information of Customer: " + "\n" + "5.Add New Booking: " + "\n" + "6.Add New Employee: " + "\n"
                + "7.Show Information of Employee: " + "\n" + "8.Add booking and show booking cinema 4D: " + "\n" + "9.Search Filing Cabinets of Employee: " + "\n" + "10.Exit: ");
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
                addNewEmployee();
                break;
            }
            case "7": {
                showInformationEmployee();
                break;
            }
            case "8": {
                addBookingAndShowBookingCinema4D();
                break;
            }
            case "9": {
                searchFilingCabinetsOfEmployee();
                break;
            }
            case "10": {
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
                "\n" + "8.Exit");
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
                displayMainMenu();
                break;
            }
            case "8": {
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

    private void searchFilingCabinetsOfEmployee() {

    }

    private void addBookingAndShowBookingCinema4D() {
        AddBookingCinema.addBookingCinema();
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        displayMainMenu();
    }

    private void showInformationEmployee() {
        ShowAllEmployee.showAllEmployee();
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        displayMainMenu();
    }

    private void addNewEmployee() {
        AddNewEmployee.addNewEmployee();
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        displayMainMenu();
    }

    private void addNewBooking() {
        AddNewBooking.addNewBooking();
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        displayMainMenu();
    }

    private void showInformationCustomers() {
        ShowCustomer.showInformationCustomerSort();
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        showServices();
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
        addNewServices();
    }

    private void addListHouseService() {
        AddNewHouse.addNewHouse();
        System.out.println("Add new House complete!!! Enter to continue...");
        scanner.nextLine();
        addNewServices();
    }

    private void addListVillaService() {
        AddNewVilla.addNewVilla();
        System.out.println("Add new Villa complete!!! Enter to continue...");
        scanner.nextLine();
        addNewServices();
    }

    private void showAllNameRoomNotDuplicate() {
        ShowRoomNotDuplicate.showRoomNotDuplicate();
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        showServices();
    }

    private void showAllNameHouseNotDuplicate() {
        ShowHouseNotDuplicate.showHouseNotDuplicate();
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        showServices();
    }

    private void showAllNameVillaNotDuplicate() {
        ShowVillaNotDuplicate.showVillaNotDuplicate();
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        showServices();
    }

    private void showAllRoom() {
        ShowRoom.showRoom();
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        showServices();
    }

    private void showAllHouse() {
        ShowHouse.showHouse();
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        showServices();
    }

    private void showAllVilla() {
        ShowVilla.showVilla();
        System.out.println("Enter to continue.....");
        scanner.nextLine();
        showServices();
    }
}
