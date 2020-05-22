package validation;

import models.Villa;

import java.util.Scanner;

public class checkInput {
    public double checkAreaUseOrAreaPool() {
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                double area = Double.parseDouble(scanner.nextLine());
                if (area > 30) {
                    return area;
                } else {
                    System.out.println("The area must be greater than 30 square meters");
                    System.out.println("Please enter again");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter the wrong data type");
                System.out.println("Please enter again");
            }
        } while (true);
    }
    public double checkRentalFee() {
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                double rentalFee = Double.parseDouble(scanner.nextLine());
                if (rentalFee > 0) {
                    return rentalFee;
                } else {
                    System.out.println("Rent costs must be positive");
                    System.out.println("Please enter again");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter the wrong data type");
                System.out.println("Please enter again");
            }
        } while (true);
    }
    public int checkMaxGuest() {
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                int maxGuest = Integer.parseInt(scanner.nextLine());
                if (maxGuest > 0 && maxGuest < 20) {
                    return maxGuest;
                } else {
                    System.out.println("Maximum number of people must be greater than 0 and smaller than 30");
                    System.out.println("Please enter again");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter the wrong data type");
                System.out.println("Please enter again");
            }
        } while (true);
    }
    public int checkNumberOfFloors() {
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                int numberOfFloors = Integer.parseInt(scanner.nextLine());
                if (numberOfFloors > 0) {
                    return numberOfFloors;
                } else {
                    System.out.println("The number of floors must be a positive integer");
                    System.out.println("Please enter again");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter the wrong data type");
                System.out.println("Please enter again");
            }
        } while (true);
    }
    public String checkServiceName() {
        String temp = "";
        Scanner scanner = new Scanner(System.in);
        String serviceName = scanner.nextLine();
        serviceName = serviceName.trim().toLowerCase();
        temp += String.valueOf(serviceName.charAt(0)).toUpperCase();
        for (int i = 1; i < serviceName.length(); i++) {
            if (serviceName.charAt(i) == ' ' && serviceName.charAt(i - 1) == ' ') {
                continue;
            } else if (serviceName.charAt(i - 1) == ' ') {
                temp += String.valueOf(serviceName.charAt(i)).toUpperCase();
            } else {
                temp += serviceName.charAt(i);
            }
        }
        return temp;
    }
    public String checkRentalTypeOrRoomStandard(String str) {
        str = str.trim().toLowerCase();
        String temp = "" + String.valueOf(str.charAt(0)).toUpperCase();
        for (int j = 1; j < str.length(); j++) {
            if (str.charAt(j) == ' ' && str.charAt(j - 1) == ' ') {
                continue;
            } else if (str.charAt(j - 1) == ' ') {
                temp += String.valueOf(str.charAt(j)).toUpperCase();
            } else {
                temp += str.charAt(j);
            }
        }
        return temp;
    }
}
