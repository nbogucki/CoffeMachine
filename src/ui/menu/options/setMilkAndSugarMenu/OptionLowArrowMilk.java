package ui.menu.options.setMilkAndSugarMenu;

import model.CoffeeDrink;
import ui.menu.MenuOption;

public class OptionLowArrowMilk implements MenuOption {
    CoffeeDrink coffeeDrink;

    public OptionLowArrowMilk(CoffeeDrink coffeeDrink) {
        this.coffeeDrink = coffeeDrink;
    }

    @Override
    public String getName() {
        return "Set Less Milk";
    }

    @Override
    public void display() {
        System.out.println(getName());
    }

    @Override
    public void execute() {
        int amountOfMilk = this.coffeeDrink.getSugarAndMilkValue().getMilk();
        if (amountOfMilk == 0) {
            System.out.println("You can't set less milk");
        } else {
            this.coffeeDrink.getSugarAndMilkValue().setMilk(amountOfMilk-1);
        }
    }
}
