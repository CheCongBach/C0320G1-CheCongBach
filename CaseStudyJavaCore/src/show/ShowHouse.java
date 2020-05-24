package show;

import commons.HouseCSV;
import models.House;

import java.util.List;

public class ShowHouse {
    public static void showHouse() {
        List<House> houseArrayList = HouseCSV.getFileCSVtoListHouse();
        for (House house : houseArrayList) {
            System.out.println("---------------------------------");
            System.out.println("Information Villa:\n" + house.showInfo());
            System.out.println("---------------------------------");
        }
    }
}
