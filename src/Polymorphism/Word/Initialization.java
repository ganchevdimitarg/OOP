package Polymorphism.Word;

import Polymorphism.Word.AdvancedCommands;

public class Initialization {

    public static CommandInterface buildCommandInterface(StringBuilder text) {
        CommandInterface commandInterface = new AdvancedCommands(text);
        commandInterface.init();
        return commandInterface;
    }

}
