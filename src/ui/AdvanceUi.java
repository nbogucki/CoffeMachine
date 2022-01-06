package ui;

import logic.view.UserInterface;

public class AdvanceUi implements UserInterface {

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
