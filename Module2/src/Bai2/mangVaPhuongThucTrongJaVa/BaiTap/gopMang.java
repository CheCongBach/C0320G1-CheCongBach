package Bai2.mangVaPhuongThucTrongJaVa.BaiTap;

import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        int[] array1;
        int[] array2;
        int[] array3;
        int size;
        Scanner input = new Scanner(System.in);
       do {
           System.out.print("Nhập số lượng số nguyên cần thêm: ");
           size = Integer.parseInt(input.nextLine());
           if (size > 20)
               System.out.print("Số lượng mảng số nguyên không vượt quá 20");
       } while (size > 20);
       array1 = new int[size];
       array2 = new int[size];
       array3 = new int[array1.length + array2.length];
       System.out.println("Nhập giá trị cho mảng số nguyên thứ nhất");
       for (int i = 0; i < array1.length; i++) {
           array1[i] = Integer.parseInt(input.nextLine());
       }
       System.out.println("Nhập giá trị cho mảng số nguyên thứ hai");
       for (int i = 0; i < array2.length; i++) {
           array2[i] = Integer.parseInt(input.nextLine());
       }
       System.out.println("Hiển thị giá trị các số trong mảng số nguyên thứ nhất");
       for (int i = 0; i < array1.length; i++) {
           System.out.println(array1[i]);
       }
       System.out.println("Hiển thị giá trị các số trong mảng số nguyên thứ hai");
       for (int i = 0; i < array2.length; i++) {
           System.out.println(array2[i]);
       }
       for (int i = 0; i < array1.length; i++) {
           array3[i] = array1[i];
       }
       for (int i = 0; i < array2.length; i++) {
           array3[i + array1.length] = array2[i];
       }
       System.out.println("Hiển thị mảng mới chứa giá trị của cả hai mảng trên");
       for (int i = 0; i < array3.length; i++) {
           System.out.print(array3[i] + "\t");
       }
    }
}
