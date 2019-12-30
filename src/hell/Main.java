package hell;

import hell.entities.miscellaneous.ManagerImpl;
import hell.interfaces.Manager;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new ManagerImpl();

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String result = "";
        while (!"Quit".equals(line)){
            String[] tokens = line.split("\\s+");

            switch (tokens[0]){
                case "Hero":
                    result = manager.addHero(Arrays.asList(tokens[1], tokens[2]));
                    break;
                case "Item":
                    result = manager.addItem(Arrays.asList(tokens));
                    break;
                case "Recipe":
                    result = manager.addRecipe(Arrays.asList(tokens));
                    break;
            }

            line = scanner.nextLine();
        }

    }
}