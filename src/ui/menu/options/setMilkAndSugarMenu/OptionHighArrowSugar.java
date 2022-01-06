package ui.menu.options.setMilkAndSugarMenu;

import model.CoffeeDrink;
import ui.menu.MenuOption;

public class OptionHighArrowSugar implements MenuOption {
    CoffeeDrink coffeeDrink;

    public OptionHighArrowSugar(CoffeeDrink coffeeDrink) {
        this.coffeeDrink = coffeeDrink;
    }

    @Override
    public String getName() {
        return "Set More Sugar";
    }

    @Override
    public void display() {
        System.out.println(getName());
    }

    @Override
    public void execute() {
        int amountOfSugar = this.coffeeDrink.getSugarAndMilkValue().getSugar();
        if (amountOfSugar == 6) {
            System.out.println("You can't set more sugar");
        } else {
            this.coffeeDrink.getSugarAndMilkValue().setSugar(amountOfSugar+1);
        }
    }
}
