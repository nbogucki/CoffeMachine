package ui.menu;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuNode implements MenuOption {
    ArrayList<MenuOption> elements = new ArrayList<>();
    MenuManager manager;

    public MenuNode(MenuManager manager) {
        this.manager = manager;
    }

    public void add(MenuOption menu) {
        this.elements.add(menu);
    }

    public void display() {
        int x=0;
        System.out.println("--- " + getName() + " ---");
        for ( MenuOption element: elements ) {
            System.out.print(x+1);
            System.out.print(") - ");
            System.out.println(element.getName());
            x++;
        }
    }

    @Override
    public String getName() {
        return "Coffe Machine menu";
    }

    public MenuOption readElementByIndex() throws IndexOutOfBoundsException {
        Scanner in = new Scanner(System.in);
        int chosenOptionIdx = in.nextInt() - 1;
        if (chosenOptionIdx < 0) {
            throw new IndexOutOfBoundsException("Invalid menu option number. It must be greater than 0!");
        }
        if (chosenOptionIdx >= elements.size()) {
            throw new IndexOutOfBoundsException("Invalid menu option number. It must be less or equal to "+elements.size() +"!");
        }
        return this.elements.get(chosenOptionIdx);
    }

    public void execute() { /**/ }

    public void trySwitchingToAnotherMenu() {
        MenuOption option = readElementByIndex();
        if (option instanceof SubMenu) {
            manager.SwitchTo((MenuNode) option);
        }
    }
}
