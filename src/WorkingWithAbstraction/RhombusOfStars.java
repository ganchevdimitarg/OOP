import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n - 1; i++) {
            printRow(n, i);
        }

        System.out.println(repeatChar("* ", n - 1) + "*");

        for (int i = n - 1; i > 0; i--) {
            printRow(n, i);
        }
    }

    private static void printRow(int n, int i) {
        System.out.print(repeatChar(" ", n - i));
        System.out.print(repeatChar("* ", i));
        System.out.println();
    }

    private static String repeatChar(String symbol, int n) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            stringBuilder.append(symbol);
        }
        return stringBuilder.toString();
    }
}
