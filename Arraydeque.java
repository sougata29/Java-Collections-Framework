
import java.util.ArrayDeque;
public class Arraydeque {
    public static void main(String[] args){
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(23);
        adq.offer(12);
        adq.offerFirst(45);
        adq.offer(2);
        System.out.println(adq);
        System.out.println(adq.poll());
        System.out.println(adq.pollLast());
        System.out.println(adq.peek());
        System.out.println(adq.peekLast());

    }
}
