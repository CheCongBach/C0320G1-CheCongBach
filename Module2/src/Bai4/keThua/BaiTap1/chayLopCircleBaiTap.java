package Bai4.keThua.BaiTap1;

public class chayLopCircleBaiTap {
    public static void main(String[] args) {
        lopCircleBaiTap circle1 = new lopCircleBaiTap();
        System.out.println("Hình tròn 1: " + circle1);
        System.out.println("Diện tích hình tròn 1: " + circle1.getArea(1));
        System.out.println("Chu vi hình tròn 1: " + circle1.getPerimeter(1));
        System.out.println("");
        circle1 = new lopCircleBaiTap(4,"blue",true);
        System.out.println("Hình tròn 2: " + circle1);
        System.out.println("Diện tich hình tròn 2: " + circle1.getArea(4));
        System.out.println("Chu vi hình tròn 2: " + circle1.getPerimeter(4));
    }
}
