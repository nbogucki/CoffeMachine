package ui.menu.options.setMilkAndSugarMenu;

import model.CoffeeDrink;
import ui.menu.MenuOption;

public class OptionLowArrowSugar implements MenuOption {
    CoffeeDrink coffeeDrink;

    public OptionLowArrowSugar(CoffeeDrink coffeeDrink) {
        this.coffeeDrink = coffeeDrink;
    }

    @Override
    public String getName() {
        return "Set Less Sugar";
    }

    @Override
    public void display() {
        System.out.println(getName());
    }

    @Override
    public void execute() {
        int amountOfSugar = this.coffeeDrink.getSugarAndMilkValue().getSugar();
        if (amountOfSugar == 0) {
            System.out.println("You can't set less sugar");
        } else {
            this.coffeeDrink.getSugarAndMilkValue().setSugar(amountOfSugar-1);
        }
    }
}
