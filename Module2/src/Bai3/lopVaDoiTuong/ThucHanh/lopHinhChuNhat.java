package Bai3.lopVaDoiTuong.ThucHanh;

import java.util.Scanner;

public class lopHinhChuNhat {
    double width,height;

    public lopHinhChuNhat(double width,double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height) / 2;
    }
    public String display() {
        return "Hình chữ nhât có chiều dài là: " + height + " chiều rộng là: " + width;
    }
}


