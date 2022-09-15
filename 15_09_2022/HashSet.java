import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> hm = new HashSet<>();
        hm.add(1);
        hm.add(2);
        hm.add(3);
        hm.add(4);
        hm.add(5);
        System.out.println(hm.hashCode());
        System.out.println(hm);
        hm.add(6);
        System.out.println("Add: " + hm);
        //System.out.println(hm.toArray());
          Iterator<Integer> it = hm.iterator();
          while(it.hasNext()) {
              System.out.println(it.next().hashCode());
          }
          hm.remove(3);
        System.out.println(hm);
        hm.clear();
        System.out.println(hm);

    }
}
