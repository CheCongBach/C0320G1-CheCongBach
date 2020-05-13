package Bai2.mangVaPhuongThucTrongJaVa.ThucHanh;

import java.util.Scanner;

public class chuyenDoiNhietDo {
    public static double chuyenTuDoCsangDoF(double doC) {
        double doF = (9.0 / 5) * doC + 32;
        return  doF;
    }
    public static double chuyenTuDoFsangDoC(double doF) {
        double doC = (5.0 / 9) * (doF - 32);
        return doC;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double doC;
        double doF;
        int choose;
        do {
            System.out.println("Menu.");
            System.out.println("1. Chuyển từ độ F sang độ C");
            System.out.println("2. Chuyển từ độ C sang độ F");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    System.out.print("Nhập thông số độ F: ");
                    doF = Double.parseDouble(input.nextLine());
                    System.out.println("Kết quả từ độ F sang độ C là: " + chuyenTuDoFsangDoC(doF) + " độ C");
                    break;
                case 2:
                    System.out.print("Nhập thông số độ C: ");
                    doC = Double.parseDouble(input.nextLine());
                    System.out.println("Kết quả từ độ C sang độ F là: " + chuyenTuDoCsangDoF(doC) + " độ F");
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choose != 0);
    }
}

