package WildFarm.Animal;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    private String getBreed() {
        return this.breed;
    }

    @Override
    public String toString() {
        DecimalFormat formater = new DecimalFormat("#.##");
        return this.getAnimalType() + "[" + this.getAnimalName() + ", " + this.getBreed() + ", " + formater.format(this.getAnimalWeight()) +
                ", " + this.getLivingRegion() + ", " + this.getFoodEaten() + "]";
    }

}
