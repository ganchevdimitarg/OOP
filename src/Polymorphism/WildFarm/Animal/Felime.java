package WildFarm.Animal;

import WildFarm.Food.Food;

public abstract class Felime extends MammalImpl {
    public Felime(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        this.setFoodEaten(food.getQuantity());
    }
}
