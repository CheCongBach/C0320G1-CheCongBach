package service;

import commons.RoomCSV;
import models.Room;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShowRoomNotDuplicate {
    public static void showRoomNotDuplicate() {
        List<Room> rooms = RoomCSV.getFileCSVtoListRoom();
        Set<Room> roomSet = new HashSet<>();
        for (Room room : rooms) {
            roomSet.add(room);
        }
        for (Room room : roomSet) {
            System.out.println("---------------------------------");
            System.out.println("Information Room not duplicate: " + room.showInfo());
        }
    }
}
