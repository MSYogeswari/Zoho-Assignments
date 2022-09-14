import java.util.*;
public class Map {
    public static void main(String args[])
    {
        HashMap<Integer,String> m = new HashMap<>();
        m.put(0,"AAA");
        m.put(1,"BBB");
        m.put(2,"CCC");
        m.put(3,"DDD");
        System.out.println(m);

        System.out.println("Getting value: " + m.get(2));
        System.out.println("Contains key" + m.containsKey(2));
        System.out.println("Contains value" + m.containsValue("EEE"));

        System.out.println(m.getOrDefault(6,"AAA"));
        System.out.println(m.remove(1));
        System.out.println("After removing key 1:" + m);


        System.out.println("put if absent" + m.putIfAbsent(2,"XXC"));
        System.out.println("put if absent" + m.putIfAbsent(5,"XXC"));
        System.out.println(m);






    }
}
