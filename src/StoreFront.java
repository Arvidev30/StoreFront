import java.util.ArrayList;

public class StoreFront {

    private static ArrayList<ProductForSale> storeProduct = new ArrayList<>();

    public static void main(String[] args) {

        storeProduct.add(new Biscuits("Milk Bikis ",10,"Has milk content in it.." ));
        storeProduct.add(new Biscuits("Marie Gold ", 10, "Is made up of whole wheat..."));

        storeProduct.add(new ColdDrinks("Pepsi", 40, "Highly carbonated drink.."));
        storeProduct.add(new ColdDrinks("Maaza", 45, "Has real mango in it.."));

        listProducts();

        System.out.println("\n Order 1:");
        ArrayList<OrderItem> order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1,0,4);
        addItemToOrder(order1,1,5);
        printOrder(order1);

        System.out.println("Order 2:");
        ArrayList<OrderItem> order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2,3,3);
        addItemToOrder(order2, 2,8);
        printOrder(order2);

    }

    public static void listProducts(){
        for (ProductForSale product : storeProduct){
            System.out.println("---------------------");
            product.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity){
            order.add(new OrderItem(quantity, storeProduct.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;

        for (OrderItem item : order ){
            item.productForSale.printPricedLineItem(item.quantity);
            salesTotal += item.productForSale.getSalesPrice(item.quantity);
        }

        System.out.printf("Sales Total = %6.2f %n", salesTotal);
    }
}
