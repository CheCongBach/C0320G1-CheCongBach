package Bai4.keThua.BaiTapSao;

public class chayLopTriangle {
    public static void main(String[] args) {
        lopTriangle triangle1 = new lopTriangle();
        System.out.println(triangle1);
        System.out.println("Chu vi của tam giác triangle1 là: " + triangle1.getPerimeter());
        System.out.println("Diện tích của tam giác triangle1 là: " + triangle1.getArea());
        triangle1 = new lopTriangle(60,70,80,90);
        System.out.println("Tam giác sau triangle1 sau khi thay đổi tham số có: " + triangle1);
        System.out.println("Chu vi của tam giác triangle1 là: " + triangle1.getPerimeter());
        System.out.println("Diện tích của tam giác triangle1 là: " + triangle1.getArea());
    }
}
