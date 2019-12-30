package cresla.modulse;

import cresla.interfaces.EnergyModule;

public abstract class BaseEnergyModule extends BaseModules implements EnergyModule {

    private int energyOutput;

    protected BaseEnergyModule(int id, int energyOutput) {
        super(id);
        this.energyOutput = energyOutput;
    }

    @Override
    public int getEnergyOutput() {
        return this.energyOutput;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("Energy Output: %d", this.energyOutput);
    }
}
