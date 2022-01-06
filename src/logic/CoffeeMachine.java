package logic;

import logic.view.UserInterface;

public interface CoffeeMachine {
    void makeCoffee();

    void addSugar();

    void setUserInterface(UserInterface userInterface);
}
