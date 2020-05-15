package Bai4.keThua.BaiTap2;

public class lopPoint3D extends lopPoint2D {
    private float z = 10f;

    public lopPoint3D() {
    }

    public lopPoint3D(float x,float y,float z) {
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y,float z) {
        super.setXY(x,y);
        this.z = z;
    }

    public void getXYZ() {
        float[] array = new float[3];
        array[0] = super.getX();
        array[1] = super.getY();
        array[2] = this.z;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " và số z là" + " " + getZ();
    }
}
