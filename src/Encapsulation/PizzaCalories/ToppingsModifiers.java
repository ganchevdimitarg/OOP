package Encapsulation.PizzaCalories;

public enum ToppingsModifiers {
    Meat(1.2),
    Veggies(0.8),
    Cheese(1.1),
    Sauce(0.9);

    double weight;

    ToppingsModifiers(double weight) {
        this.weight = weight;
    }

    public double getWeightTopping() {
        return weight;
    }
}
