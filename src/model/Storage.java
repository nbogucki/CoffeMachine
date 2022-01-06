package model;

import model.exceptions.EmptyBoxException;

public class Storage {
    private static Storage storage;
    CoffeeBox coffeeBox;
    MilkBox milkBox;
    ChocolateBox chocolateBox;

    private Storage() {
        milkBox = new MilkBox();
        coffeeBox = new CoffeeBox();
        chocolateBox = new ChocolateBox();
        fillAll();
    }

    public static Storage getInstance() {
        if(storage == null){
            storage = new Storage();
        }
        return storage;
    }

    public void fillAll() {
        milkBox.fillIt();
        coffeeBox.fillIt();
        chocolateBox.fillIt();
    }

    public void getCoffee() throws EmptyBoxException {
        if (!coffeeBox.takeProduct()) {
            throw new EmptyBoxException("kawa");
        }
    }

    public void getMilk() throws EmptyBoxException {
        if (!milkBox.takeProduct()) {
            throw new EmptyBoxException("mleko");
        }
    }

    public void getChocolate() throws EmptyBoxException {
        if (!chocolateBox.takeProduct()) {
            throw new EmptyBoxException("czekolada");
        }
    }
}
