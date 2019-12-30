package cresla;

import cresla.entities.containers.ManagerImpl;
import cresla.entities.containers.Reader;
import cresla.entities.containers.Writer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        Writer writer = new Writer();
        String lines = reader.readLine();
        ManagerImpl manager = new ManagerImpl();

        while (!lines.equalsIgnoreCase("Exit")) {
            String[] tokens = lines.split("\\s+");

            String commnad = tokens[0];
            if (commnad.equals("Reactor")) {
                List<String> reactor = Arrays.stream(tokens).skip(1).collect(Collectors.toList());
                writer.writeLine(manager.reactorCommand(reactor));
            } else if (commnad.equals("Module")) {
                List<String> module = Arrays.stream(tokens).skip(1).collect(Collectors.toList());
                writer.writeLine(manager.moduleCommand(module));
            } else if (commnad.equals("Report")){
                List<String> module = Arrays.stream(tokens).collect(Collectors.toList());
                writer.writeLine(manager.reportCommand(module));
            }

            lines = reader.readLine();
        }

    }
}
