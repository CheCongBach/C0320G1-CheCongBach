package Bai1.ngonNguLapTrinhJava.BaiTap;

import java.util.Scanner;

public class chuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số tiền usd cần đổi: ");
        Double usd = Double.parseDouble(input.nextLine());
        Double vnd = 23000.0;
        Double quyDoi = usd * vnd;
        System.out.print("Số tiền qui đổi qua vnd là: " + quyDoi);
    }
}
