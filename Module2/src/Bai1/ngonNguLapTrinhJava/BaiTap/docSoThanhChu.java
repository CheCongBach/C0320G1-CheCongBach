package Bai1.ngonNguLapTrinhJava.BaiTap;

import java.util.Scanner;

public class docSoThanhChu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số cần đọc: ");
        int number = input.nextInt();
        if (number > 0 && number <= 10) {
            switch (number) {
                case 1: {
                    System.out.print(number + " đọc là một");
                    break;
                }
                case 2: {
                    System.out.print(number + " đọc là hai");
                    break;
                }
                case 3: {
                    System.out.print(number + " đọc là ba");
                    break;
                }
                case 4: {
                    System.out.print(number + " đọc là bốn");
                    break;
                }
                case 5: {
                    System.out.print(number + " đọc là năm");
                    break;
                }
                case 6: {
                    System.out.print(number + " đọc là sáu");
                    break;
                }
                case 7: {
                    System.out.print(number + " đọc là bảy");
                    break;
                }
                case 8: {
                    System.out.print(number + " đọc là tám");
                    break;
                }
                case 9: {
                    System.out.print(number + " đọc là chín");
                    break;
                }
                case 10: {
                    System.out.print(number + " đọc là mười");
                    break;
                }
            }
        } else {
            System.out.print("Nhiều quá nhát đọc");
        }
    }
}
