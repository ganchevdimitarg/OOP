package WildFarm.Animal;

import WildFarm.Animal.Interfaces.Mammal;
import WildFarm.Food.Food;

import java.text.DecimalFormat;

public abstract class MammalImpl extends AnimalImpl implements Mammal {
    private String livingRegion;

    public MammalImpl(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.setLivingRegion(livingRegion);
    }

    @Override
    public String getLivingRegion() {
        return this.livingRegion;
    }

    private void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")) {
            super.setFoodEaten(food.getQuantity());
        } else {
            if (this.getAnimalType().equals("Mouse")){
                System.out.println("Mice are not eating that type of food!");
            } else {
                System.out.printf("%ss are not eating that type of food!%n", this.getAnimalType());
            }
        }
    }

    @Override
    public String toString() {
        DecimalFormat formater = new DecimalFormat("#.##");
        return this.getAnimalType() + "[" + this.getAnimalName() + ", " + formater.format(this.getAnimalWeight()) +
                ", " + this.getLivingRegion() + ", " + this.getFoodEaten() + "]";
    }
}
