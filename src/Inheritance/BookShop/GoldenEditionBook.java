package BookShop;

public class GoldenEditionBook extends Book{

    public GoldenEditionBook(String title, String author, double price) {
        super(title, author, price);
    }

    public double getPrice(){
        return (super.getPrice() * 0.3) + super.getPrice();
    }
}
