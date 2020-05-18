package Bai5.AdvancedObjectOrientedDesign.BaiTap.suDung;

import Bai5.AdvancedObjectOrientedDesign.BaiTap.resizeable.lopResizeable;
import Bai4.keThua.ThucHanh.lopSquaRe;

public class lopSquareReasize extends lopSquaRe implements lopResizeable {
    public lopSquareReasize() {
    }

    public lopSquareReasize(double side) {
        super(side);
    }

    public lopSquareReasize(double side, String color, boolean filled) {
        super(side, color, filled);
    }

    @Override
    public void resize(double percent) {
        super.setSide((super.getSide() * (percent / 100)) + super.getSide());
    }
}
