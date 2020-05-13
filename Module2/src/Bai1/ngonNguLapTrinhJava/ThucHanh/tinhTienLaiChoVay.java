package Bai1.ngonNguLapTrinhJava.ThucHanh;

import java.util.Scanner;

public class tinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money;
        int month;
        double interset_rate;
        System.out.print("Nhập số tiền gởi: ");
        money = Double.parseDouble(input.nextLine());
        System.out.print("Nhập số tháng gởi: ");
        month = Integer.parseInt(input.nextLine());
        System.out.print("Nhập tỉ lệ lãi suất: ");
        interset_rate = Double.parseDouble(input.nextLine());
        double total_interset = 0;
        for (int i = 0; i < month; i++) {
            total_interset = money * (interset_rate/100)/12 * month;
        }
        System.out.println("Số tiền lãi là: " + total_interset);
    }
}
