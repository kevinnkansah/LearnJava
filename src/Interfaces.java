import java.util.Scanner;



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

    int amountDrank;
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


    public int getAmountToDrink() {
        return amountToDrink;
    }

    public int getAmountDrank() {
        return amountDrank;
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


    public void setAmountDrank(int amountDrank) {
        this.amountDrank = amountDrank;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }
    public void setClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }

    
    public void drink( int amountDrank) {
        amountToDrink -=  amountDrank;
    }
    public String toString() {
        return "Bottle color is " + getColor()
         + " capacity of the bottle is " + getCapacity() 
         + " and the amount of water you've drank is " + getAmountDrank();
    }

    @Override
    public void fillUp() {
        amountToDrink = this.capacity;
    }

    @Override
    public void empty() {
        this.amountToDrink = 0;
    }
}
public class Interfaces {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        WaterBottle bottle = new WaterBottle("pink", 1000);

        System.out.println(bottle);
        bottle.fillUp();
        bottle.drink(100);
        bottle.empty();
        System.out.println(bottle);
        System.out.println(bottle.getAmountToDrink());
        System.out.println(bottle);
    }
}
