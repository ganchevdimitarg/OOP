package cresla.entities.containers.Reactor;

public class HeatReactor extends Reactors {
    private int heatReductionIndex;

    public HeatReactor(int id, int modulCapacity, int heatReductionIndex) {
        super(id, modulCapacity);
        this.heatReductionIndex = heatReductionIndex;
    }

    public int getHeatReductionIndex() {
        return heatReductionIndex;
    }
}
