public class Node {
    int data;
    Node next;
}
public class LinkedListTest {
    Node head;
    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null)
        {
            head = node;
        }
        else
        {
            Node n = head;
            while(n.next != null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show()
    {
        Node node = head;
        while(node.next != null)
        {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
    public void insertatstart(int data)
    {
        Node n = new Node();
        n.data = data;
        n.next = head;
        head = n;
    }
    public void insertatposition(int position, int data) {
        Node n = new Node();
        n.data = data;
        n.next = null;
        if(position == 0)
        {
            insertatstart(data);
        }
        else {
            Node temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
        }
    }
    public void deleteatposition(int position)
    {
        if(position ==0)
            head = head.next;
        else {
            Node temp = null;
            Node n= head;
            for(int i=0;i<position-1;i++)
            {
                n = n.next;
            }
            temp = n.next;
            n.next = temp.next;
            temp = null;
        }
        }
        public void search(int data)
        {
            Node n = head;
            int pos = 0 ,out =0;
            while(n.next != null)
            {
                if(n.data == data)
                {

                    out = pos;
                }
                else {
                    pos++;
                    n = n.next;
                }
            }
            if(n.next == null && n.data == data)
            {
                out = pos;
            }
            System.out.println(data + " element is found at: " + out);
        }
    }
public class Runner {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        LinkedListTest llt = new LinkedListTest();
        llt.insert(5);
        llt.insert(10);
        llt.insert(15);
        llt.insertatstart(4);
        llt.insertatstart(3);

        llt.insertatposition(3,12);
        llt.insertatposition(1,2);
        llt.insertatposition(0,78);
        //llt.show();
        System.out.println("After deleting: ");
        llt.deleteatposition(3);
        llt.search(10);
        //llt.show();
    }
}
