package cresla.entities.containers.Module;

import cresla.interfaces.AbsorbingModule;

public abstract class Heater extends Modules implements AbsorbingModule {

    private int heatAbsorbing;

    protected Heater(int id, int heatAbsorbing) {
        super(id);
        this.heatAbsorbing = heatAbsorbing;
    }

    @Override
    public int getHeatAbsorbing() {
        return this.heatAbsorbing;
    }
}
