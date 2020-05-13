package Bai1.ngonNguLapTrinhJava.ThucHanh;

import java.util.Scanner;

public class phuongTrinhBatNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b;
        int c = 0;
        System.out.print("Nhập số a: ");
        a = input.nextFloat();
        System.out.print("Nhập số b: ");
        b = input.nextFloat();
        System.out.println("Số c luôn luôn là: " + c);
        if (a != 0) {
            double result = (c - b)/a;
            System.out.print("Nghiệm của phương trình là: " + result);
        } else {
            if (b == 0) {
                System.out.print("Phương trình có vô số nghiệm");
            } else {
                System.out.print("Phương trình vô nghiệm");
            }
        }
    }
}
