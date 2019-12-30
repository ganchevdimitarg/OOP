package PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coordinates  = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Point topLeft = new Point(coordinates [0], coordinates [1]);
        Point downRight = new Point(coordinates [2], coordinates [3]);

        Rectangle rectangle = new Rectangle(topLeft, downRight);

        int lines = Integer.parseInt(scanner.nextLine());

        while (lines-- > 0){
            int[] candidas = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            Point pointCandidas = new Point(candidas[0], candidas[1]);

            System.out.println(rectangle.contains(pointCandidas));
        }
    }
}
