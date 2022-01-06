package ui.menu.options.mainMenu;

import model.CoffeeDrink;
import model.recipes.CappuccinoRecipe;
import ui.menu.MenuManager;
import ui.menu.MenuOption;
import ui.menu.SubMenu;

public class OptionCappuccino implements MenuOption {

    MenuManager manager;
    CoffeeDrink coffeeDrink;
    SubMenu setMilkAndSugarMenu;

    public OptionCappuccino(CoffeeDrink coffeeDrink, MenuManager manager, SubMenu setMilkAndSugarMenu) {
        this.coffeeDrink = coffeeDrink;
        this.manager = manager;
        this.setMilkAndSugarMenu = setMilkAndSugarMenu;
    }

    @Override
    public String getName() {
        return "Make a Cappuccino";
    }

    @Override
    public void display() {
        System.out.println(getName());
    }

    @Override
    public void execute() {
        coffeeDrink.setRecipe(new CappuccinoRecipe());
        manager.SwitchTo(setMilkAndSugarMenu);
    }
}

