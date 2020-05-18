package Bai5.AdvancedObjectOrientedDesign.BaiTapSao.ThucThi;

import Bai4.keThua.ThucHanh.lopCircle;
import Bai4.keThua.ThucHanh.lopRecTanGle;
import Bai4.keThua.ThucHanh.lopSquaRe;
import Bai4.keThua.ThucHanh.lopShape;
import Bai5.AdvancedObjectOrientedDesign.BaiTapSao.shapeColorable.lopShapeColorable;

public class lopThucThi {
    public static lopShape[] shapesArray() {
        lopShape[] shapes = new lopShape[4];
        shapes[0] = new lopCircle(8.0);
        shapes[1] = new lopRecTanGle(7.0,8.0);
        shapes[2] = new lopSquaRe(8.0);
        shapes[3] = new lopShapeColorable(8.0);
        return shapes;
    }

    public static void printShapesArray(lopShape[] shapes) {
        for (lopShape shape : shapes) {
            if (shape instanceof lopCircle) {
                lopCircle circle = (lopCircle) shape;
                System.out.println("Circle area: " + circle.getArea());
                System.out.println("Circle perimeter: " + circle.getPerimeter());
                System.out.println("Circle information: " + circle.toString());
            } else if (shape instanceof lopShapeColorable) {
                lopShapeColorable shapeColorable = (lopShapeColorable) shape;
                System.out.println("shapeColorable area: " + shapeColorable.getArea());
                System.out.println("shapeColorable perimeter: " + shapeColorable.getPerimeter());
                System.out.println("shapeColorable information: " + shapeColorable.toString());
                shapeColorable.howToColor();
            } else if (shape instanceof lopSquaRe) {
                lopSquaRe squaRe = (lopSquaRe) shape;
                System.out.println("Square area: " + squaRe.getArea());
                System.out.println("Square perimeter: " + squaRe.getPerimeter());
                System.out.println("Square information" + squaRe.toString());
                System.out.println();
            } else if (shape instanceof lopRecTanGle) {
                lopRecTanGle recTanGle = (lopRecTanGle) shape;
                System.out.println("Rectangle area: " + recTanGle.getArea());
                System.out.println("Rectangle perimeter: " + recTanGle.getPerimeter());
                System.out.println("Rectangle information: " + recTanGle.toString());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        lopShape[] shapes = shapesArray();
        printShapesArray(shapes);
    }
}
