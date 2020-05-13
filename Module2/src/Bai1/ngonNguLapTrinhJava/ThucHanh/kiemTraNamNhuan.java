package Bai1.ngonNguLapTrinhJava.ThucHanh;

import java.util.Scanner;

public class kiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Nhập năm cần kiểm tra: ");
        year = input.nextInt();
        boolean check = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    check = true;
                }
            } else {
                check = true;
            }
        }
        if (check) {
            System.out.print("Năm " + year + " là năm nhuận" );
        } else {
            System.out.print("Năm " + year + " không phải là năm nhuận");
        }
    }
}
