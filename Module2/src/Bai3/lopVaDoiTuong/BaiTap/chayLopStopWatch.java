package Bai3.lopVaDoiTuong.BaiTap;

public class chayLopStopWatch {
    public static void main(String[] args) {
        lopStopWatch thoiGian = new lopStopWatch();
        System.out.println("Tham số khởi tạo start time với thời gian hiện tại của hệ thống: " +
                thoiGian.getStartTime() + " đơn vị milisecond giây");
        thoiGian.start();
        thoiGian.stop();
    }
}
