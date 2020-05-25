package service;

import commons.VillaCSV;
import models.Villa;

import java.util.List;

public class ShowVilla {
    public static void showVilla() {
        List<Villa> villaArrayList = VillaCSV.getFileCSVtoListVilla();
        for (Villa villa : villaArrayList) {
            System.out.println("---------------------------------");
            System.out.println("Information Villa:\n" + villa.showInfo());
            System.out.println("---------------------------------");
        }
    }
}
