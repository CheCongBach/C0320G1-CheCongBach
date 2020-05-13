package Bai1.ngonNguLapTrinhJava.ThucHanh;

import java.util.Scanner;

public class tinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tháng mà bạn cần biết số ngày: ");
        int month = input.nextInt();
        String daysInMonth;
        switch (month) {
            case 2: {
                daysInMonth = "28 hoặc 29 ngày";
                break;
            }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                daysInMonth = "31 ngày";
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                daysInMonth = "30 ngày";
                break;
            }
            default: {
                daysInMonth = "invalid";
            }
        }
        if (daysInMonth.equals("invalid")) {
            System.out.print("Bạn nhập tháng cần kiểm tra không phù hợp");
        } else {
            System.out.print("Số ngày có trong tháng: " + month + " là " + daysInMonth);
        }
    }
}
