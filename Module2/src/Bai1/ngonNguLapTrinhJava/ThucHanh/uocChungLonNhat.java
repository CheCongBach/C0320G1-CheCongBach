package Bai1.ngonNguLapTrinhJava.ThucHanh;

import java.util.Scanner;

public class uocChungLonNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Nhập số a: ");
        a = Integer.parseInt(input.nextLine());
        System.out.print("Nhập số b: ");
        b = Integer.parseInt(input.nextLine());
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b != 0) {
            System.out.println("ước chung lớn nhất là số b");
        } else if (a != 0 && b == 0) {
            System.out.println("ước chung lớn nhất là số a");
        } else if (a == 0 && b == 0) {
            System.out.println("không có ước chung lớn nhất");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("ước chung lớn nhất là: " + a);
    }
}
