package model;

public class CoffeeBox extends Box{
    private static final int MAX_COFFEE = 30;

    @Override
    void fillIt() {
        numberOfProduct = MAX_COFFEE;
    }
}
