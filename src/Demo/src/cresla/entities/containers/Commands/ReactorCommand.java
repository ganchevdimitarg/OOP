package cresla.entities.containers.Commands;

import cresla.entities.containers.ModuleContainer;
import cresla.entities.containers.Reactor.CryoReactor;
import cresla.entities.containers.Reactor.HeatReactor;
import cresla.interfaces.Reactor;

public class ReactorCommand {
    private String type;
    private int additionalParameter;
    private int moduleCapacity;

    public ReactorCommand(String type, int additionalParameter, int moduleCapacity) {
        this.type = type;
        this.additionalParameter = additionalParameter;
        this.moduleCapacity = moduleCapacity;
    }

    private String getType() {
        return type;
    }

    private int getAdditionalParameter() {
        return additionalParameter;
    }

    private int getModuleCapacity() {
        return moduleCapacity;
    }

    public String createReactor(){
        String output = "";
        if (this.getType().equals("Cryo")) {
            Reactor reactorCryo = new CryoReactor(this.getAdditionalParameter());
            ModuleContainer moduleContainer = new ModuleContainer(this.getModuleCapacity());
            output = String.format("Created Cryo Reactor – %d", reactorCryo.getId());
        } else {
            Reactor reactorHeat = new HeatReactor(this.getAdditionalParameter());
            ModuleContainer moduleContainer = new ModuleContainer(this.getModuleCapacity());
            output = String.format("Created Heat Reactor – %d", reactorHeat.getId());
        }

        return output;
    }
}
