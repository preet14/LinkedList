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
  
    node sortEvenOdd(node head) 
    { 
        node end = head; 
        node prev = null; 
        node curr = head; 
  
        /* Get pointer to last Node */
        while (end.next != null) 
            end = end.next; 
  
        node new_end = end; 
  
        // Consider all odd nodes before getting first eve node 
        while (curr.data %2 !=0 && curr != end) 
        { 
            new_end.next = curr; 
            curr = curr.next; 
            new_end.next.next = null; 
            new_end = new_end.next; 
        } 
  
        // do following steps only if there is an even node 
        if (curr.data %2 ==0) 
        { 
            head = curr; 
  
            // now curr points to first even node 
            while (curr != end) 
            { 
                if (curr.data % 2 == 0) 
                { 
                    prev = curr; 
                    curr = curr.next; 
                } 
                else
                { 
                    /* Break the link between prev and curr*/
                    prev.next = curr.next; 
  
                    /* Make next of curr as null */
                    curr.next = null; 
  
                    /*Move curr to end */
                    new_end.next = curr; 
  
                    /*Make curr as new end of list */
                    new_end = curr; 
  
                    /*Update curr pointer */
                    curr = prev.next; 
                } 
            } 
        } 
  
        /* We have to set prev before executing rest of this code */
        else prev = curr; 
  
        if (new_end != end && end.data %2 != 0) 
        { 
            prev.next = end.next; 
            end.next = null; 
            new_end.next = end; 
        }
        head = reverse(head);
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
class OddEven
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
       head = obj.sortEvenOdd(head);
       obj.dis(head);
    }
}
