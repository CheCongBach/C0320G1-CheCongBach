package add;

import commons.VillaCSV;
import models.Villa;
import validation.checkInput;

import java.util.ArrayList;
import java.util.Scanner;

public class AddNewVilla {
    public static void addNewVilla() {
        Scanner scanner = new Scanner(System.in);
        Villa villa = new Villa();
        checkInput checkInput = new checkInput();
        ArrayList<Villa> villaArrayList = new ArrayList<>();
        villaArrayList = VillaCSV.getFileCSVtoListVilla();
        System.out.println("Enter Id Villa: ");
        villa.setId(scanner.nextLine());
        System.out.println("Enter Service Name: ");
        villa.setServiceName(checkInput.checkServiceNameOrCheckRentalTypeOrRoomStandard());
        System.out.println("Enter Area: ");
        villa.setArea(checkInput.checkAreaUseOrAreaPool());
        System.out.println("Enter RentalFee: ");
        villa.setRentalFee(checkInput.checkRentalFee());
        System.out.println("Enter Max Guest: ");
        villa.setMaxGuest(checkInput.checkMaxGuest());
        System.out.println("Enter Rental Type: ");
        villa.setRentalType(checkInput.checkServiceNameOrCheckRentalTypeOrRoomStandard());
        System.out.println("Enter Room Standard: ");
        villa.setRoomStandard(checkInput.checkServiceNameOrCheckRentalTypeOrRoomStandard());
        System.out.println("Enter Villa Description: ");
        villa.setVillaDescription(scanner.nextLine());
        System.out.println("Enter Number Of Floors: ");
        villa.setNumberOfFloors(checkInput.checkNumberOfFloors());
        System.out.println("Enter Pool Area: ");
        villa.setPoolArea(checkInput.checkAreaUseOrAreaPool());
        villaArrayList.add(villa);
        VillaCSV.writerVillaToFileCSV(villaArrayList);
    }
}
