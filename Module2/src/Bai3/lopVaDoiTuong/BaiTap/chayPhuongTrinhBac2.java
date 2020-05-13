package Bai3.lopVaDoiTuong.BaiTap;

import java.util.Scanner;

public class chayPhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        double number1 = Double.parseDouble(input.nextLine());
        System.out.print("Nhập số b: ");
        double number2 = Double.parseDouble(input.nextLine());
        System.out.print("Nhập số c: ");
        double number3 = Double.parseDouble(input.nextLine());
        phuongTrinhBacHai chayChuongTrinh = new phuongTrinhBacHai(number1,number2,number3);
        System.out.println(chayChuongTrinh.display());
        System.out.println("Denlta của phương trình là: " + chayChuongTrinh.getDenlta());
        System.out.println("Các nghiệm của phương trình là: ");
        chayChuongTrinh.getResult();
    }
}
