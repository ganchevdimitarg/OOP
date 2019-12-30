package carTrip;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarTest {
    private static final String DEV_MODEL = "Ford";
    private static final double DEV_TANKCAPACITY = 30.0;
    private static final double DEV_FUELAMOUNT = 10.0;
    private static final double DEV_CONSUMPTION = 5.0;

    private Car car;

    @Before
    public void before() {
        this.car = new Car(DEV_MODEL, DEV_TANKCAPACITY, DEV_FUELAMOUNT, DEV_CONSUMPTION);
    }

    @Test(expected = IllegalAccessException.class)
    public void constructorShouldThrowIfModelIsEmpty(){
        new Car("",1.0,1.0,1.0);
    }

    @Test(expected = IllegalAccessException.class)
    public void constructorShouldThrowIfTank(){
        new Car("Honda",1.0,2.0,1.0);
    }

    @Test(expected = IllegalAccessException.class)
    public void constructorShouldThrowIfConsumption(){
        new Car("Honda",1.0,1.0,-1.0);
    }

    @Test
    public void getModelShouldWorkCorrectly(){
        Assert.assertEquals(DEV_MODEL, this.car.getModel());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setModelShouldThrowExceptionWithNullModel() {
        this.car.setModel(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setModelShouldThrowExceptionWithEmpty() {
        this.car.setModel("");
    }

    @Test
    public void setModelShouldTSetCorrectlyModel() {
        final String newModel = "Honda";
        this.car.setModel(newModel);

        Assert.assertEquals(newModel, this.car.getModel());
    }

    @Test
    public void getTankCapacityShouldTSetCorrectlyTankCapacity() {
        double capacity = this.car.getTankCapacity();

        Assert.assertEquals(DEV_TANKCAPACITY, capacity, 0.0);
    }

    @Test
    public void setTankCapacityShouldTSetTankCapacity() {
        final double newTank = 12.0;
        this.car.setTankCapacity(newTank);

        Assert.assertEquals(newTank, this.car.getTankCapacity(),0.0);
    }

    @Test
    public void getFuelAmountShouldTSetFuelAmount() {
        double capacity = this.car.getFuelAmount();

        Assert.assertEquals(DEV_FUELAMOUNT, capacity, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setFuelAmountShouldThrowExceptionWhenAmountIsMoreThanTankCapacity() {
        this.car.setFuelAmount(DEV_FUELAMOUNT + 1);
    }

    @Test
    public void setFuelAmountShouldSetCorrectlyAmount() {
        final double newAmount = 5.0;
        this.car.setFuelAmount(newAmount);

        Assert.assertEquals(newAmount, this.car.getFuelAmount(), 0.0);
    }

    @Test
    public void getFuelConsumptionShouldGetCorrectlyConsumption() {
        double capacity = this.car.getFuelConsumptionPerKm();

        Assert.assertEquals(DEV_CONSUMPTION, capacity, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setFuelConsumptionShouldThrowExceptionWhenConsumptionIsZero() {
        this.car.setFuelConsumptionPerKm(0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setFuelConsumptionShouldThrowExceptionWhenConsumptionIsNegative() {
        this.car.setFuelConsumptionPerKm(-1.0);
    }

    @Test
    public void setFuelConsumptionShouldSetCorrectlyConsumption() {
        double newCons = 10.0;
        this.car.setFuelConsumptionPerKm(newCons);

        Assert.assertEquals(newCons, this.car.getFuelConsumptionPerKm(),0.0);
    }

    @Test(expected = IllegalStateException.class)
    public void driveShouldThrowExceptionWhenConsumptionIsMoreThanFuelAmount() {
        this.car.drive(5.0);
    }

    @Test
    public void driveShouldDecreaseFuelAmount() {
        this.car.drive(2);

        Assert.assertEquals(DEV_FUELAMOUNT - DEV_CONSUMPTION, this.car.getFuelAmount(),0.0);
    }

    @Test
    public void driveShouldDecreaseFuelAmountReturnMassage() {
        String result = this.car.drive(2);

        Assert.assertEquals("Have a nice trip", result);
    }


    @Test(expected = IllegalStateException.class)
    public void refuelShouldThrowException() {
        this.car.refuel(50);
    }

    @Test
    public void refuelShouldUpdateFuelAmount(){
        double refuel = 10.0;

        this.car.refuel(refuel);

        Assert.assertEquals(refuel+ DEV_FUELAMOUNT, this.car.getFuelAmount(),0.0);
    }
}