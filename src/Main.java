/*class Superclass {
    int x = 10;

    void display() {
        System.out.println("Inside Superclass");
    }
}

class Subclass extends Superclass {
    int x = 20;

    void display() {
        System.out.println("Inside Subclass");
        System.out.println("Subclass x: " + x);
        System.out.println("Superclass x: " + super.x);
        super.display();
    }
}*/

public class Main {
    public static void main(String[] args) {
        var randomAnimal = new Animal("yellow", 4);
        var husky = new Dog("brown", 4);

        System.out.println(husky.toString());
        System.out.println(randomAnimal.toString());

        System.out.println(husky.makeSound());
        System.out.println(randomAnimal.makeSound());
    }
}
