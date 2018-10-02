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
 
    boolean isPalindrome(node head) {
 
    if(head == null || head.next==null)
        return true;
 
    //find list center
    node fast = head;
    node slow = head;
 
    while(fast.next!=null && fast.next.next!=null){
        fast = fast.next.next;
        slow = slow.next;
    }
 
    node secondHead = slow.next;
    slow.next = null;
 
    //reverse second part of the list
    node p1 = secondHead;
    node p2 = p1.next;
 
    while(p1!=null && p2!=null){
        node temp = p2.next;
        p2.next = p1;
        p1 = p2;
        p2 = temp;
    }
 
    secondHead.next = null;
 
    //compare two sublists now
    node p = (p2==null?p1:p2);
    node q = head;
    while(p!=null){
        if(p.data != q.data)
            return false;
 
        p = p.next;
        q = q.next;
 
    }
 
    return true;
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
class Main
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
       if(obj.isPalindrome(head))
       {
         System.out.println("Palindrome");
       }
       else
       {
         System.out.println("Not Palindrome");
       }

    }
}
