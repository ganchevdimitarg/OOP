package cresla.modulse;

public class CryoReactor extends BaseReactors {

    private int cryoProductionIndex;

    public CryoReactor(int id, int modulCapacity, int cryoProductionIndex) {
        super(id, modulCapacity);
        this.cryoProductionIndex = cryoProductionIndex;
    }

    @Override
    public long getTotalEnergyOutput() {
        return super.getTotalEnergyOutput() * this.cryoProductionIndex;
    }
}
