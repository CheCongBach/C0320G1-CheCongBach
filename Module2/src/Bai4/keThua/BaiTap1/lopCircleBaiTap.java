package Bai4.keThua.BaiTap1;

public class lopCircleBaiTap {
    double radius = 1.0;
    String color = "red";
    boolean filled = false;

    public lopCircleBaiTap() {
    }

    public lopCircleBaiTap(double radius,String color,boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea(double radius) {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter(double radius) {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Bán kính là " + getRadius() + " màu là " + getColor()
                + " và " + (isFilled() ? " filled " : " not filled");
    }
}
