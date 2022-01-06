package model.recipes;

public class CappuccinoRecipe implements Recipe{

    @Override
    public String getName() {
        return "Cappuccino";
    }

    @Override
    public int getCoffeeBeansNumber() {
        return 3;
    }

    @Override
    public int getAmountOfWater() {
        return 100; //ml
    }

    @Override
    public int getWaterTemperature() {
        return 33; //Degrees Celsius
    }

    @Override
    public int getWaterPressure() {
        return 40; //kPa
    }

    public int getMilkTemperature() {
        return 20; //Degrees Celsius
    }
}
