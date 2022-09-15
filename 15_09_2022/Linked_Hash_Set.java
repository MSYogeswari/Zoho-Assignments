import java.util.*;
public class LinkedHashSetTest {
    public static void main(String args[])
    {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(40);
        System.out.println(lhs);

        Iterator it = lhs.iterator();
        while(it.hasNext()){
            System.out.println(it.hashCode());
            it.next();
        }
        System.out.println(lhs.getClass());
        System.out.println("remove 30: " +lhs.remove(30));
        System.out.println(lhs);
    }
}
