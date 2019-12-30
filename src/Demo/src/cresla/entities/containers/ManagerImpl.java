package cresla.entities.containers;

import cresla.entities.containers.Commands.ModuleCommand;
import cresla.entities.containers.Commands.ReactorCommand;
import cresla.interfaces.Manager;

import java.util.List;

public class ManagerImpl implements Manager {
    @Override
    public String reactorCommand(List<String> arguments) {
        String reactorType = arguments.get(0);
        int additionalParameter = Integer.parseInt(arguments.get(1));
        int moduleCapacity = Integer.parseInt(arguments.get(2));

        ReactorCommand reactor = new ReactorCommand(reactorType, additionalParameter, moduleCapacity);

        return reactor.createReactor();
    }

    @Override
    public String moduleCommand(List<String> arguments) {
        int reactorId = Integer.parseInt(arguments.get(0));
        String type = arguments.get(1);
        int additionalParameter = Integer.parseInt(arguments.get(2));

        ModuleCommand module = new ModuleCommand(reactorId, type, additionalParameter);

        return module.createModule();
    }

    @Override
    public String reportCommand(List<String> arguments) {
//        int id = Integer.parseInt(arguments.get(0));
//        String ouyput = String.format("{reactorType} – {reactorId}\n" +
//                "Energy Output: {energyOutput}\n" +
//                "Heat Absorbing: {heatAbsorbing}\n" +
//                "Modules: {moduleCount}\t{moduleType} Module – {moduleId}\n" +
//                "{additionalParam}: {additionalParamValue}\n", );

        return null;
    }

    @Override
    public String exitCommand(List<String> arguments) {
        return null;
    }
}
