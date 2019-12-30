package Vehicles;
import java.text.DecimalFormat;

public class Car extends VehiclesImpl {


    public Car(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    protected boolean driving(double distance) {
        double leftFuel = this.getFuelQuantity() - ((this.getFuelConsumption() + 0.9) * distance);
        if (leftFuel > 0) {
            this.setFuelQuantity(leftFuel);
            return true;
        }
        return false;
    }

    @Override
    public void printVehicleTravelled(double distance){
        DecimalFormat format = new DecimalFormat("####.##");
        if (driving(distance)){
            System.out.println("Car travelled " + format.format(distance) + " km");
        } else {
            System.out.println("Car needs refueling");
        }
    }

    @Override
    public void printVehicleLeftFuel(){
        System.out.printf("Car: %.2f%n", this.getFuelQuantity());
    }
}
