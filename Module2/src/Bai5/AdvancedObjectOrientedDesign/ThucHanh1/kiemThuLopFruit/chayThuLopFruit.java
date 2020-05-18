package Bai5.AdvancedObjectOrientedDesign.ThucHanh1.kiemThuLopFruit;

import Bai5.AdvancedObjectOrientedDesign.ThucHanh1.fruit.lopFruit;
import Bai5.AdvancedObjectOrientedDesign.ThucHanh1.fruit.lopApple;
import Bai5.AdvancedObjectOrientedDesign.ThucHanh1.fruit.lopOrange;

public class chayThuLopFruit {
    public static void main(String[] args) {
        lopFruit[] fruits = new lopFruit[2];
        fruits[0] = new lopApple();
        fruits[1] = new lopOrange();
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i].howToEat());
        }
    }
}
