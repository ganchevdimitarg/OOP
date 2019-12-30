package cresla.entities.containers.Reactor;

public class CryoReactor extends Reactors {

   private int cryoProductionIndex;

    public CryoReactor(int id, int modulCapacity, int cryoProductionIndex) {
        super(id, modulCapacity);
        this.cryoProductionIndex = cryoProductionIndex;
    }

    public int getCryoProductionIndex() {
        return cryoProductionIndex;
    }

}
