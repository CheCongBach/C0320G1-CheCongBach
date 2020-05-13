package Bai2.mangVaPhuongThucTrongJaVa.BaiTap;

import java.util.Scanner;

public class tinhTongMotCotXacDinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] array;
        int size;
        do {
            System.out.print("Nhập số lượng các phần tử muốn thêm vào mảng số nguyên hai chiều: ");
            size = Integer.parseInt(input.nextLine());
            if (size > 20) {
                System.out.println("Số lượng các phần tử không được vượt quá 20");
            }
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
        System.out.print("Nhập vị trí cột muốn tính tổng trong mảng: ");
        int index = Integer.parseInt(input.nextLine());
        for (int j = index; j < array[index].length; j++) {
            int sum = 0;
            for (int i = 0; i < array.length; i++)
                sum += array[i][j];
            System.out.println("Tổng của cột " + (j + 1) + " là " + sum);
            break;
        }
    }
}
