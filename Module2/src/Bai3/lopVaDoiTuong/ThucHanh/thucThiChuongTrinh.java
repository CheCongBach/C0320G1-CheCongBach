package Bai3.lopVaDoiTuong.ThucHanh;

import java.util.Scanner;

public class thucThiChuongTrinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chiều dài : ");
        double height = Double.parseDouble(input.nextLine());
        System.out.print("Nhập chiều rộng : ");
        double width = Double.parseDouble(input.nextLine());
        lopHinhChuNhat hinhChuNhat = new lopHinhChuNhat(height,width);
        System.out.println(hinhChuNhat.display());
        System.out.println("Diện tích hình chữ nhật là: " + hinhChuNhat.getArea());
        System.out.println("Chu vi hình chữ nhật là: " + hinhChuNhat.getPerimeter());
    }
}
