package Encapsulation.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name.isEmpty() || name.contains(" ")) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void buyProduct(Product product) {
        if (product.getCost() > this.money) {
            throw new IllegalArgumentException(String.format("%s can't afford %s", this.name, product.getName()));
        }
        this.products.add(product);
        this.setMoney(this.money - product.getCost());
    }

    @Override
    public String toString() {
        if (!isHaveProducts()){
            return this.getName() + " – Nothing bought";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.name).append(" - ");
        for (Product product : products) {
            stringBuilder.append(product.getName()).append(", ");
        }
        return stringBuilder.substring(0, stringBuilder.length() - 2);
    }

    private boolean isHaveProducts() {
        return this.getProducts().size() > 0;
    }
}
