package Bai2.mangVaPhuongThucTrongJaVa.BaiTap;

import java.util.Scanner;

public class themPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số x cần chèn vào mảng: ");
        int x = Integer.parseInt(input.nextLine());
        System.out.print("Nhập vị trí cần chèn số x vào mảng: ");
        int index = Integer.parseInt(input.nextLine());
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        do {
            if (index <= 1 || index >= array.length -1) {
                System.out.println("Không chèn được số x vào mảng");
                break;
            }
        } while (index <= 1 || index >= array.length -1);
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        for (int i = newArray.length - 1; i > index; i--) {
            newArray[i] = newArray[i - 1];
        }
        newArray[index] = x;
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}
