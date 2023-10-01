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

    public static void main(String[] args) {
        var item1 = new FoodItem();
        out.println(item1.getPrice());
        out.println(item1.getQuantity());
        out.println(item1.getTotalPrice());
    }
}