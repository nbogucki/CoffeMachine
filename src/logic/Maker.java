package logic;

import logic.components.ChocolateComponent;
import logic.components.CoffeeComponent;
import logic.components.MilkComponent;
import logic.view.UserInterface;
import model.Storage;


    abstract class Maker implements CoffeeMachine{
        UserInterface userInterface;
        ChocolateComponent chocolateComponent;
        CoffeeComponent coffeeComponent;
        MilkComponent milkComponent;
        private boolean sugar;

        Maker(UserInterface userInterface){
            this.userInterface = userInterface;
        }
        @Override
        public void makeCoffee() {
            Storage storage = Storage.getInstance();
            coffeeComponent = new CoffeeComponent(storage, userInterface);
            milkComponent = new MilkComponent(storage, userInterface);
            chocolateComponent = new ChocolateComponent(storage, userInterface);
        }

        @Override
        public void addSugar() {
            sugar = true;
            userInterface.showStep("Dodano cukier");
        }

        @Override
        public void setUserInterface(UserInterface userInterface) {
            userInterface =userInterface;
        }
}
