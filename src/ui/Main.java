package ui;

import logic.CoffeeMachine;
import logic.LatteMacchiatoMaker;
import logic.view.UserInterface;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witam wybierz kawe:\n [E] - espresso\n [L] - Latte");
        CoffeeMachine coffeeMachine;
        coffeeMachine = new LatteMacchiatoMaker(new AdvanceUi());
        coffeeMachine.makeCoffee();
    }

    private static class AdvanceUi implements UserInterface {

        @Override
        public void showStep(String msg) {
            System.out.println("-" + msg);
        }

        @Override
        public void showError(String msg) {
            System.out.println("##" + msg + "##");

        }

        @Override
        public void showCoffeeReady(String msg) {
            System.out.println("==" + msg + "==");
        }

        @Override
        public void playSound() {
            System.out.println("BIEP! BIEP!");

        }
    }
}
