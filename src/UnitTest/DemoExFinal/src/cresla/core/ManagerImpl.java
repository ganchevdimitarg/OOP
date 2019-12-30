package cresla.core;

import cresla.interfaces.*;
import cresla.modulse.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerImpl implements Manager {
    private static int id;
    private Map<Integer, Reactor> reactirs;
    private Map<Integer, Module> modules;

    public ManagerImpl() {
        id = 1;
        this.reactirs = new HashMap<>();
        this.modules = new HashMap<>();
    }

    @Override
    public String reactorCommand(List<String> arguments) {

        String type = arguments.get(0);
        int addiParameter = Integer.parseInt(arguments.get(1));
        int moduleCapasity = Integer.parseInt(arguments.get(1));

        Reactor reactor = null;
        if (type.equals("Cryo")){
            reactor = new CryoReactor(id, moduleCapasity, addiParameter);
        } else {
            reactor = new HeatReactor(id, moduleCapasity, addiParameter);
        }

        this.reactirs.putIfAbsent(id, reactor);

        return String.format("Created %s Reactor – %d", type, id++);
    }

    @Override
    public String moduleCommand(List<String> arguments) {
        int reatorId = Integer.parseInt(arguments.get(0));
        String type = arguments.get(1);
        int additinalParam = Integer.parseInt(arguments.get(0));

        Module module = null;

        switch (type){
            case "CryogenRod":
                module = new CryogenRod(id, additinalParam);
                break;
            case "HeatProcessor":
                module = new HeatProcessor(id,additinalParam);
                break;
            case "CoolingSystem":
                module = new CooldownSystem(id,additinalParam);
                break;
        }
        if (type.equals("CryogenRod")) {
            this.reactirs.get(reatorId).addEnergyModule((EnergyModule) module);
        } else {
            this.reactirs.get(reatorId).addAbsorbingModule((AbsorbingModule) module);
        }

        return String.format("Added %s - %d to Reactor - %d", type, id++, reatorId);
    }

    @Override
    public String reportCommand(List<String> arguments) {

        int objectId = Integer.parseInt(arguments.get(0));

        String output = "";
        if (this.reactirs.containsKey(objectId)){
            output = this.reactirs.get(objectId).toString();
        } else if (this.modules.containsKey(objectId)){
            output = this.modules.get(objectId).toString();
        }


        return output;
    }

    @Override
    public String exitCommand(List<String> arguments) {
        StringBuilder sb = new StringBuilder();




        return null;
    }
}
