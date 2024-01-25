public class Biscuits extends ProductForSale{

    public Biscuits(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(type + "is used to eat as a snack");
        System.out.printf("It is priced at a rate of Rs. %6.2f %n", price);
        System.out.println(description);
    }
}
