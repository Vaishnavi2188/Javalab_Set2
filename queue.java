import java.util.Scanner;

public class queue {

  Scanner s=new Scanner(System.in);
  int n,front=-1,rear=-1,num;
    int arr[]=new int[10];
      queue()
        {
           System.out.println("Just a  constructor");
        }
        queue(int n)
        {
           int op;
           do
           {
              System.out.println("\n\t\t__MENU__\n\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit\n"); 
              System.out.println("Enter the operation to be performed:\n");
              op=s.nextInt();
              switch(op)
              {
                case 1:
                   enqueue(n);
                   break;
                case 2:
                   dequeue(n);
                   break;
                case 3:
                   display(rear);
                   break;
                   default:
                   break;
                while(op<4);
                  }
  public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
            int n;
                System.out.println("Enter the size:");
                    n=sc.nextInt();
    new queue(n);
        sc.close();

  }
    public void enqueue(int n)
      {
          if(rear>=n-1)
              {
                 System.out.println("\nOVERFLOW OCCURED\n");
              }
          else
              {
                 if(front==-1 && rear==-1)
                 {
                      front++;
                 }
                 System.out.println("\nEnter the element to be inserted :  ");
                 num=s.nextInt();
                 rear++;
                 arr[rear]=num;
              }
       }
       public void dequeue(int n)
       {
          if(front==-1)
          {
            System.out.println("\nUNDERFLOW OCCURED\n");
          }
          else
          {
               num=arr[front];
               System.out.println("The deleted element is :"+num+"\n") ;
               if(front==rear)
               {
                 front=rear=-1;
                 System.out.println("\nQueue is empty\n");     
               }        
               else
               {
                  front++;
               } 
           }
        }                                                                                                                                                                                         public void display(int rear)
                                                                                                                                                                                                        {
                                                                                                                                                                                                            int i;
                                                                                                                                                                                                                System.out.println("\nThe Current Queue is:");
                                                                                                                                                                                                                    for(i=front;i<=rear;i++);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           {
      System.out.println(arr[i]);
}
}
}
