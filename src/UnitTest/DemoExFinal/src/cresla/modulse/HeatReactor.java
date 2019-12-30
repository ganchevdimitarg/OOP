package cresla.modulse;

public class HeatReactor extends BaseReactors {
    private int heatReductionIndex;

    public HeatReactor(int id, int modulCapacity, int heatReductionIndex) {
        super(id, modulCapacity);
        this.heatReductionIndex = heatReductionIndex;
    }

    @Override
    public long getTotalHeatAbsorbing() {
        return super.getTotalHeatAbsorbing() + this.heatReductionIndex;
    }
}
