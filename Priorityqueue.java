import java.util.Queue;
import java.util.PriorityQueue;
public class Priorityqueue {
    public static void main(String[] args){
    Queue<Integer> pq = new PriorityQueue<>();
    pq.offer(23);
    pq.offer(12);
    pq.offer(2);
    pq.offer(34);
    System.out.println(pq);
    System.out.println(pq.poll());
    System.out.println(pq.peek());
    System.out.println(pq);
}
}