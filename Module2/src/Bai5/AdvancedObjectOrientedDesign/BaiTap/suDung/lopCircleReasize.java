package Bai5.AdvancedObjectOrientedDesign.BaiTap.suDung;

import Bai4.keThua.ThucHanh.lopCircle;
import Bai5.AdvancedObjectOrientedDesign.BaiTap.resizeable.lopResizeable;

public class lopCircleReasize extends lopCircle implements lopResizeable {
    public lopCircleReasize() {
    }

    public lopCircleReasize(double radius) {
        super(radius);
    }

    public lopCircleReasize(double radius,String color,boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public void resize(double percent) {
        super.setRadius((super.getRadius() * (percent / 100))+ super.getRadius());
    }
}
