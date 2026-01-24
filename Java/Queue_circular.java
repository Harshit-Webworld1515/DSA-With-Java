public class Queue_circular {

         class Queue{
        static int arr[];
         int size;
        static int rear;
        static int front;
        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        public static boolean isEmpty(){
            return rear==-1&&front==-1;
        }
        public  boolean isFull(){
            return (rear+1)%size==front;
        }
        public void add(int data){
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            // for first element going to add 
            if (front==-1) {
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public  int remove(){
            if (isEmpty()) {
                System.out.println("queue is Empty");
                return -1;
            }
            int result=arr[front];
            if (rear==front) {//only last element delete
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }
        public static int peek(){
           if (isEmpty()) {
                System.out.println("queue is Empty");
                return -1;
            }
          return arr[front]   ;
        }
    }
    public static void main(String[] args) {
    Queue_circular qe=new Queue_circular();
        Queue q=qe.new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

}//samjh gya bhai crystal clear