package Bai1.ngonNguLapTrinhJava.ThucHanh;

import java.util.Scanner;

public class suDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        height = sc.nextFloat();
        System.out.print("Nhập chiều rộng: ");
        width = sc.nextFloat();
        float area = width * height;
        System.out.print("Diện tích là: " + area);
    }
}
