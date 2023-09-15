public class TUT_2_4384756 {
    public static void main(String[] args) {
        int u = 2;
        int v = 3;
        int w = 5;
        int x = 7; 
        int y = 11;

        int calc1 = u + v * w + x;
        int calc2 = u + y % v * w + x;
        int calc3 = u++ / v + u++ * w;

        System.out.println("u + v * w + x  equates to " + calc1);
        System.out.println("u + y % v * w + x  equates to " + calc2);
        System.out.println("u++ / v + u++ * w equates to " + calc3);
    
    }
}