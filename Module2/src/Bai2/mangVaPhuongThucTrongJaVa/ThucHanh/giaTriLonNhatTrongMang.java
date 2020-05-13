package Bai2.mangVaPhuongThucTrongJaVa.ThucHanh;

import java.util.Scanner;

public class giaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng giá trị bạn muốn thêm vào danh sách: ");
            size = Integer.parseInt(input.nextLine());
            if (size > 20)
                System.out.println("Gía trị thêm vào không được vượt quá 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập các giá trị vào trong danh sách: ");
            array[i] = Integer.parseInt(input.nextLine());
            i++;
        }
        System.out.println("Hiển thị các phần tử trong danh sách: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = 1 + j;
            }
        }
        System.out.println("Gía trị lớn nhất trong danh sách là: " + max + " ở vị trí " + index);
    }
}
