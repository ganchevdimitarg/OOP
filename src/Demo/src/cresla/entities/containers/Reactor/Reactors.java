package cresla.entities.containers.Reactor;

import cresla.entities.containers.ModuleContainer;
import cresla.interfaces.AbsorbingModule;
import cresla.interfaces.Container;
import cresla.interfaces.EnergyModule;
import cresla.interfaces.Reactor;

public abstract class Reactors implements Reactor {

    private int id;
    private Container moduleContainer;

    protected Reactors(int id, int modulCapacity) {
        this.id = id;
        this.moduleContainer = new ModuleContainer(modulCapacity);
    }

    @Override
    public long getTotalEnergyOutput() {
        return this.moduleContainer.getTotalEnergyOutput();
    }

    @Override
    public long getTotalHeatAbsorbing() {
        return this.moduleContainer.getTotalHeatAbsorbing();
    }

    @Override
    public int getModuleCount() {
        return 0;
    }

    @Override
    public void addEnergyModule(EnergyModule energyModule) {

    }

    @Override
    public void addAbsorbingModule(AbsorbingModule absorbingModule) {

    }

    @Override
    public int getId() {
        return 0;
    }
}
