interface WatterBottleInterface {
    String  color = "Blue";
    void fillUp();
    void empty();

}

class WaterBottle implements WatterBottleInterface{
    String color;
    int capacity;
    int amountToFill;
    int amountToDrink;
    boolean isFilled = false;

    WaterBottle(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getAmountToFill() {
        return amountToFill;
    }

    public int getAmountToDrink() {
        return amountToDrink;
    }

    public void setAmountToDrink(int amountToDrink) {
        this.amountToDrink = amountToDrink;
    }

    public void setAmountToFill(int amountToFill) {
        this.amountToFill = amountToFill;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void fillUp() {
        capacity = this.capacity;
    }

    @Override
    public void empty() {
        capacity = 0;



    }
}



public class Interfaces {
    public static void main(String[] args) {
        WaterBottle bottle = new WaterBottle("pink", 1000);

        System.out.println(bottle);
    }
}
