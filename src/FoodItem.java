import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.out;

public class FoodItem {
    private double price;
    private int quantity;
    private double totalPrice;

    public FoodItem() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price: ");
        this.price = input.nextDouble();
        System.out.print("Enter quantity: ");
        this.quantity = input.nextInt();
        this.totalPrice = price * quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Item\n " +
                "Price:\n " + price +
                "Quantity:\n " + quantity +
                "Total:\n " + totalPrice;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String makeItem = "Y";

        ArrayList<FoodItem> foodItems = new ArrayList<>();

        while (makeItem.equalsIgnoreCase("Y")) {
            var item = new FoodItem();
            out.println(" ");
            out.println("Price R:"+ item.getPrice());
            out.println("Quantity : "+ item.getQuantity());
            out.println("Total : R"+ item.getTotalPrice());
            out.println(" ");

            foodItems.add(item);

            System.out.print("Do you want to add another item? (Y/N): ");
            makeItem = input.next();

        }

        double subTotal = 0;
        for (FoodItem item: foodItems)
            subTotal += item.getTotalPrice();
        out.println("Subtotal: R" + subTotal);
    }
}



