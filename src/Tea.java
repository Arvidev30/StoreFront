public class Tea extends ProductForSale {


    public Tea(String type, double price, String description) {
        super(type,price,description);

    }

    @Override
    public void showDetails() {
        System.out.println(type + "is used as a refreshment...");
        System.out.printf("It is priced at a rate of Rs. %6.2f %n", price);
        System.out.println(description);
    }
}
