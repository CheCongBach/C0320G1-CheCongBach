package Bai4.keThua.BaiTapSao;


import Bai4.keThua.ThucHanh.lopShape;

public class lopTriangle extends lopShape {
    private float side1 = 6f;
    private float side2 = 7f;
    private float side3 = 8f;
    private float height = 9f;

    public lopTriangle() {
    }

    public lopTriangle(float side1,float side2,float side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public lopTriangle(float side1,float side2,float side3,float height) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }

    public lopTriangle(float side1,float side2,float side3,float height,String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }

    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    public float getSide3() {
        return side3;
    }

    public void setSide3(float side3) {
        this.side3 = side3;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public float getArea() {
        return (this.side3 + this.height) / 2;
    }

    @Override
    public String toString() {
        return "độ dài ba cạnh x,y,z lần lượt là " + getSide1() + " " + getSide2() + " " + getSide3() +
                 " và chiều cao là " + getHeight() + " và " + super.toString();
    }
}
