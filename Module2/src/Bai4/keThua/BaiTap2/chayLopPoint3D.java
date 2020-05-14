package Bai4.keThua.BaiTap2;

public class chayLopPoint3D {
    public static void main(String[] args) {
        lopPoint3D point3d = new lopPoint3D();
        System.out.println("Lớp point3d " + point3d);
        System.out.println("Và mảng gồm 3 số là: ");
        point3d.getXYZ();
        System.out.println("");
        point3d = new lopPoint3D(70,80,90);
        System.out.println("Lớp point3d khi thay đổi giá trị " + point3d);
        System.out.println("Và mảng mới gồm 3 số là: ");
        point3d.getXYZ();
    }
}
