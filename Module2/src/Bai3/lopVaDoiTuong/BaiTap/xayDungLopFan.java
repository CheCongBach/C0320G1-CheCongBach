package Bai3.lopVaDoiTuong.BaiTap;

public class xayDungLopFan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public xayDungLopFan() {
        this.speed = slow;
        this.on = false;
        this.radius = 5.0;
        this.color = "Blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Tốc độ của quạt là: " + this.speed);
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
        System.out.println("Trạng thái của quạt là: " + this.on);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        System.out.println("Bán kính của quạt là: " + this.radius);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Màu sắc của quạt là: " + this.color);
    }

    public String trangThai1() {
        return "Quạt đang bật";
    }

    public String trangThai2() {
        return "Quạt đang tắt";
    }
}
