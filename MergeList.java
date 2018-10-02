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
    
node mergeTwoLists(node l1, node l2) {
    node head = new node(0);
    node p = head;
 
    while(l1!=null||l2!=null){
        if(l1!=null&&l2!=null){
            if(l1.data < l2.data){
                p.next = l1;
                l1=l1.next;
            }else{
                p.next=l2;
                l2=l2.next;
            }
            p = p.next;
        }else if(l1==null){
            p.next = l2;
            break;
        }else if(l2==null){
            p.next = l1;
            break;
        }
    }
 
    return head.next;
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
class MergeList
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
       System.out.println("Enter Size of 2nd list : ");
       int n1 = sc.nextInt();
       for(int i=0;i<n1;i++)
       {
         System.out.println("enter element : ");
         head1 = obj.insertAtEnd(head1);
       }
       obj.dis(head1);
       h = obj.mergeTwoLists(head, head1);
       System.out.println("List after merge : ");
       obj.dis(h);

    }
}
