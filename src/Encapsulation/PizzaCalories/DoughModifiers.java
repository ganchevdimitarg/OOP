package Encapsulation.PizzaCalories;

public enum DoughModifiers {
    White(1.5),
    Wholegrain(1.0),
    Crispy(0.9),
    Chewy(1.1),
    Homemade(1.0);

    double weight;

    DoughModifiers(double weight) {
        this.weight = weight;
    }

    public double getWeightDough() {
        return weight;
    }
}
