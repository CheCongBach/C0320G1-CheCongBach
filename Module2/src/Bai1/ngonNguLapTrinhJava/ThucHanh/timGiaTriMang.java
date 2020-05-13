package Bai1.ngonNguLapTrinhJava.ThucHanh;

import java.util.Scanner;

public class timGiaTriMang {
    public static void main(String[] args) {
        String[] students = {"Bách", "Hải", "Vũ", "Danh", "Công", "Quốc", "Huy"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên học sinh cần tìm: ");
        String nhapTen = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(nhapTen)) {
                System.out.println("Học sinh cần tìm trong danh sách: " + nhapTen + " ở vị trí " + (i+1));
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Tên học sinh cần tìm không có trong danh sách");
        }
    }
}

