
import java.util.Scanner;

interface StackInterface{
    void Push();
    void Pop();
    void Peek();
    void Display();
}

interface QueueInterface{
    void Enqueue();
    void Dequeue();
    void Display();
}

class StackQueue implements StackInterface{

    Scanner sc = new Scanner(System.in);
    int n,i;
    int arr[];
    int  top=-1;
    
    public void Setsize()
    {
      int i=0;
      System.out.println("Enter the size of stack or queue: ");
      n=sc.nextInt();
      arr=new int [n];
       System.out.println("Enter the number of elements you want to add in the stack:");
       int no=sc.nextInt();
       System.out.println("Enter the elements in stack:");
       for(i=0;i<no;i++)
       {
          this.arr[i]=sc.nextInt();
          top++;
       }
    }
      
      public void Push()
    {
      int num=0;
      if(top==n-1)
      {
        System.out.println("Stack Overflow");
      }
       else
      {
       System.out.println("Enter the number you want to insert:");
       num=sc.nextInt();
       top++;
       arr[top]=num;
      }
    }
  
     public void display()
    {
       System.out.println("The stack is:");
       for(i=0;i<=top;i++)
       {
          System.out.println(""+arr[i]);
       }
    }

     public void Pop()
    {
       int temp=0;
        if(top==-1)
        {
          System.out.println("Stack Underflow");
        }
        else
        {
          temp=arr[top];
          arr[top]=0;
          top--;
        }
        System.out.println("The deleted element is:" + temp);
    }

    public void Peek()
    {
        int element=0;
        int i=0,index=0;
        System.out.println("Enter the element in the array you want:");
        element=sc.nextInt();
        for(i=0;i<top;i++)
         {
            if(this.arr[i]==element)
           {
              index=i;
              break;
           }
         }
         System.out.println("The element is at the index  "+ index);
    }

  
}

class StackQueueTest
{
  public static void main(String [] args)
  {
     Scanner sc = new Scanner(System.in);
     
      StackQueue s=new StackQueue();
      s.Setsize();
      s.Push();
      s.display();
      s.Pop();
      s.Peek();

     
  }   

}


