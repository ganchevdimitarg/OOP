package cresla;

import cresla.core.ManagerImpl;
import cresla.interfaces.Manager;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Manager manager = new ManagerImpl();

        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("Exit")) {

            String[] tokens = input.split("\\s+");
            List<String> params = Arrays.stream(tokens).skip(1).collect(Collectors.toList());

            String command = tokens[0];

            String output = "";
            switch (command) {
                case "Reactor":
                    output = manager.reactorCommand(params);
                    break;
                case "Module":
                    output = manager.moduleCommand(params);
                    break;
                case "Report":
                    output = manager.reportCommand(params);
                    break;
            }

            if (!output.isEmpty()) {
                System.out.println(output);
            }


            input = scanner.nextLine();
        }

        String output = manager.exitCommand(Arrays.stream(input.split("\\s+")).skip(1).collect(Collectors.toList()));

        System.out.println(output);

    }
}
