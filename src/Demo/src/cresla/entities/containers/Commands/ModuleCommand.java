package cresla.entities.containers.Commands;

import cresla.entities.containers.Module.CooldownSystem;
import cresla.entities.containers.Module.CryogenRod;
import cresla.entities.containers.Module.HeatProcessor;
import cresla.interfaces.AbsorbingModule;
import cresla.interfaces.EnergyModule;

public class ModuleCommand {
    private int reactorId;
    private String type;
    private int additionalParameter;


    public ModuleCommand(int reactorId, String type, int additionalParameter) {
        this.reactorId = reactorId;
        this.type = type;
        this.additionalParameter = additionalParameter;
    }

    private int getReactorId() {
        return reactorId;
    }

    private String getType() {
        return type;
    }

    private int getAdditionalParameter() {
        return additionalParameter;
    }

    public String createModule(){
        String output = "";
        if (this.getType().equals("CryogenRod")){
            EnergyModule moduleCryo = new CryogenRod(this.getAdditionalParameter());

            output = String.format("Added %s - %d to Reactor - %d", this.getType(), moduleCryo.getId(), this.getReactorId());
        } else if (this.getType().equals("HeatProcessor")){
            AbsorbingModule moduleHeat = new HeatProcessor(this.getAdditionalParameter());

            output = String.format("Added %s - %d to Reactor - %d", this.getType(), moduleHeat.getId(), this.getReactorId());
        } else {
            AbsorbingModule moduleCool = new CooldownSystem(this.getAdditionalParameter());

            output = String.format("Added %s - %d to Reactor - %d", this.getType(), moduleCool.getId(), this.getReactorId());
        }

        return output;
    }
}
