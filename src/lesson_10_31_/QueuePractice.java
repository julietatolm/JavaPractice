package lesson_10_31_;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityBlockingQueue<>();
        queue.add(1);
        queue.add(3);
        queue.add(5);

        System.out.println(queue.peek());
        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.isEmpty());
        System.out.println(queue.contains("3"));
    }
}
