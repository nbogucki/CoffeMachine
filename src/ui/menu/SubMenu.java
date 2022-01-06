package ui.menu;

import ui.menu.options.OptionMoveToParentMenu;

public class SubMenu extends MenuNode {
    String name;
    MenuNode parent;

    public SubMenu(String name, MenuNode parent, MenuManager manager) {
        super(manager);

        this.name = name;
        this.parent = parent;

        AddDefaultOptions();
    }

    private void AddDefaultOptions() {
        this.add( new OptionMoveToParentMenu(manager) );
    }

    @Override
    public void execute() {
        manager.SwitchTo(this);
        System.out.println("Switched to menu: " + getName());
    }

    public MenuNode getParent() {
        return parent;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void trySwitchingToAnotherMenu() {
        MenuOption option = readElementByIndex();
        if (option instanceof SubMenu) {
            manager.SwitchTo((SubMenu) option);
        }
    }
}
