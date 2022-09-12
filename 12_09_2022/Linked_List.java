import java.util.*;

public class Test_Linked_List {
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.add("1");
        list.add("ABC");
        list.add("2");
        list.add(true);
        list.add(12.48);

        System.out.println("Linked list:" + list);

        List<Integer> ls = new ArrayList<Integer>();
        ls.add(1);
        ls.add(2);
        ls.addAll(list);
        System.out.println(ls);

        for(int i=0;i<ls.size();i++)
        {
            System.out.println(ls.get(i));
        }
        System.out.println(ls.subList(2,5));
        System.out.println(ls.contains("ABC"));
        System.out.println(ls.size());
        System.out.println(ls.containsAll(list));
        System.out.println(ls.hashCode() + " : " + list.hashCode());
        Iterator it = ls.listIterator(3);
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
