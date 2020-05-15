package Bai4.keThua.BaiTap3;

public class lopMovablePoint extends lopPoint {
    float SpeedX = 3f;
    float SpeedY = 4f;

    public lopMovablePoint() {
    }

    public lopMovablePoint(float x,float y,float SpeedX,float SpeedY) {
        super(x, y);
        this.SpeedX = SpeedX;
        this.SpeedY = SpeedY;
    }

    public float getSpeedX() {
        return SpeedX;
    }

    public void setSpeedX(float speedX) {
        this.SpeedX = speedX;
    }

    public float getSpeedY() {
        return SpeedY;
    }

    public void setSpeedY(float speedY) {
        this.SpeedY = speedY;
    }

    public void setSpeedXY(float speedX,float speedY) {
        this.SpeedX = speedX;
        this.SpeedY = speedY;
    }

    public void getSpeed() {
        float[] array = new float[4];
        array[0] = super.getX();
        array[1] = super.getY();
        array[2] = this.SpeedX;
        array[3] = this.SpeedY;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void move() {
        super.setX(super.getX() + this.SpeedX);
        super.setY(super.getY() + this.SpeedY);
    }

    @Override
    public String toString() {
        return super.toString() + " và các khoảng tăng giá trị SpeedX và SpeedY là "
                + getSpeedX() + " " + getSpeedY();
    }
}
