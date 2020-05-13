package Bai3.lopVaDoiTuong.BaiTap;

public class chayLopFan {
    public static void main(String[] args) {
        xayDungLopFan fan1 = new xayDungLopFan();
        xayDungLopFan fan2 = new xayDungLopFan();
        System.out.println("Trạng thái của fan1 là: ");
        System.out.println(fan1.trangThai1());
        fan1.setSpeed(10);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        System.out.println("");
        System.out.println("Trạng thái của fan2 là: ");
        System.out.println(fan2.trangThai2());
        fan2.setSpeed(5);
        fan2.setRadius(5);
        fan2.setColor("Blue");
    }
}
