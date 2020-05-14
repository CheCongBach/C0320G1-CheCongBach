package Bai4.keThua.BaiTap2;

public class lopPoint2D {
    private float x = 8.0f;
    private float y = 9.0f;

    public lopPoint2D() {
    }

    public lopPoint2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void getXY() {
       float[] array = new float[2];
       array[0] = this.x;
       array[1] = this.y;
       for (int i = 0; i < array.length; i++) {
           System.out.print(array[i] + " ");
       }
    }

    @Override
    public String toString() {
        return  "gồm có các số x và y là " + getX() + " và " + getY();
    }
}
