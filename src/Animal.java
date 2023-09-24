class Animal {
    private String colour;
    private int legs = 4;

    Animal(String colour, int legs) {
        this.colour = colour;
        this.legs = legs;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
    public String toString() {
        return getClass() + ": " +  " colour is " + getColour() + " number of legs is " + getLegs();
    }
    public String sleep() {
        return "Sleeping...";
    }

    public String eat() {
        return "Eating...";
    }
    public String makeSound() {
        return "Making a sound";
    }
}
class Dog extends Animal {
    Dog(String colour, int legs) {
        super(colour, legs);
    }
    @Override
    public String makeSound() {
        return "Barking";
    }
}