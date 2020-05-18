package Bai5.AdvancedObjectOrientedDesign.ThucHanhSao.kiemThuLopCircleComparable;

import Bai5.AdvancedObjectOrientedDesign.ThucHanhSao.circleComparable.lopCircleComporable;

import java.util.Arrays;

public class chayThuLopCircleComparable {
    public static void main(String[] args) {
        lopCircleComporable[] circles = new lopCircleComporable[3];
        circles[0] = new lopCircleComporable(3.6);
        circles[1] = new lopCircleComporable();
        circles[2] = new lopCircleComporable(3.5,"Indigo", true);
        System.out.println("Pre-sorted:");
        for (lopCircleComporable circle : circles) {
            System.out.println(circle);
        }

        System.out.println("After-sorted:");
        Arrays.sort(circles);
        for (lopCircleComporable circle : circles) {
            System.out.println(circle);
        }

        System.out.println("Use compareTo");
        Comparable circleComparable = new lopCircleComporable();
        System.out.println(circleComparable.compareTo(circles[0]));
    }
}
