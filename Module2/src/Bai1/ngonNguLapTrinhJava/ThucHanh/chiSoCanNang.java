package Bai1.ngonNguLapTrinhJava.ThucHanh;

import java.util.Scanner;

public class chiSoCanNang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight,height,bmi;
        System.out.print("Nhập cân nặng cơ thể: ");
        weight = Double.parseDouble(input.nextLine());
        System.out.print("Nhập chiều cao cơ thể: ");
        height = Double.parseDouble(input.nextLine());
        bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("Thiếu cân nặng cần ăn thêm");
        } else if (18.5 < bmi && bmi < 25.0) {
            System.out.println("Cơ thể bình thường");
        } else if (25.0 < bmi && bmi < 30.0) {
            System.out.println("Thừa cân rồi cần ăn kiêng");
        } else if (30 < bmi) {
            System.out.println("Béo phì rồi");
        }
    }
}
