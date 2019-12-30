package Encapsulation.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] personsNameAndMoney = scanner.nextLine().split("[=;]+");
        String[] productsNameAndCost = scanner.nextLine().split("[=;]+");
        List<Person> people = new ArrayList<>();
        List<Product> products = new ArrayList<>();

        for (int i = 0; i < personsNameAndMoney.length; i += 2) {
            try {
                Person person = new Person(personsNameAndMoney[i], Double.parseDouble(personsNameAndMoney[i + 1]));
                people.add(person);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        for (int i = 0; i < productsNameAndCost.length; i += 2) {
            try {
                Product product = new Product(productsNameAndCost[i], Double.parseDouble(productsNameAndCost[i + 1]));
                products.add(product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        String tokens = scanner.nextLine();
        while (!"END".equals(tokens)) {
            String personName = tokens.split(" ")[0];
            String prodictName = tokens.split(" ")[1];

            for (Person person : people) {
                for (Product product : products) {
                    if (person.getName().equals(personName)) {
                        try {
                            if (product.getName().equals(prodictName)) {
                                person.buyProduct(product);
                                System.out.printf("%s bought %s%n", personName, prodictName);
                                break;
                            }
                        } catch (IllegalArgumentException e){
                            System.out.println(e.getMessage());
                        }
                    }
                }
            }


            tokens = scanner.nextLine();
        }

        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
