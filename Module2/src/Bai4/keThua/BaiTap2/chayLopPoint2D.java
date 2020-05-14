package Bai4.keThua.BaiTap2;

public class chayLopPoint2D {
    public static void main(String[] args) {
        lopPoint2D point2d = new lopPoint2D();
        System.out.println("Lớp point2d " + point2d);
        System.out.println("Và mảng gồm 2 số là: ");
        point2d.getXY();
        System.out.println("");
        point2d = new lopPoint2D(9,10);
        System.out.println("Lớp point2d khi thay đổi giá trị " + point2d);
        System.out.println("Và mảng mới gồm 2 số là: ");
        point2d.getXY();
    }
}
