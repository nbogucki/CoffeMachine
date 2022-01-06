package model;

import model.recipes.Recipe;

public class CoffeeDrink {
    private Recipe recipe;
    private SugarAndMilkValue sugarAndMilkValue;
    private boolean makeCoffee = false;

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public SugarAndMilkValue getSugarAndMilkValue() {
        return sugarAndMilkValue;
    }

    public void setSugarAndMilkValue(SugarAndMilkValue sugarAndMilkValue) {
        this.sugarAndMilkValue = sugarAndMilkValue;
    }

    public boolean isMakeCoffee() {
        return makeCoffee;
    }

    public void setMakeCoffee(boolean makeCoffee) {
        this.makeCoffee = makeCoffee;
    }
}
