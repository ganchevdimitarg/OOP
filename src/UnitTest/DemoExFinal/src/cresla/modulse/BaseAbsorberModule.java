package cresla.modulse;

import cresla.interfaces.AbsorbingModule;

public abstract class BaseAbsorberModule extends BaseModules implements AbsorbingModule {

    private int heatAbsorbing;

    protected BaseAbsorberModule(int id, int heatAbsorbing) {
        super(id);
        this.heatAbsorbing = heatAbsorbing;
    }

    @Override
    public int getHeatAbsorbing() {
        return this.heatAbsorbing;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Heat Absorbing: %d", this.heatAbsorbing);
    }
}
