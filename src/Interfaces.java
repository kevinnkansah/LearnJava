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
    int amountToConsume;

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


    public int getAmountToConsume() {
        return amountToConsume;
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

    public void setAmountToConsume(int amountToConsume) {
        this.amountToConsume = amountToConsume;
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

    public void open() {
        isClosed = false;
    }
    public void consume( int amountDrank) { //inputted amount drank is not overwriting itself
        if (!getClosed()) {
            amountToConsume -=  amountDrank;
        }
        else {
            System.out.println("You must open the bottle to consume.");
        }
    }
    public String toString() {
        return "Bottle color is " + getColor()
         + " capacity of the bottle is " + getCapacity() 
         + " and the amount of water you've drank is " + getAmountDrank();
    }

    @Override
    public void fillUp() {
        amountToConsume = this.capacity;
        isFilled = true;
    }

    @Override
    public void empty() {
        this.amountToConsume = 0;
    }
}
public class Interfaces {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        WaterBottle bottle = new WaterBottle("pink", 1000);

        System.out.println(bottle);
        bottle.fillUp();
        bottle.open();
        bottle.consume(100);
        bottle.empty();
        System.out.println(bottle);
    }
}
