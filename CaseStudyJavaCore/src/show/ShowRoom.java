package show;

import commons.RoomCSV;
import models.Room;

import java.util.List;

public class ShowRoom {
    public static void showRoom() {
        List<Room> roomArrayList = RoomCSV.getFileCSVtoListRoom();
        for (Room room : roomArrayList) {
            System.out.println("---------------------------------");
            System.out.println("Information Villa:\n" + room.showInfo());
            System.out.println("---------------------------------");
        }
    }
}
