package LEC38;

import java.util.LinkedList;
import java.util.Queue;

public class Duplicate_queue_elements {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println("Original Queue: " + queue);
        duplicateQueueElements(queue);
        System.out.println("Queue after duplicating elements: " + queue);
    }
    public static void duplicateQueueElements(Queue<Integer> queue) {
        int size = queue.size();

        for (int i = 0; i < size; i++) {
            int element = queue.poll();
            queue.add(element);
            queue.add(element);
        }
    }
}