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
        Animal animal = new Animal("yellow", 4);
        Dog dog = new Dog("brown", 4, "husky");
        Husky docky = new Husky("white", 4, "siberian");

        System.out.println(animal.toString());
        System.out.println(dog.toString());


        System.out.println(" ");

        System.out.println(animal.makeSound());
        System.out.println(dog.makeSound());

    }
}
