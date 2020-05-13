package Bai3.lopVaDoiTuong.BaiTap;

import java.util.Date;

public class lopStopWatch {
    private long startTime;
    private long endTime;

    public lopStopWatch() {
        this.startTime = new Date().getTime();
    }

    public long getStartTime() {
        return startTime;
    }

    public void start() {
        this.startTime = new Date().getTime();
        System.out.println("Reset start time theo phương thức start: " + this.startTime + " đơn vị milisecond giây");
    }

    public void stop() {
        this.endTime = new Date().getTime();
        System.out.println("Reset end time theo phương thức start: " + this.endTime + " đơn vị milisecond giây");
    }
}
