package Bai5.AdvancedObjectOrientedDesign.BaiTap.suDung;

import Bai5.AdvancedObjectOrientedDesign.BaiTap.resizeable.lopResizeable;
import Bai4.keThua.ThucHanh.lopRecTanGle;

public class lopRectangleReasize extends lopRecTanGle implements lopResizeable {
    public lopRectangleReasize() {
    }

    public lopRectangleReasize(double width,double lenght) {
        super(width, lenght);
    }

    public lopRectangleReasize(double width,double lenght,String color,boolean filled) {
        super(width, lenght, color, filled);
    }

    @Override
    public void resize(double percent) {
        super.setLenght((super.getLenght() * (percent / 100)) + super.getLenght());
        super.setWidth((super.getWidth() * (percent / 100)) + super.getLenght());
    }
}
