package service;

import commons.RoomCSV;
import models.Room;
import validation.checkInput;

import java.util.ArrayList;
import java.util.Scanner;

public class AddNewRoom {
    public static void addNewRoom() {
        Scanner scanner = new Scanner(System.in);
        Room room = new Room();
        checkInput checkInput = new checkInput();
        ArrayList<Room> roomArrayList = new ArrayList<>();
        roomArrayList = RoomCSV.getFileCSVtoListRoom();
        System.out.println("Enter Id Villa: ");
        room.setId(scanner.nextLine());
        System.out.println("Enter Service Name: ");
        room.setServiceName(checkInput.checkServiceNameOrCheckRentalTypeOrRoomStandard());
        System.out.println("Enter Area: ");
        room.setArea(checkInput.checkAreaUseOrAreaPool());
        System.out.println("Enter RentalFee: ");
        room.setRentalFee(checkInput.checkRentalFee());
        System.out.println("Enter Max Guest: ");
        room.setMaxGuest(checkInput.checkMaxGuest());
        System.out.println("Enter Rental Type: ");
        room.setRentalType(checkInput.checkServiceNameOrCheckRentalTypeOrRoomStandard());
        System.out.println("Enter Room External Services: ");
        room.setExternalServices(scanner.nextLine());
        roomArrayList.add(room);
        RoomCSV.writerRoomToFileCSV(roomArrayList);
    }
}
