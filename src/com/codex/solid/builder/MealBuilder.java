package com.codex.solid.builder;

public class MealBuilder {
	public Meal buildMeal(MealCategory category) {
		Meal meal = null;
		if (category.equals(MealCategory.KIDS)) {
			meal = new KidsMeal();
		} else if (category.equals(MealCategory.VEG)) {
			meal = new VegMeal();
		} else if (category.equals(MealCategory.NONVEG)) {
			meal = new NonVegMeal();
		} else if (category.equals(MealCategory.MIXED)) {
			meal = new MixedMeal();
		}
		return meal;
	}

	public static void main(String[] args) {
		MealBuilder builder = new MealBuilder();
		Meal meal = builder.buildMeal(MealCategory.KIDS);
		if (meal instanceof KidsMeal)
			System.out.println("Kids meal");
		if (meal instanceof VegMeal)
			System.out.println("Veg meal");
		if (meal instanceof NonVegMeal)
			System.out.println("Non veg meal");
		if (meal instanceof MixedMeal)
			System.out.println("Mixed meal");

	}
}
