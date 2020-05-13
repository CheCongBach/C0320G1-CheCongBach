package Bai2.mangVaPhuongThucTrongJaVa.BaiTap;

import java.util.Scanner;

public class xoaPhanTuKhoiMangCach2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.print("Nhập số lượng các phần tử thêm vào mảng: ");
            size = Integer.parseInt(input.nextLine());
            if (size > 20)
                System.out.print("Số lượng thêm vào không được vượt quá 20");
        } while (size > 20);
        array = new int[size];
        System.out.println("Nhập các phần tử vào mảng");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("Hiển thị mảng số nguyên");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Nhập phần tử bạn muốn xóa khỏi mảng số nguyên");
        int number;
        int index = 0;
        boolean check = false;
        do {
            number = Integer.parseInt(input.nextLine());
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    index = i + 1;
                    System.out.println("Phần tử cần xóa có trong mảng số nguyên: " + number + " ở vị trí " + index);
                    check = true;
                    break;
                }
            }
            if (!check)
                System.out.println("Phần tử cần xóa không có trong mảng số nguyên");
        } while (!check);
        for (int i = index - 1; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }
        array[array.length - 1] = 0;
        System.out.println("Mảng sau khi xóa phần tử");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
