package Bai3.lopVaDoiTuong.BaiTap;

public class phuongTrinhBacHai {
    double number1,number2,number3,delta,result,result1,result2;

    public phuongTrinhBacHai(double number1,double number2, double number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }
    public double getDenlta() {
        return delta = this.number2 * this.number2 - 4 * this.number1 * this.number3;
    }
    public void getResult() {
        if (delta < 0) {
            System.out.print("Phương trình vô nghiệm");
        } else if (delta == 0) {
            result = -this.number2 / (2 * this.number1);
            System.out.print(result);
        } else if (delta > 0) {
            result1 = (-this.number2 + Math.sqrt((this.number2 * this.number2 - 4 * this.number1 * this.number3))) / (2 * this.number1);
            result2 = (-this.number2 - Math.sqrt((this.number2 * this.number2 - 4 * this.number1 * this.number3))) / (2 * this.number1);
            System.out.println("X1 = " + result1 + "\t" + " X2 = " + result2);
        }
    }
    public String display() {
        return "Phương trình có các số a,b,c là: " + "\t" + this.number1 + "\t" + this.number2 + "\t" + this.number3;
    }
}
