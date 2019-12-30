package InterfacesAndAbstraction.Тelephony;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> number = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String> web = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Smartphone smartphones = new Smartphone(number, web);

        System.out.print(smartphones.call());
        System.out.print(smartphones.browse());
    }
}
