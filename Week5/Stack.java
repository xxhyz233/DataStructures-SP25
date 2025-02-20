import java.util.LinkedList;
import java.util.Queue;


public class Stack {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Quere after enqueue: " + queue);

        int frontElement = queue.poll();
        System.out.println("Dequeued Element: " + frontElement);
        System.out.println("Quere after dequeue: " + queue);
    }
}
