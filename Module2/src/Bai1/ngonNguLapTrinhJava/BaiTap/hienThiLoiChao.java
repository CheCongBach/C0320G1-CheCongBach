package Bai1.ngonNguLapTrinhJava.BaiTap;

import java.util.Scanner;

public class hienThiLoiChao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String name = input.nextLine();
        System.out.print("Xin chào: " + name);
    }
}
