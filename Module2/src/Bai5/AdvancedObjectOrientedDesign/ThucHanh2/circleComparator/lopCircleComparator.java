package Bai5.AdvancedObjectOrientedDesign.ThucHanh2.circleComparator;

import Bai4.keThua.ThucHanh.lopCircle;
import java.util.Comparator;

public class lopCircleComparator extends lopCircle implements Comparator<lopCircleComparator> {
    public lopCircleComparator() {
    }

    public lopCircleComparator(double radius) {
        super(radius);
    }

    public lopCircleComparator(double radius,String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compare(lopCircleComparator c1,lopCircleComparator c2) {
        if (c1.getRadius() > c2.getRadius()) {
            return 1;
        } else if (c1.getRadius() < c2.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }
}
