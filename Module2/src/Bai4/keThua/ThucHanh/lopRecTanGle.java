package Bai4.keThua.ThucHanh;

public class lopRecTanGle extends lopShape {
    private double width = 1.0;
    private double lenght = 1.0;

    public lopRecTanGle() {
    }

    public lopRecTanGle(double width,double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public lopRecTanGle(double width,double lenght,String color,boolean filled) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea() {
        return this.width * this.lenght;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.lenght);
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + getWidth() + " and lenght = " + getLenght()
                + ", which is a subclass of " + super.toString();
    }
}
