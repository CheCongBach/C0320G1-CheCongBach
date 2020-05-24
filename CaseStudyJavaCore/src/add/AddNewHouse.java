package add;

import commons.HouseCSV;
import models.House;
import validation.checkInput;

import java.util.ArrayList;
import java.util.Scanner;

public class AddNewHouse {
    public static void addNewHouse() {
        Scanner scanner = new Scanner(System.in);
        House house = new House();
        checkInput checkInput = new checkInput();
        ArrayList<House> houseArrayList = new ArrayList<>();
        houseArrayList = HouseCSV.getFileCSVtoListHouse();
        System.out.println("Enter Id House: ");
        house.setId(scanner.nextLine());
        System.out.println("Enter Service Name: ");
        house.setServiceName(checkInput.checkServiceNameOrCheckRentalTypeOrRoomStandard());
        System.out.println("Enter Area: ");
        house.setArea(checkInput.checkAreaUseOrAreaPool());
        System.out.println("Enter RentalFee: ");
        house.setRentalFee(checkInput.checkRentalFee());
        System.out.println("Enter Max Guest: ");
        house.setMaxGuest(checkInput.checkMaxGuest());
        System.out.println("Enter Rental Type: ");
        house.setRentalType(checkInput.checkServiceNameOrCheckRentalTypeOrRoomStandard());
        System.out.println("Enter Room Standard: ");
        house.setRoomStandard(checkInput.checkServiceNameOrCheckRentalTypeOrRoomStandard());
        System.out.println("Enter House Description");
        house.setHouseDescription(scanner.nextLine());
        System.out.println("Enter Number Of Floors");
        house.setNumberOfFloors(checkInput.checkNumberOfFloors());
        houseArrayList.add(house);
        HouseCSV.writerHouseToFileCSV(houseArrayList);
    }
}
