package HotelReservation;

public class PriceCalculator {

   public static double calculate(ReservationDetails details){
       double price = details.getPricePerDay() * details.getNumberOfDays();
       price *= details.getSeason().getValue();
       price *= (1 - details.getDiscountType().getValue());

       return price;
   }
}
