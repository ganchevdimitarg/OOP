package WildFarm.Animal;

import WildFarm.Food.Food;

public class Tiger extends Felime {
    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Meat")) {
            super.eat(food);
        } else {
            System.out.printf("%ss are not eating that type of food!%n", this.getAnimalType());
        }
    }
}
