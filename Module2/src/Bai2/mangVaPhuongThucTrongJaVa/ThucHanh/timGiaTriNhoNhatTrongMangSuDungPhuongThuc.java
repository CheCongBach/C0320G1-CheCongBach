package Bai2.mangVaPhuongThucTrongJaVa.ThucHanh;

import java.util.Scanner;

public class timGiaTriNhoNhatTrongMangSuDungPhuongThuc {
    public static int giaTriNhoNhatTrongMang (int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        int size = 0;
        do {
            System.out.print("Nhập số lượng phần tử bạn muốn thêm vào mảng: ");
            size = Integer.parseInt(input.nextLine());
            if (size > 20)
                System.out.print("Số lượng phần tử nhập vào không quá 20");
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập các giá trị vào trong danh sách: ");
            array[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("Hiển thị các phần tử trong danh sách: ");
        for (int j = 0; j < array.length; j++) {
           System.out.println(array[j]);
        }
        int index = giaTriNhoNhatTrongMang(array);
        System.out.print("Gía trị nhỏ nhất trong mảng là: " + index);
    }
}
