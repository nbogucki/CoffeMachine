package ui.menu.options.setMilkAndSugarMenu;

import model.CoffeeDrink;
import model.recipes.Recipe;
import ui.menu.MenuManager;
import ui.menu.MenuOption;

public class OptionMakeCoffee implements MenuOption {

    MenuManager manager;
    CoffeeDrink coffeeDrink;
    public OptionMakeCoffee(MenuManager manager, CoffeeDrink coffeeDrink) {
        this.manager = manager;
        this.coffeeDrink = coffeeDrink;
    }

    @Override
    public String getName() {
        return "Make Coffee";
    }

    @Override
    public void display() {
        System.out.println(getName());
    }

    @Override
    public void execute() {
        if (coffeeDrink.getRecipe() != null) {
            this.coffeeDrink.setMakeCoffee(true);
        }

        manager.Exit();
    }
}
