package Bai4.keThua.ThucHanh;

public class chayLopRecTanGle {
    public static void main(String[] args) {
        lopRecTanGle thucThi = new lopRecTanGle();
        System.out.println(thucThi);

        thucThi = new lopRecTanGle(7,8);
        System.out.println(thucThi);

        thucThi = new lopRecTanGle(8,9,"Red",true);
        System.out.println(thucThi);

        System.out.println("Area is: " + thucThi.getArea());
        System.out.println("Perimeter is: " + thucThi.getPerimeter());
    }
}
