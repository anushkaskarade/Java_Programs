
public class QueueClass {

    static class Queue{

        static int arr[];
        static int size;
        static int rear=-1;
        

        public Queue(int n)
        {
            arr=new int[n];
            this.size=n;
            
        }

        public static void Enqueue(int data)
        {
            if(rear==size-1)
            {
                System.out.println("Full Queue!");
                return ;
            }

            rear=rear+1;
            arr[rear]=data;
        }

        public static int  Dequeue()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty!");
                return -1;
            }

            int front=arr[0];
            for(int i=0; i<rear; i++)
            {
               arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        public static int  peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty!");
                return -1;
            }

            int front=arr[0];
            return front;

        }

        public static boolean isEmpty()
        {
            return rear==-1;
        }
    }

    

    public static void main(String[] args) {
        
        Queue q=new Queue(5);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.Dequeue();

        }


    }
}
