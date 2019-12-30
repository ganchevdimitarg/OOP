package GreedyTimes;

import java.util.LinkedHashMap;

public class Bag {
    private LinkedHashMap<String, Long> bag;

    public Bag() {
        this.bag = new LinkedHashMap<>();
    }

    public LinkedHashMap<String, Long> getBag() {
        return bag;
    }

    public long getSumOfItemQuantity(){
        return this.bag.values().stream().mapToLong(e -> e).sum();
    }

    public boolean exists(String key){
        return this.bag.containsKey(key);
    }

    public long getBagItem(String key){
        return this.bag.get(key);
    }
}
