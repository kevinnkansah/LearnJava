public class JBT {

    JBT(String str) {
        System.out.println("Inside Constructor with String parameter as " + str);
    }

    JBT() {
        this("HELLO");
        System.out.println("Inside Constructor without parameter");
    }


    public static void main(String[] args) {
        JBT obj = new JBT();
        
        
    }
}
