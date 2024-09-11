package LEC38;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Collection_framework_queue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayDeque<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.remove();
        System.out.println(q1);

        Deque<Integer> q2 = new ArrayDeque<>();
        q2.addFirst(10);
        q2.addLast(20);
        q2.addLast(30);
        q2.add(50);
        q2.removeFirst();
        q2.removeLast();
        System.out.println(q2);

        Queue<Integer> q3 = new PriorityQueue<>();
        q3.add(30);
        q3.add(20);
        q3.add(10);
        q3.add(60);
        q3.add(90);
        System.out.println(q3);

        while (q3.size() > 0){
            System.out.println(q3.remove() + " ");
        }
    }
}