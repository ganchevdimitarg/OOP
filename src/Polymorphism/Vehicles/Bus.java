package Vehicles;
import java.text.DecimalFormat;

public class Bus extends VehiclesImpl {
    public Bus(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    protected boolean driving(double distance) {
        double leftFuel = this.getFuelQuantity() - (this.getFuelConsumption() * distance);
        return isHaveFuel(leftFuel);
    }

    private boolean drivingFull(double distance){
        double leftFuel = this.getFuelQuantity() - ((this.getFuelConsumption() + 1.4) * distance);
        return isHaveFuel(leftFuel);
    }

    @Override
    public void printVehicleTravelled(double distance){
        DecimalFormat format = new DecimalFormat("####.##");
        if (driving(distance)){
            System.out.println("Bus travelled " + format.format(distance) + " km");
        } else {
            System.out.println("Bus needs refueling");
        }
    }



    public void printVehicleTravelledFull(double distance){
        DecimalFormat format = new DecimalFormat("####.##");
        if (drivingFull(distance)){
            System.out.println("Bus travelled " + format.format(distance) + " km");
        } else {
            System.out.println("Bus needs refueling");
        }
    }

    @Override
    public void printVehicleLeftFuel(){
        System.out.printf("Bus: %.2f%n", this.getFuelQuantity());
    }

    private boolean isHaveFuel(double leftFuel) {
        if (leftFuel > 0) {
            this.setFuelQuantity(leftFuel);
            return true;
        }
        return false;
    }
}
