package Bai5.AdvancedObjectOrientedDesign.ThucHanh2.kiemThuLopCircleComparator;

import Bai5.AdvancedObjectOrientedDesign.ThucHanh2.circleComparator.lopCircleComparator;

import java.util.Arrays;

import java.util.Comparator;

public class chayThuLopCircleComparator {
    public static void main(String[] args) {
        lopCircleComparator[] circles = new lopCircleComparator[3];
        circles[0] = new lopCircleComparator(3.5);
        circles[1] = new lopCircleComparator();
        circles[2] = new lopCircleComparator(3.6,"Indigo",true);
        System.out.println("Pre-sorted:");
        for (lopCircleComparator circle : circles) {
            System.out.println(circle);
        }

        System.out.println("Use compare");
        Comparator circleComparator = new lopCircleComparator();
        System.out.println(circleComparator.compare(circles[2],circles[1]));
        Arrays.sort(circles,circleComparator);

        System.out.println("After-sorted:");
        for (lopCircleComparator circle : circles) {
            System.out.println(circle);
        }
    }
}
