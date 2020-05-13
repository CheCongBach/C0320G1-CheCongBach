package Bai1.ngonNguLapTrinhJava.BaiTap;

import java.util.Scanner;

public class HaiChucSoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 2;
        int count = 0;
        while (count < 20) {
            boolean check = true;
            for (int i =2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
