import java.util.*;

public class Linked_Hashmap_Test {

    public static void main(String args[])
    {
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();

        lhm.put(1,"A");
        lhm.put(2,"B");
        HashMap<Integer,String> ls= new HashMap<>();
        ls.put(4,"D");
        ls.put(5,"E");
        ls.put(6,"F");

        lhm.putAll(ls);

        System.out.println(lhm);
        System.out.println(lhm.values().isEmpty());
        lhm.clear();
        System.out.println(lhm.values().isEmpty());
        System.out.println(lhm.size());

    }
}
