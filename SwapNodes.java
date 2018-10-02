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
    void swapNodes(int x, int y, node head) 
    { 
        if (x == y) return; 
  
        node prevX = null, currX = head; 
        while (currX != null && currX.data != x) 
        { 
            prevX = currX; 
            currX = currX.next; 
        } 
  
        node prevY = null, currY = head; 
        while (currY != null && currY.data != y) 
        { 
            prevY = currY; 
            currY = currY.next; 
        } 
  
        if (currX == null || currY == null) 
            return; 
  
        if (prevX != null) 
            prevX.next = currY; 
        else  
            head = currY; 
  
        if (prevY != null) 
            prevY.next = currX; 
        else  
            head = currX; 
  
        node temp = currX.next; 
        currX.next = currY.next; 
        currY.next = temp; 
    } 
    void dis(node head)
    {
        node t = head;
        while(t!=null)
        {
            System.out.print(t.data+"->");
            t=t.next;
        }
    }
    
}
class SwapNodes
{
    public static void main(String args[] ) throws Exception 
    {
       node head = null;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Size : ");
       int n = sc.nextInt();
       Linkedlist obj = new Linkedlist();
       for(int i=0;i<n;i++)
       {
           System.out.println("enter element : ");
           head = obj.insertAtEnd(head);
       }
       System.out.println("Linkedlist before swap ");
       obj.dis(head);
       System.out.println("\nEnter nodes to swap : ");
       int x = sc.nextInt();
       int y = sc.nextInt();
       obj.swapNodes(x,y,head);
       System.out.println("Linkedlist after swap ");
       obj.dis(head);
    }
}

