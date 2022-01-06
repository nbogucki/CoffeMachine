package ui.menu.options;

import ui.menu.MenuManager;
import ui.menu.MenuOption;

public class OptionExit implements MenuOption {
    MenuManager manager;
    public OptionExit(MenuManager manager) {
        this.manager = manager;
    }
    @Override
    public String getName() {
        return "Quits the app";
    }

    @Override
    public void display() {
        System.out.println(getName());
    }

    @Override
    public void execute() {
        System.out.println("Goodbye!");
        manager.Exit();
    }
}
