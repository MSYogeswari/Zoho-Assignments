import java.util.ArrayList;
import java.util.*;
public class Test_Stack {
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Stack" + st);

        List<Integer> ls = new ArrayList<Integer>();
        ls.add(6);
        ls.add(7);
        ls.add(8);
        ls.add(9);
        ls.add(10);
        st.addAll(2,ls);
        System.out.println("Stack after adding using addall method at specific index" + st);
        st.pop();
        System.out.println("After pop():  "+ st);
        System.out.println("Searching 10. Found at:(Returns its distance from last) " + st.search(10));
        st.pop();
        st.pop();
        System.out.println("Element at peek position is returned: "+ st.peek());
        //st.clear();
        Iterator<Integer> it = st.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
