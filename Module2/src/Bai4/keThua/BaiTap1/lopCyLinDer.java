package Bai4.keThua.BaiTap1;

public class lopCyLinDer extends lopCircleBaiTap {
    double height = 2.0;

    public lopCyLinDer() {
    }

    public lopCyLinDer(double height,double radius,String color,boolean filled) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(double height) {
        return super.getArea(this.radius) * this.height;
    }

    @Override
    public String toString() {
        return "Chiều cao là " + getHeight() + " " + super.toString();
    }
}
