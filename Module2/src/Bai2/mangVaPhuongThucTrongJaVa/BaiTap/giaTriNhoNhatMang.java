package Bai2.mangVaPhuongThucTrongJaVa.BaiTap;

import java.util.Scanner;

public class giaTriNhoNhatMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.print("Nhập số lượng phần tử bạn muốn thêm vào mảng: ");
            size = Integer.parseInt(input.nextLine());
            if (size > 20) {
                System.out.println("Số lượng phần tử thêm vào mảng khoogn được vượt quá 20");
            }
        } while (size > 20);
        array = new int[size];
        System.out.println("Nhập các phần tử vào mảng: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("Hiển thị các phần tử trong mảng: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int min = array[0];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i + 1;
            }
        }
        System.out.print("Phần tử nhỏ nhất trong mảng số nguyên là: " + min + " ở vị trí " + index);
    }
}
