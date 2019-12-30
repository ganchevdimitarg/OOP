package WildFarm.Animal;

import WildFarm.Animal.Interfaces.Animal;
import WildFarm.Animal.Interfaces.Feedable;
import WildFarm.Animal.Interfaces.Soundable;

public abstract class AnimalImpl implements Animal, Feedable, Soundable {
    private String animalName;
    private String animalType;
    private double animalWeight;
    private int foodEaten;

    public AnimalImpl(String animalName, String animalType, double animalWeight) {
        this.setAnimalName(animalName);
        this.setAnimalType(animalType);
        this.setAnimalWeight(animalWeight);
        this.foodEaten = 0;
    }

    @Override
    public String getAnimalName() {
        return animalName;
    }

    private void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public String getAnimalType() {
        return animalType;
    }

    private void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    @Override
    public Double getAnimalWeight() {
        return animalWeight;
    }

    private void setAnimalWeight(double animalWeight) {
        this.animalWeight = animalWeight;
    }

    @Override
    public Integer getFoodEaten() {
        return this.foodEaten;
    }

    protected void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }
}
