package cresla.entities.containers.Module;

import cresla.interfaces.Module;

public abstract class Modules implements Module {
    private int id;

    public Modules(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }
}
