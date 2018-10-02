import java.util.*;
class node
{
    int data;
    node next;
    node(int d)
    {
        data=d;
    }
}
class Linkedlist 
{
    Scanner sc = new Scanner(System.in);
    node insertAtEnd(node head)
    {
        node new1 = new node(sc.nextInt());
        new1.next = null;
        node t = head;
        if(head == null)
        {
            head=new1;
        }
        else
        {
            while(t.next != null)
            {
                t=t.next;
            }
            t.next=new1;
        }
        
        return head;
    }
 
    node reverse(node head)
    {
        node current = head;
        node prev = null;
        node next;
        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
    
    void dis(node head)
    {
        node t = head;
        while(t!=null)
        {
            System.out.print(t.data+"->");
            t=t.next;
        }
        System.out.println();
    }
    
}
class Reverse
{
    public static void main(String args[] ) throws Exception 
    {
       node head = null;
       node head1=null;
       node h = null;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Size of 1st list : ");
       int n = sc.nextInt();
       Linkedlist obj = new Linkedlist();
       for(int i=0;i<n;i++)
       {
           System.out.println("enter element : ");
           head = obj.insertAtEnd(head);
       }
       obj.dis(head);
       head = obj.reverse(head);
       obj.dis(head);

    }
}
