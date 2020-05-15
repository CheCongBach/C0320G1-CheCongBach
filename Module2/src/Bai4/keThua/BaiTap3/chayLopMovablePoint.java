package Bai4.keThua.BaiTap3;

public class chayLopMovablePoint {
    public static void main(String[] args) {
        lopMovablePoint movePoint = new lopMovablePoint();
        System.out.println("Lớp point " + movePoint);
        System.out.println("Và mảng mới gồm 4 số đó là: ");
        movePoint.getSpeed();
        System.out.println("");
        System.out.println("Các số x và y sau khi được tăng thêm các khoảng giá trị tương" +
                " ứng với SpeedX và SpeedY là: ");
        movePoint.move();
        System.out.println("");
        movePoint = new lopMovablePoint(7,8,9,10);
        System.out.println("Lớp point khi thay đổi giá trị " + movePoint);
        System.out.println("Và mảng mới gồm 4 số khi thay đổi giá trị là: ");
        movePoint.getSpeed();
        System.out.println("");
        System.out.println("Các số x và y sau khi được tăng thêm các khoảng giá trị tương" +
                " ứng với SpeedX và SpeedY là: ");
        movePoint.move();
    }
}
