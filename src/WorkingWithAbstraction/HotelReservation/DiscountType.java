package HotelReservation;

public enum DiscountType {
    None(0),
    SecondVisit(10),
    VIP(20);

    private int value;

    DiscountType(int value) {
        this.value = value;
    }

    public double getValue() {
        return value / 100.0;
    }
}
