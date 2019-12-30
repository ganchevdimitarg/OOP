package Gtsecond;

import java.util.HashMap;
import java.util.Map;

public class Bag {
    private long capacity;
    private long currentWeight;
    private long gold;
    private Map<String, Long> gems;
    private Map<String, Long> cash;
    private long totalGems;
    private long totalCash;
    private boolean goldAdded;

    public Bag(long capacity) {
        this.capacity = capacity;
        this.currentWeight = 0;
        this.gold = 0;
        this.gems = new HashMap<>();
        this.cash = new HashMap<>();
        this.totalGems = 0;
        this.totalCash = 0;
        this.goldAdded = false;
    }


    public void addCash(String item, long quantity) {
        if (this.hasFreeCapacity(quantity) && this.totalGems >= this.totalCash + quantity) {
            if (!this.cash.containsKey(item)) {
                this.cash.put(item, quantity);
            } else {
                this.cash.put(item, this.cash.get(item) + quantity);
            }
            this.totalCash += quantity;
            this.currentWeight += quantity;
        }
    }

    private boolean hasFreeCapacity(long weight) {
        return this.currentWeight + weight <= this.capacity;
    }

    public void addGems(String item, long quantity) {
        if (this.hasFreeCapacity(quantity) && this.gold >= this.totalGems + quantity) {
            if (!this.gems.containsKey(item)) {
                this.gems.put(item, quantity);
            } else {
                this.gems.put(item, this.gems.get(item) + quantity);
            }
            this.totalGems += quantity;
            this.currentWeight += quantity;
        }
    }

    public void addGold(long quantity) {
        if (this.hasFreeCapacity(quantity)) {
            this.goldAdded = true;
            this.gold += quantity;
            this.currentWeight += quantity;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.goldAdded) {
            stringBuilder.append("<Gold> $").append(this.gold).append(System.lineSeparator());
            stringBuilder.append("##Gold - ").append(this.gold).append(System.lineSeparator());
        }
        if (this.gems.size() > 0) {
            stringBuilder.append("<Gem> $").append(this.totalGems).append(System.lineSeparator());
            this.gems.entrySet().stream().sorted((f, s) -> {
                int result = s.getKey().compareTo(f.getKey());
                if (result == 0) {
                    result = f.getValue().compareTo(s.getValue());
                }
                return result;
            }).forEach(e -> {
                stringBuilder.append("##")
                        .append(e.getKey())
                        .append(" - ")
                        .append(e.getValue())
                        .append(System.lineSeparator());
            });
        }
        if (this.cash.size() > 0) {
            stringBuilder.append("<Cash> $").append(this.totalCash).append(System.lineSeparator());
            this.cash.entrySet().stream().sorted((f, s) -> {
                int result = s.getKey().compareTo(f.getKey());
                if (result == 0) {
                    result = f.getValue().compareTo(s.getValue());
                }
                return result;
            }).forEach(e -> {
                stringBuilder.append("##")
                        .append(e.getKey())
                        .append(" - ")
                        .append(e.getValue())
                        .append(System.lineSeparator());
            });
        }
        return stringBuilder.toString();
    }
}
