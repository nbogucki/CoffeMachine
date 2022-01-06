package ui.menu;

public class MenuManager {
    protected MenuNode currentMenu;
    protected boolean shouldQuit = false;

    public MenuManager() {
        currentMenu = new MenuNode(this);
    }

    public void display() {
        currentMenu.display();
    }
    public MenuNode getCurrentMenu() {
        return currentMenu;
    }
    public String getName() {
        return currentMenu.getName();
    }
    public void execute() {
        MenuOption option = currentMenu.readElementByIndex();
        option.execute();
    }

    public boolean needsToQuit() {
        return shouldQuit;
    }
    public void Exit() {
        this.shouldQuit = true;
    }

    public void SwitchTo(MenuNode menu) {
        this.currentMenu = menu;
    }
    public void BackToParentMenu() {
        if ((currentMenu instanceof SubMenu)) {
            SubMenu current = (SubMenu)currentMenu;
            this.SwitchTo(current.getParent());
        }
    }
}

