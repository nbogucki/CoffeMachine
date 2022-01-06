package model;

public class ChocolateBox extends Box{
    private static final int MAX_CHOCOLATE = 10;

    @Override
    void fillIt() {
        numberOfProduct = MAX_CHOCOLATE;
    }
}
