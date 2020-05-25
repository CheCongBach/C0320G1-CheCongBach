package service;

import commons.HouseCSV;
import models.House;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShowHouseNotDuplicate {
    public static void showHouseNotDuplicate() {
        List<House> houses = HouseCSV.getFileCSVtoListHouse();
        Set<House> houseSet = new HashSet<>();
        for (House house : houses) {
            houseSet.add(house);
        }
        for (House house : houseSet) {
            System.out.println("---------------------------------");
            System.out.println("Information House not duplicate: " + house.showInfo());
        }
    }
}
