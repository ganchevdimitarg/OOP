package WildFarm;

import WildFarm.Animal.*;
import WildFarm.Food.Food;
import WildFarm.Food.Meat;
import WildFarm.Food.Vegetable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        MammalImpl animal = null;
        Food food = null;

        List<AnimalImpl> animals = new ArrayList<>();
        List<Food> foods = new ArrayList<>();

        while (true) {
            String tokens = reader.readLine();
            if (tokens.equals("End")) {
                break;
            }

            String[] animalInfo = tokens.split("\\s+");
            switch (animalInfo[0].toLowerCase()) {
                case "cat":
                    animal = new Cat(animalInfo[1], animalInfo[0],
                            Double.parseDouble(animalInfo[2]), animalInfo[3], animalInfo[4]);
                    break;
                case "mouse":
                    animal = new Mouse(animalInfo[1], animalInfo[0],
                            Double.parseDouble(animalInfo[2]), animalInfo[3]);
                    break;
                case "tiger":
                    animal = new Tiger(animalInfo[1], animalInfo[0],
                            Double.parseDouble(animalInfo[2]), animalInfo[3]);
                    break;
                default:
                    animal = new Zebra(animalInfo[1], animalInfo[0],
                            Double.parseDouble(animalInfo[2]), animalInfo[3]);
                    break;
            }
            tokens = reader.readLine();
            String[] foodInfo = tokens.split("\\s+");
            if (foodInfo[0].equals("Vegetable")) {
                food = new Vegetable(Integer.parseInt(foodInfo[1]));

            } else {
                food = new Meat(Integer.parseInt(foodInfo[1]));

            }
            animals.add(animal);
            foods.add(food);
        }
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).makeSound();
            animals.get(i).eat(foods.get(i));
        }

        for (AnimalImpl animal1 : animals) {
            System.out.println(animal1.toString());
        }
    }
}

