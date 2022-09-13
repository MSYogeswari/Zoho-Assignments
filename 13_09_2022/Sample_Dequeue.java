import java.util.Deque;
import java.util.*;

public class Sample_Dequeue {
    public static void main(String args[])
    {
        Deque<String> deq = new LinkedList<String>();
        deq.add("AAA");
        deq.add("BBB");
        deq.add("CCC");
        deq.add("DDD");

System.out.println("peek first" + deq.peekFirst());
System.out.println("peek last" + deq.peekLast());
System.out.println("Get first (same as peekFirst, but throws exception if not found)" +deq.getFirst());
System.out.println("Get first(same as peekLast, but throws exception if not found)" +deq.getLast());

System.out.println(deq.offer("EEE"));
System.out.println(deq.offerFirst("FFF")); //insert at first
System.out.println(deq.offerLast("GGG")); // insert at last
System.out.println(deq);

    }
}
