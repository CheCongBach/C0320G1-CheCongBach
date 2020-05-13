package Bai2.mangVaPhuongThucTrongJaVa.ThucHanh;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class lopArrayIndexOutOfBoundsException {
    public static int[] mangSoNguyenNgauNhien() {
        Random input = new Random();
        int[] array = new int[100];
        System.out.println("Danh sách các phần tử trong mảng");
        for (int i = 0 ; i < 100; i++) {
            array[i] = input.nextInt(100);
            System.out.println(array[i]);
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vị trí của một phần tử bất kì trong mảng: ");
        int index = Integer.parseInt(input.nextLine());
        int[] array = mangSoNguyenNgauNhien();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + index + " là " + array[index]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
