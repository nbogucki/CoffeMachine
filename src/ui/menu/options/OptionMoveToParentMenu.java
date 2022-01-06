package ui.menu.options;

import ui.menu.MenuManager;
import ui.menu.MenuNode;
import ui.menu.MenuOption;
import ui.menu.SubMenu;

public class OptionMoveToParentMenu  implements MenuOption {
    MenuManager manager;
    public OptionMoveToParentMenu(MenuManager manager) {
        this.manager = manager;
    }
    @Override
    public String getName() throws UnsupportedOperationException {
        MenuNode currentMenu = this.manager.getCurrentMenu();

        if (currentMenu instanceof SubMenu) {
            return "Move to " + ((SubMenu) currentMenu).getParent().getName();
        } else {
            throw new UnsupportedOperationException("IMPLEMENTATION PROBLEM: A SubMenu is needed for the parent to exist! Normally this should not have happened...");
        }
    }

    @Override
    public void display() {
        System.out.println(getName());
    }

    @Override
    public void execute() {
        manager.BackToParentMenu();
    }
}
