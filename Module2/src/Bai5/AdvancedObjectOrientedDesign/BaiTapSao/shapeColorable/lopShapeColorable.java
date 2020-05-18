package Bai5.AdvancedObjectOrientedDesign.BaiTapSao.shapeColorable;

import Bai5.AdvancedObjectOrientedDesign.BaiTapSao.colorable.lopColorable;

import Bai4.keThua.ThucHanh.lopSquaRe;

public class lopShapeColorable extends lopSquaRe implements lopColorable {
    public lopShapeColorable() {
    }

    public lopShapeColorable(double side) {
        super(side);
    }

    @Override
    public String toString() {
        return "A SquareColorable with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("All four side");
    }
}
