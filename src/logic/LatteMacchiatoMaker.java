package logic;

import logic.view.UserInterface;

public class LatteMacchiatoMaker extends Maker {
    public LatteMacchiatoMaker(UserInterface userInterface) {
        super(userInterface);
    }


    @Override
    public void makeCoffee() {
        super.makeCoffee();
        boolean status = coffeeComponent.addComponent() && milkComponent.addComponent() && chocolateComponent.addComponent();
        if(status) {
            userInterface.showCoffeeReady("Latte Macchiato gotowe");
        }
    }
}
