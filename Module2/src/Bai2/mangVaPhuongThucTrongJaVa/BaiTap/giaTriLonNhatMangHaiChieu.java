package Bai2.mangVaPhuongThucTrongJaVa.BaiTap;

import java.util.Scanner;

public class giaTriLonNhatMangHaiChieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array;
        int size;
        do {
            System.out.print("Nhập giá trị muốn thêm vào mảng số nguyên hai chiều: ");
            size = Integer.parseInt(input.nextLine());
            if (size > 20)
                System.out.println("Gía trị thêm vào không được vượt quá 20");
        } while (size > 20);
        array = new int[size][size];
        System.out.println("Nhập các phần tử vào mảng số nguyên hai chiều");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Integer.parseInt(input.nextLine());
            }
        }
        System.out.println("Hiển thị các phần tử có trong mảng số nguyên hai chiều");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.print("Gía trị lớn nhất trong mảng số nguyên hai chiều là: " + max);
    }
}
