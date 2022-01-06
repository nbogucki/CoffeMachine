package ui.menu.options.setMilkAndSugarMenu;

import ui.menu.MenuManager;
import ui.menu.MenuOption;

public class OptionMakeCoffee implements MenuOption {

    MenuManager manager;
    public OptionMakeCoffee(MenuManager manager) {
        this.manager = manager;
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
        manager.Exit();
    }
}
