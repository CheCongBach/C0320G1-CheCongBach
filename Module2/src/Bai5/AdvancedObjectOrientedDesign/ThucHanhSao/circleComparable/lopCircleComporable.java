package Bai5.AdvancedObjectOrientedDesign.ThucHanhSao.circleComparable;

import Bai4.keThua.ThucHanh.lopCircle;

public class lopCircleComporable extends lopCircle implements Comparable<lopCircleComporable> {
    public lopCircleComporable() {
    }

    public lopCircleComporable(double radius) {
        super(radius);
    }

    public lopCircleComporable(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(lopCircleComporable o) {
        if (getRadius() > o.getRadius()) return 1;
        if (getRadius() < o.getRadius()) return -1;
        else return 0;
    }
}
