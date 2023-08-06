class Node 
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class LinkedList
{
    Node head;
    Node tail;
    void add(int data)
    {
        if(head == null)
        {
            head = new Node(data);
            tail = head;
        }
        else
        {
            tail.next = new Node(data);
            tail = tail.next;
        }

    }
    void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    void reverse()
    {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }
    void remove()
    {
        Node temp = head;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next = null;
    }
}
public class SolLinkedList
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();
        list.reverse();
        list.print();
    }
}
