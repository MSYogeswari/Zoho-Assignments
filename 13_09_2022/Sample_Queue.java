import java.util.*;

public class Sample {
        public static void main(String[] args)
        {
            Queue<Integer> qu = new LinkedList<>();
            qu.add(1);
            qu.add(2);
            qu.add(3);
            System.out.println(qu);
            qu.offer(4);
            System.out.println("Offer (Added 4 at last)" + qu);
            //qu.poll();
            System.out.println("Poll (FIFO concept)" + qu.poll());
            System.out.println("Element() retrives first element but not remove" + qu.element());
            System.out.println("Remove" + qu.remove());
            System.out.println("Peek" + qu.peek());
            System.out.print(""+ qu.remove());
        }
    }
