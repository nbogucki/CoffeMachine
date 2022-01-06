package ui;

import logic.CoffeeMachine;
import logic.LatteMacchiatoMaker;
import model.CoffeeDrink;
import model.SugarAndMilkValue;
import ui.menu.MenuManager;
import ui.menu.MenuNode;
import ui.menu.SubMenu;
import ui.menu.options.mainMenu.OptionCappuccino;
import ui.menu.options.OptionExit;
import ui.menu.options.setMilkAndSugarMenu.OptionHighArrowMilk;
import ui.menu.options.setMilkAndSugarMenu.OptionHighArrowSugar;
import ui.menu.options.setMilkAndSugarMenu.OptionLowArrowMilk;
import ui.menu.options.setMilkAndSugarMenu.OptionLowArrowSugar;
import ui.menu.options.setMilkAndSugarMenu.OptionMakeCoffee;

public class Main {
    public static void main(String[] args) {
        MenuManager menuManager = new MenuManager();
        CoffeeDrink coffeeDrink = new CoffeeDrink();
        coffeeDrink.setSugarAndMilkValue(new SugarAndMilkValue());

        createMenu(menuManager, coffeeDrink);

        System.out.println("Witam, wybierz rodzaj kawy:");
        while (! menuManager.needsToQuit()) {
            menuManager.display();
            if (menuManager.getCurrentMenu().getName().equals("*** Set Milk And Sugar Submenu ***")) {
                System.out.println("Milk: "+coffeeDrink.getSugarAndMilkValue().getMilk());
                System.out.println("Sugar: "+coffeeDrink.getSugarAndMilkValue().getSugar());
            }
            try {
                menuManager.execute();
            } catch (IndexOutOfBoundsException e) {
                System.err.println(e.getMessage());
            }
        }

        if (coffeeDrink.isMakeCoffee()) {
            CoffeeMachine coffeeMachine;
            coffeeMachine = new LatteMacchiatoMaker(new AdvanceUi());
            coffeeMachine.makeCoffee();
        }
    }

    private static void createMenu(MenuManager menuManager, CoffeeDrink coffeeDrink) {
        MenuNode mainMenu = menuManager.getCurrentMenu();
        SubMenu setMilkAndSugarMenu = new SubMenu(
                "*** Set Milk And Sugar Submenu ***",
                mainMenu,
                menuManager
        );

        //Submenu
        setMilkAndSugarMenu.add(new OptionHighArrowMilk(coffeeDrink));
        setMilkAndSugarMenu.add(new OptionLowArrowMilk(coffeeDrink));
        setMilkAndSugarMenu.add(new OptionHighArrowSugar(coffeeDrink));
        setMilkAndSugarMenu.add(new OptionLowArrowSugar(coffeeDrink));
        setMilkAndSugarMenu.add(new OptionMakeCoffee(menuManager, coffeeDrink));

        //Main Menu
        mainMenu.add(new OptionCappuccino(coffeeDrink, menuManager, setMilkAndSugarMenu));
        mainMenu.add(setMilkAndSugarMenu);
        mainMenu.add(new OptionExit(menuManager));
    }
}
