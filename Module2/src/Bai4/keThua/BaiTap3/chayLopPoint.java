package Bai4.keThua.BaiTap3;

import Bai4.keThua.BaiTap2.lopPoint2D;

public class chayLopPoint {
    public static void main(String[] args) {
        lopPoint point = new lopPoint();
        System.out.println("Lớp point " + point);
        System.out.println("Và mảng gồm 2 số đó là: ");
        point.getXY();
        System.out.println("");
        point = new lopPoint(3,4);
        System.out.println("Lớp point khi thay đổi giá trị " + point);
        System.out.println("Và mảng mới gồm 2 số là: ");
        point.getXY();
    }
}
