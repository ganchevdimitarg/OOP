package GreedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long capacityBag = Long.parseLong(scanner.nextLine());
        String[] itemAndQuantity = scanner.nextLine().split("\\s+");

        LinkedHashMap<String, LinkedHashMap<String, Long>> bag = new LinkedHashMap<>();
        long gold = 0;
        long gem = 0;
        long cash = 0;

        for (int i = 0; i < itemAndQuantity.length; i += 2) {
            String item = itemAndQuantity[i];
            long quantity = Long.parseLong(itemAndQuantity[i + 1]);

            String tokens = "";

            if (item.length() == 3) {
                tokens = "Cash";
            } else if (item.toLowerCase().endsWith("gem")) {
                tokens = "Gem";
            } else if (item.toLowerCase().equals("gold")) {
                tokens = "Gold";
            }

            if (tokens.equals("")) {
                continue;
            } else if (capacityBag < bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + quantity) {
                continue;
            }

            switch (tokens) {
                case "Gem":
                    if (!bag.containsKey(tokens)) {
                        if (bag.containsKey("Gold")) {
                            if (quantity > getSum(bag.get("Gold"))) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (getSum(bag.get(tokens)) + quantity > getSum(bag.get("Gold"))) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(tokens)) {
                        if (bag.containsKey("Gem")) {
                            if (quantity > getSum(bag.get("Gold"))) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (getSum(bag.get(tokens)) + quantity > getSum(bag.get("Gem"))) {
                        continue;
                    }
                    break;
            }

            bag.putIfAbsent(tokens, new LinkedHashMap<>());
            bag.get(tokens).putIfAbsent(item, 0L);
            bag.get(tokens).put(item, bag.get(tokens).get(item) + quantity);

            switch (tokens) {
                case "Gold":
                    gold += quantity;
                    break;
                case "Gem":
                    gem += quantity;
                    break;
                case "Cash":
                    cash += quantity;
                    break;
            }
        }

        printBagsItem(bag);
    }

    private static long getSum(LinkedHashMap<String, Long> map) {
        return map.values().stream().mapToLong(e -> e).sum();
    }

    private static void printBagsItem(LinkedHashMap<String, LinkedHashMap<String, Long>> bag) {
        for (Map.Entry<String, LinkedHashMap<String, Long>> entry : bag.entrySet()) {
            Long sumValues = getSum(entry.getValue());

            System.out.println(String.format("<%s> $%s", entry.getKey(), sumValues));

            entry.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                    .forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));
        }
    }
}