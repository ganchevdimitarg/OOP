package Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] carInfo = reader.readLine().split("\\s+");
        String[] truckInfo = reader.readLine().split("\\s+");
        String[] busInfo = reader.readLine().split("\\s+");
        int commands = Integer.parseInt(reader.readLine());

        VehiclesImpl car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]), Integer.parseInt(carInfo[3]));
        VehiclesImpl truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]), Integer.parseInt(truckInfo[3]));
        Bus bus = new Bus(Double.parseDouble(busInfo[1]), Double.parseDouble(busInfo[2]), Integer.parseInt(busInfo[3]));


        while (commands-- > 0) {
            String[] commandInfo = reader.readLine().split("\\s+");
            if (commandInfo[0].equals("Drive")) {
                if (commandInfo[1].equals("Car")) {
                    car.printVehicleTravelled(Double.parseDouble(commandInfo[2]));
                } else if (commandInfo[1].equals("Bus")) {
                    bus.printVehicleTravelledFull(Double.parseDouble(commandInfo[2]));
                } else {
                    truck.printVehicleTravelled(Double.parseDouble(commandInfo[2]));
                }
            } else if (commandInfo[0].equals("DriveEmpty")) {
                bus.printVehicleTravelled(Double.parseDouble(commandInfo[2]));
            } else {
                if (commandInfo[1].equals("Car")) {
                    car.refuel(Double.parseDouble(commandInfo[2]));
                } else if (commandInfo[1].equals("Bus")) {
                    bus.refuel(Double.parseDouble(commandInfo[2]));
                } else {
                    truck.refuel(Double.parseDouble(commandInfo[2]));
                }
            }
        }
        car.printVehicleLeftFuel();
        truck.printVehicleLeftFuel();
        bus.printVehicleLeftFuel();
    }
}
