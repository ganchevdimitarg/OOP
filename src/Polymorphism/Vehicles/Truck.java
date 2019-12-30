package Vehicles;

import java.text.DecimalFormat;

public class Truck extends VehiclesImpl {
    public Truck(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    protected boolean driving(double distance) {
        double leftFuel = this.getFuelQuantity() - ((this.getFuelConsumption() + 1.6) * distance);
        if (leftFuel > 0) {
            this.setFuelQuantity(leftFuel);
            return true;
        }
        return false;
    }

    @Override
    public void refuel(double liters) {
        if (liters <= 0){
            System.out.println("Fuel must be a positive number");
            return;
        }
        if ((this.getFuelQuantity() + liters) > this.getTankCapacity()){
            System.out.println("Cannot fit fuel in tank");
            return;
        }
        this.setFuelQuantity(this.getFuelQuantity() + (liters * 0.95));
    }

    @Override
    public void printVehicleTravelled(double distance) {
        DecimalFormat format = new DecimalFormat("####.##");
        if (driving(distance)) {
            System.out.println("Truck travelled " + format.format(distance) + " km");
        } else {
            System.out.println("Truck needs refueling");
        }
    }

    @Override
    public void printVehicleLeftFuel(){
        System.out.printf("Truck: %.2f%n", this.getFuelQuantity());
    }
}
