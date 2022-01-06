package ui.menu.options.setMilkAndSugarMenu;

import model.CoffeeDrink;
import ui.menu.MenuOption;

public class OptionHighArrowMilk implements MenuOption {
    CoffeeDrink coffeeDrink;

    public OptionHighArrowMilk(CoffeeDrink coffeeDrink) {
        this.coffeeDrink = coffeeDrink;
    }

    @Override
    public String getName() {
        return "Set More Milk";
    }

    @Override
    public void display() {
        System.out.println(getName());
    }

    @Override
    public void execute() {
        int amountOfMilk = this.coffeeDrink.getSugarAndMilkValue().getMilk();
        if (amountOfMilk == 6) {
            System.out.println("You can't set more milk");
        } else {
            this.coffeeDrink.getSugarAndMilkValue().setMilk(amountOfMilk+1);
        }
    }
}
