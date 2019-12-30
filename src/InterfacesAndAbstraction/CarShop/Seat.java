package InterfacesAndAbstraction.CarShop;

public class Seat extends CarImpl implements Sellable {
    private Double price;

    public Seat(String model, String color, Integer horesePower, String countryProduced, Double price) {
        super(model, color, horesePower, countryProduced);
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format(
                "This is %s produced in %s and have %d tires%n%s sells for %f",
                this.getModel(), this.getCountryProduced(), Car.TIRES, this.getModel(), this.getPrice());
    }
}
