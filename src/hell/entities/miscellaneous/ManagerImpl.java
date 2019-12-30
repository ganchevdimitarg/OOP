package hell.entities.miscellaneous;

import hell.entities.miscellaneous.Heros.Assassin;
import hell.entities.miscellaneous.Heros.Barbarian;
import hell.entities.miscellaneous.Heros.Wizard;
import hell.entities.miscellaneous.Items.CommonItem;
import hell.entities.miscellaneous.Items.RecipeItem;
import hell.interfaces.Hero;
import hell.interfaces.Item;
import hell.interfaces.Manager;
import hell.interfaces.Recipe;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ManagerImpl implements Manager {
    private Map<String, Hero> localHero;

    public ManagerImpl() {
        this.localHero = new HashMap<>();
    }

    @Override
    public String addHero(List<String> arguments) {
        Hero result = null;
        switch (arguments.get(1)) {
            case "Barbarian":
                result = new Barbarian(arguments.get(0));
                break;
            case "Assassin":
                result = new Assassin(arguments.get(0));
                break;
            case "Wizard":
                result = new Wizard(arguments.get(0));
                break;
        }
        return String.format("Created %s - %s%n", result.getClass().getSimpleName(), result.getName());
    }

    @Override
    public String addItem(List<String> arguments) {

        String nameOfItem = arguments.get(1);
        String heroName =arguments.get(2);
        int strengthBonus = Integer.parseInt(arguments.get(3));
        int agilityBonus = Integer.parseInt(arguments.get(4));
        int intelligenceBonus = Integer.parseInt(arguments.get(5));
        int hitpointsBonus = Integer.parseInt(arguments.get(6));
        int damageBonus = Integer.parseInt(arguments.get(7));
        Item common = new CommonItem(nameOfItem, strengthBonus, agilityBonus, intelligenceBonus,
                hitpointsBonus, damageBonus);
        Hero current = this.localHero.get(heroName);
        current.addItem(common);

        return String.format("Added item - %s to Hero - %s%n", nameOfItem, heroName);
    }

    @Override
    public String addRecipe(List<String> arguments) {
        String nameOfItem = arguments.get(1);
        String heroName =arguments.get(2);
        int strengthBonus = Integer.parseInt(arguments.get(3));
        int agilityBonus = Integer.parseInt(arguments.get(4));
        int intelligenceBonus = Integer.parseInt(arguments.get(5));
        int hitpointsBonus = Integer.parseInt(arguments.get(6));
        int damageBonus = Integer.parseInt(arguments.get(7));
        List<String> items = arguments.stream().skip(8).collect(Collectors.toList());
        Recipe recipe = new RecipeItem(nameOfItem, strengthBonus, agilityBonus, intelligenceBonus,
                hitpointsBonus, damageBonus, items);
        Hero current = this.localHero.get(heroName);
        current.addRecipe(recipe);

        return String.format("Added item - %s to Hero - %s%n", nameOfItem, heroName);
    }

    @Override
    public String inspect(List<String> arguments) {
        return null;
    }

    @Override
    public String quit() {
        return null;
    }
}
