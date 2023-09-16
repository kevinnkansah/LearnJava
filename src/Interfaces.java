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
    boolean isClosed = true;

    WaterBottle(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
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
    public boolean getFilled() {
        return isFilled;
    }
    public boolean getClosed() {
        return isClosed;
    }

    public void setColor(String color) {
        this.color = color;
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

    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }
    public void setCLosed(boolean isClosed) {
        this.isClosed = isClosed;
    }

    public String toString() {
        return "Bottle color is " + getColor()
         + " capacity of the bottle is " + getCapacity() 
         + " and bottle is filled " + getFilled();
    }

    @Override
    public void fillUp() {
        amountToDrink = this.capacity;
    }

    @Override
    public void empty() {
        this.capacity = 0;
    }
}

public class Interfaces {
    public static void main(String[] args) {
        WaterBottle bottle = new WaterBottle("pink", 1000);

        System.out.println(bottle);
<<<<<<< HEAD
        bottle.fillUp();
        System.out.println(bottle.getAmountToDrink());
        bottle.empty();
        System.out.println(bottle.getAmountToDrink());
=======
        
>>>>>>> 98f4f71f1eb7b14c31e7443395a46d63d0d3dd36
    }
}
