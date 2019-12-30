package cresla.entities.containers.Module;

import cresla.interfaces.EnergyModule;

public class CryogenRod extends Modules implements EnergyModule {
    private int energyOutput;

    public CryogenRod(int id, int energyOutput) {
        super(id);
        this.energyOutput = energyOutput;
    }

    @Override
    public int getEnergyOutput() {
        return this.energyOutput;
    }
}
