package Bai2.mangVaPhuongThucTrongJaVa.ThucHanh;

import java.util.Scanner;

public class daoNguocCacPhanTuTrongMang {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng phần tử bạn muốn thêm vào mảng: ");
            size = Integer.parseInt(input.nextLine());
            if (size > 20) {
                System.out.println("Gía trị thêm vào không được vượt quá 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập các phần tử vào mảng: ");
            array[i] = Integer.parseInt(input.nextLine());
            i++;
        }
        System.out.println("Hiển thị các phần tử có trong mảng");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        for (int j = 0; j < array.length/2; j++) {
            int temp;
            temp = array[j];
            array[j] = array[array.length - 1 - j];
            array[array.length -1 -j] = temp;
        }
        System.out.println("Mảng sau khi đã đảo ngược các phần tử là: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
        }
    }
}
