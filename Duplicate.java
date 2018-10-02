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
    
       node remove_duplicates(node head) { 
        node ptr1 = null, ptr2 = null, dup = null; 
        ptr1 = head; 
  
        /* Pick elements one by one */
        while (ptr1 != null && ptr1.next != null) { 
            ptr2 = ptr1; 
  
            /* Compare the picked element with rest 
                of the elements */
            while (ptr2.next != null) { 
  
                /* If duplicate then delete it */
                if (ptr1.data == ptr2.next.data) { 
  
                    /* sequence of steps is important here */
                    dup = ptr2.next; 
                    ptr2.next = ptr2.next.next; 
                    System.gc(); 
                } else /* This is tricky */ { 
                    ptr2 = ptr2.next; 
                } 
            } 
            ptr1 = ptr1.next; 
        }
        return head; 
    }     void dis(node head)
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
class Duplicate
{
    public static void main(String args[] ) throws Exception 
    {
       node head = null;
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
       head = obj.remove_duplicates(head);
       obj.dis(head);

    }
}
