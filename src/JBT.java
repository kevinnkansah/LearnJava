public class JBT {

    JBT(String str, int integer) {
        System.out.println("Inside Constructor with String parameter as " + str 
        + " integer parameter as " + integer);
    }

    JBT() {
        this("HELLO", 100);
        System.out.println("Inside Constructor without parameter");
    }


    public static void main(String[] args) {
        JBT obj = new JBT("Gabe", 90);
        obj.toString();
    }



}
