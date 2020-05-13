package Bai1.ngonNguLapTrinhJava.ThucHanh;

import java.util.Scanner;

public class kiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số cần kiểm tra: ");
        int number = input.nextInt();
        if (number < 2) {
            System.out.print("Đây không phải là số nguyên tố");
        } else {
            int i =2;
            boolean check = true;
            for (i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print("Đây là số nguyên tố");
            } else {
                System.out.print("Đây không phải là số nguyên tố");
            }
        }
    }
}
