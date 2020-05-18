package Bai5.AdvancedObjectOrientedDesign.ThucHanh1.animal;

import Bai5.AdvancedObjectOrientedDesign.ThucHanh1.edible.lopEdible;

public class lopChicken extends lopAnimal implements lopEdible {
    @Override
    public String makeSound() {
        return "Gà kêu ò ó ooo!!!";
    }

    @Override
    public String howToEat() {
        return "Gà đi đào đất ăn giun hoặc được cho ăn thóc";
    }
}
