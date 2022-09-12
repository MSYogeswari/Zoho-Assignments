import java.util.*;
public class Test {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<String>();
        vec.add("A");
        vec.add("B");
        vec.add("C");
        vec.add("D");
        vec.add("E");
        vec.add("F");
        System.out.println("Vector after adding:" + vec);
        vec.add(1, "X");
        System.out.println("After adding X at position 1: " + vec);
        vec.set(1, "Z");
        System.out.println("After replacing Z at position 1: " + vec);

        List<String> ls = new ArrayList<String>();
        ls.add("M");
        ls.add("N");
        ls.add("O");
        vec.addAll(ls);
        System.out.println("After adding collections: " + vec);

        vec.addElement(new String("ABCD"));
        System.out.println("After adding AddElement: " + vec);


        vec.remove(2);
        System.out.println("After removing element at position 2: " + vec);
System.out.println("Old size" + vec.size());
        vec.setSize(50);
        System.out.println("new size" + vec.size());
        System.out.println("After setting size" + vec);
        vec.setSize(10);

        System.out.println("Element at position 5: "+ vec.get(5));
        System.out.println("Elements printing using iterator");
        Iterator it = vec.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
