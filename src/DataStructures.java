import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class DataStructures {
    public static void main(String[] args) {

        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.offer(1);
        numbers.offer(5);
        numbers.offer(4);
        numbers.offer(78);
        numbers.offer(95);
        numbers.offer(-5);
        numbers.offer(100);
        System.out.println(numbers);

        System.out.println(numbers.getClass());
    }
}