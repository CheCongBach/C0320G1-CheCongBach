package Bai4.keThua.ThucHanh;

public class lopCircle extends lopShape {
    private double radius = 1.0;

    public lopCircle() {
    }

    public lopCircle(double radius) {
        this.radius = radius;
    }

    public lopCircle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(double radius) {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter(double radius) {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + getRadius() + ", which is a subclass of " + super.toString();
    }
}
