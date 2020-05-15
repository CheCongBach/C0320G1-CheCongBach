package Bai4.keThua.BaiTap3;

public class lopPoint {
    private float x = 1f;
    private float y = 2f;

    public lopPoint() {
    }

    public lopPoint(float x,float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
        System.out.print(this.x + " ");
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
        System.out.print(this.y + " ");
    }

    public void setXY(float x,float y) {
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
        return "gồm các số x và y là: " + getX() + " và " + getY();
    }


}
