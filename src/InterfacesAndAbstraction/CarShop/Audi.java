package InterfacesAndAbstraction.CarShop;

public class Audi extends CarImpl implements Rentable {
    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horesePower, String countryProduced, Integer minRentDay, Double pricePerDay) {
        super(model, color, horesePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    public Integer getMinRentDay() {
        return minRentDay;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public String toString() {
        return String.format(
                "This is %s produced in %s and have %d tires%nMinimum rental period of %d days. Price per day %f",
                this.getModel(), this.getCountryProduced(), Car.TIRES, this.getMinRentDay(), this.getPricePerDay());
    }
}
