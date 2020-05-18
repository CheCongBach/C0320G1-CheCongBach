package Bai5.AdvancedObjectOrientedDesign.BaiTap.ThucThi;

import Bai4.keThua.ThucHanh.lopShape;
import Bai5.AdvancedObjectOrientedDesign.BaiTap.suDung.lopCircleReasize;
import Bai5.AdvancedObjectOrientedDesign.BaiTap.suDung.lopRectangleReasize;
import Bai5.AdvancedObjectOrientedDesign.BaiTap.suDung.lopSquareReasize;

public class lopThucThiResize {
    public static lopShape[] shapesArray() {
        lopShape[] shapes = new lopShape[3];
        shapes[0] = new lopCircleReasize(9.0);
        shapes[1] = new lopRectangleReasize(8.0,9.0);
        shapes[2] = new lopSquareReasize(10.0);
        return shapes;
    }

    public static void printShapesArray(lopShape[] shapes) {
        for (lopShape shape : shapes) {
            if (shape instanceof lopCircleReasize) {
                lopCircleReasize circleReasize = (lopCircleReasize) shape;
                circleReasize.resize(50);
                System.out.println("Circle Reasize Area: " + circleReasize.getArea());
                System.out.println("Circle Reasize Perimeter: " + circleReasize.getPerimeter());
            } else if (shape instanceof lopSquareReasize) {
                lopSquareReasize squareReasize = (lopSquareReasize) shape;
                squareReasize.resize(50);
                System.out.println("Square Reasize Area: " + squareReasize.getArea());
                System.out.println("Square Reasize Perimeter: " + squareReasize.getPerimeter());
            } else if (shape instanceof lopRectangleReasize) {
                lopRectangleReasize rectangleReasize = (lopRectangleReasize) shape;
                rectangleReasize.resize(50);
                System.out.println("Rectangle Reasize Area: " + rectangleReasize.getArea());
                System.out.println("Rectangle Reasize Perimeter: " + rectangleReasize.getPerimeter());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        lopShape[] shapes = shapesArray();
        printShapesArray(shapes);
        //lopCircleReasize circleReasize = new lopCircleReasize(10.0);
        //circleReasize.resize(50);
        //System.out.println(circleReasize.getRadius());
    }
}
