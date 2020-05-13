package Bai2.mangVaPhuongThucTrongJaVa.BaiTap;

import java.util.Scanner;

public class soLanXuatHienKiTuTrongChuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String chuoiKiTu = "Tôi yêu java";
        int count = 0;
        char i = 'a';
        for (int j = 0; j < chuoiKiTu.length(); j++) {
            if (chuoiKiTu.charAt(j) == i) {
                count++;
            }
        }
        System.out.print("Kí tự a xuất hiên " + count + " lần");



    }
}
