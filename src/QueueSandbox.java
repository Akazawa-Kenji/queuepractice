import java.util.*;

public class QueueSandbox {
    public static void main (String[] args) {

        PriorityQueue<String> q1 = new PriorityQueue<String>();
        // our q1 queue is a PriorityQueue where what ever is passed in first is the highest priority.
        // use the offer method to add elements to our queue
        q1.offer("First");
        q1.offer("Second");
        q1.offer("Third");

        System.out.printf("%s", q1);
        System.out.println();
        //printf allows us to print a entire queue.

        System.out.printf("%s", q1.peek());
        System.out.println();


    }
}
