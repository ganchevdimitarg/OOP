package JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimestions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int[][] matrix = new int[dimestions[0]][dimestions[1]];

        setMatrixValue(matrix);

        String command = scanner.nextLine();
        long sum = 0;

        while (!"Let the Force be with you".equals(command)) {
            int[] jediCoordinates = Arrays.stream(command.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int[] evilCoordinates = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            Jedi jedi = new Jedi(jediCoordinates[0], jediCoordinates[1], matrix);
            Evil evil = new Evil(evilCoordinates[0], evilCoordinates[1], matrix);

            evil.destroyed();
            sum += jedi.sum();

            command = scanner.nextLine();
        }
        System.out.println(sum);
    }

    private static void setMatrixValue(int[][] matrix) {
        int value = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value++;
            }
        }
    }
}
