package Vehicles;

public abstract class VehiclesImpl implements Vehicles {
    private double fuelQuantity;
    private double fuelConsumption;
    private int tankCapacity;

    public VehiclesImpl(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    protected void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    protected double getFuelQuantity() {
        return this.fuelQuantity;
    }

    protected double getFuelConsumption() {
        return this.fuelConsumption;
    }

    protected int getTankCapacity() {
        return this.tankCapacity;
    }

    protected abstract boolean driving(double distance);

    public void refuel(double liters) {
        if (liters <= 0){
            System.out.println("Fuel must be a positive number");
            return;
        }
        if ((this.getFuelQuantity() + liters) > this.getTankCapacity()  ){
            System.out.println("Cannot fit fuel in tank");
            return;
        }
        this.setFuelQuantity(this.getFuelQuantity() + liters);
    }


}
