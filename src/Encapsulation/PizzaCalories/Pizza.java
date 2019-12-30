package Encapsulation.PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private int numberOfToppings;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.setToppings(numberOfToppings);
    }

    public Pizza(String name, Dough dough, int numberOfToppings) {
        this(name, numberOfToppings);
        this.setDough(dough);
        this.toppings = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.length() > 15 || name.isEmpty() || name.contains(" ")) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setToppings(int toppings) {
        if (toppings < 0 || toppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.numberOfToppings = toppings;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories() {
        double calories = 0.0;
        calories += this.dough.calculateCalories();
        for (Topping topping : toppings) {
            calories += topping.calculateCalories();
        }
        return calories;
    }
}
