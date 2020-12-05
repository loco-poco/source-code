class Queue {
   class Node {
      int data;
      Node next;
      public Node(int x) {
         this.data = data;
      }
   }
   Node front = null;
   Node rear  = null;
   public void enqueue(int data) {
      if(front==null) {
         front = new Node(data);
         rear = front;
      }  
      else {
         rear.next = new Node(data);
         rear = rear.next;
      }
   }
   public int dequeue() {
      int x = front.data;
      front = front.next;
      return x;
   }
   public void print() {
      Node flag = front;
      while(flag!=null) {
         System.out.println(flag.data);
         flag = flag.next;
      }
   }
}
