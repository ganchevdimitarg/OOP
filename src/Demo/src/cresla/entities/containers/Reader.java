package cresla.entities.containers;

import cresla.interfaces.InputReader;

import java.util.Scanner;

public class Reader implements InputReader {
    private Scanner scanner;

    public Reader() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String readLine() {
        return this.scanner.nextLine();
    }
}
