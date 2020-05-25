package service;

import commons.VillaCSV;
import models.Villa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShowVillaNotDuplicate {
    public static void showVillaNotDuplicate() {
        List<Villa> villas = VillaCSV.getFileCSVtoListVilla();
        Set<Villa> villaSet = new HashSet<>();
        for (Villa villa : villas) {
            villaSet.add(villa);
        }
        for (Villa villa : villaSet) {
            System.out.println("---------------------------------");
            System.out.println("Information Villa not duplicate: " + villa.showInfo());
        }
    }
}
