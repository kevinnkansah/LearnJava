class Superclass {
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
}

public class Main {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.display();
        

        
    }
}
