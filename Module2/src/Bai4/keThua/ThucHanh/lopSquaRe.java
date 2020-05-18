package Bai4.keThua.ThucHanh;

public class lopSquaRe extends lopRecTanGle {
    public  lopSquaRe() {
    }

    public lopSquaRe(double side) {
        super(side,side);
    }

    public lopSquaRe(double side,String color,boolean filled) {
        super(side,side,color,filled);
    }

    public double getSide() {
        return getLenght();
    }

    public void setSide(double side) {
        setLenght(side);
        setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLenght(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
