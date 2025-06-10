
public class LinkedList {

    Node head;
    
    class Node{

        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    //addFirst
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
            
        }
        newNode.next=head;
        head=newNode;

    }

    //addLast
    public  void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }

        Node CurrentNode=head;

        while(CurrentNode.next!=null)
        {
            CurrentNode=CurrentNode.next;
        }
        CurrentNode.next=newNode;


    }

    //deleteFirst
    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("The list is empty!");
        }
        head=head.next;
    }

    //deleteLast
    public void deletLast()
    {
        if(head==null)
        {
            System.out.println("The list is empty!");
        }

        if(head.next==null)
        {
            head=null;
            return;
        }

        Node SecondLast=head;
        while(SecondLast.next.next!=null)
        {
           SecondLast=SecondLast.next;
        }
        int DeletedData=0;
        DeletedData=SecondLast.next.data;
        SecondLast.next=null;
        System.out.println("DEleted value is:"+DeletedData);

        
    }

    public void PrintList()
    {
        if(head==null)
        {
            System.out.println("List is Empty!");
            return;
        }
        Node CurrentNode=head;

        while(CurrentNode!=null)
        {
            System.out.println(CurrentNode.data+"->");
            CurrentNode=CurrentNode.next;
        }
    }

    public static void main(String[] args) {
        
        LinkedList list=new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addLast(40);
        list.addLast(50);
        list.PrintList(); 
        System.out.println();
        list.deleteFirst();
        list.PrintList();
        System.out.println();
        list.deletLast();
        list.PrintList();
        



    }
    


}

/* 
public class LinkedList{

    Node head;

    class Node{

        
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data)
    {
        Node newNode =new Node(data);

        if(head==null)
        {
            head=newNode;
            return;
        }

        Node currentNode=head;

        while(currentNode.next!=null)
        {
            currentNode=currentNode.next;

        }
        currentNode.next=newNode;

    }

    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("The List is empty!");
            return;
        }
        int DeletedData=head.data;
        head=head.next;
        System.err.println("The deleted data is:"+DeletedData);
    }

    public void deleteLast()
    {
        if(head==null)
        {
            System.out.println("The List is empty!");
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }

        Node secondLast=head;
        while(secondLast.next.next!=null)
        {
            secondLast=secondLast.next;

        }
        int DeletedData=secondLast.next.data;
        secondLast.next=null;
        System.out.println("the deleted data is:"+DeletedData);

    }

    public void print()
    {
        if(head==null)
        {
            System.out.println("The list is empty!");
        }
        Node currentNode=head;

        while(currentNode!=null)
        {
            System.out.print(currentNode.data+"->");
            currentNode=currentNode.next;
        }
    }

    public static void main(String[] args) {
        
        LinkedList list=new LinkedList();
        
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addLast(50);
        list.print();
        System.out.println();
        list.deleteFirst();
        list.deleteLast();
        list.print();
        
    }
}    
*/
