package logic;

import logic.view.UserInterface;

public class EspressoMaker extends Maker {
    public EspressoMaker(UserInterface userInterface) {
        super(userInterface);
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
        boolean status = coffeeComponent.addComponent();
        if(status) {
            userInterface.showCoffeeReady("Espresso gotowe");
        }
    }
}
