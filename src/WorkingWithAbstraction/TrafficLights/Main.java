package TrafficLights;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> trafficLightColor = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        int numbersTimesToChangeColor = Integer.parseInt(scanner.nextLine());

        while (numbersTimesToChangeColor-- > 0) {
                changeLightColor(trafficLightColor);
            System.out.println();
        }
    }

    private static void changeLightColor(List<String> trafficLightColor) {
        for (int i = 0; i < trafficLightColor.size(); i++) {
            if (trafficLightColor.get(i).equals("GREEN")){
                System.out.print("YELLOW ");
                trafficLightColor.set(i, "YELLOW");
            } else if (trafficLightColor.get(i).equals("RED")){
                System.out.print("GREEN ");
                trafficLightColor.set(i, "GREEN");
            } else {
                System.out.print("RED ");
                trafficLightColor.set(i, "RED");
            }
        }
    }


}
