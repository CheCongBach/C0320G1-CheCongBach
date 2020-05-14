package Bai4.keThua.BaiTap1;

public class chayLopCyLinDer {
    public static void main(String[] args) {
        lopCyLinDer hinhTru1 = new lopCyLinDer();
        System.out.println("Hình trụ 1: " + hinhTru1);
        System.out.println("Thể tích hình trụ 1: " + hinhTru1.getVolume(2));
        System.out.println("");
        hinhTru1 = new lopCyLinDer(8,2,"yellow",true);
        System.out.println("Hình trụ 2: " + hinhTru1);
        System.out.println("Thể tích hình trụ 2: " + hinhTru1.getVolume(8));
    }
}
