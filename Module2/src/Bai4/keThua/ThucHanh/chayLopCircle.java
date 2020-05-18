package Bai4.keThua.ThucHanh;

public class chayLopCircle {
    public static void main(String[] args) {
        lopCircle thucThi = new lopCircle();
        System.out.println(thucThi);
        thucThi = new lopCircle(3.5);
        System.out.println(thucThi);
        thucThi = new lopCircle(3.5,"indigo",false);
        System.out.println(thucThi);
        System.out.println("Area is: " + thucThi.getArea());
        System.out.println("Perimeter is: " + thucThi.getPerimeter());
    }
}
