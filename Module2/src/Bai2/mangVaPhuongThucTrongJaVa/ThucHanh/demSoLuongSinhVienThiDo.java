package Bai2.mangVaPhuongThucTrongJaVa.ThucHanh;

import java.util.Scanner;

public class demSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng sinh viên: ");
            size = Integer.parseInt(input.nextLine());
            if (size > 30) {
                System.out.println("Số lượng sinh viên không được vượt quá 30");
            }
        } while (size > 30);
        array = new int[size];
        System.out.println("Nhập điểm của từng sinh viên: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("Hiển thị điểm của từng sinh viên");
        for (int i =0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int count = 0;
        System.out.println("Số lượng sinh viên thi đỗ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5 && array[i] <= 10)
                count++;
        }
        System.out.println(count);
    }
}
