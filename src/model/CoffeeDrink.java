package model;

import model.recipes.Recipe;

public class CoffeeDrink {
    private Recipe recipe;
    private SugarAndMilkValue sugarAndMilkValue;

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
}
