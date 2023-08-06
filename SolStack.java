public class SolStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.print();
        s.pop();
        s.print();
        s.peek();
        s.isEmpty();
        s.size();
        s.reverse();
        s.print();
        s.remove();
        s.print();
     
    }
    
}
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class Stack{
    Node top;
    void push(int data)
    {
        if(top == null)
        {
            top = new Node(data);
        }
        else
        {
            Node temp = new Node(data);
            temp.next = top;
            top = temp;
        }
    }
    void pop()
    {
        if(top == null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            top = top.next;
        }
    }
    void print()
    {
        Node temp = top;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    void peek()
    {
        if(top == null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println(top.data);
        }
    }
    void isEmpty()
    {
        if(top == null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Stack is not empty");
        }
    }
    void size()
    {
        Node temp = top;
        int count = 0;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        System.out.println(count);
    }
    void reverse()
    {
        Node prev = null;
        Node curr = top;
        Node next = null;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        top = prev;
    }
    void remove()
    {
        Node temp = top;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next = null;
    }

}
