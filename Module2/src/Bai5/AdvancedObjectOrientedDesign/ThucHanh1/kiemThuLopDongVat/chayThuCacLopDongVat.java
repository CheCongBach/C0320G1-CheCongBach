package Bai5.AdvancedObjectOrientedDesign.ThucHanh1.kiemThuLopDongVat;

import Bai5.AdvancedObjectOrientedDesign.ThucHanh1.animal.lopAnimal;
import Bai5.AdvancedObjectOrientedDesign.ThucHanh1.animal.lopChicken;
import Bai5.AdvancedObjectOrientedDesign.ThucHanh1.animal.lopTiger;
import Bai5.AdvancedObjectOrientedDesign.ThucHanh1.edible.lopEdible;

public class chayThuCacLopDongVat {
    public static void main(String[] args) {
        lopAnimal[] animals1 = new lopAnimal[2];
        animals1[0] = new lopTiger();
        animals1[1] = new lopChicken();
        for (int i = 0; i < animals1.length; i++) {
            System.out.println(animals1[i].makeSound());
        }
        lopChicken chicken = new lopChicken();
        if (chicken instanceof lopChicken) {
            lopEdible chicken1 = (lopEdible) chicken;
            System.out.println(chicken1.howToEat());
        }
    }
}
