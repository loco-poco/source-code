public class Stack {
   static class Node {
      int data;
      Node next;
      public Node(int data) {
         this.data = data;
      }
   }
   Node head = null;
   public void push(int data) {
      Node temp = new Node(data);
      temp.next = head;
      head = temp;
   }
   public int pop()  {
      int x = head.data;
      head = head.next;
      return x;
   }
   public void print() {
      Node flag = head ;
      while(flag!=null) {
         System.out.println(flag.data);
         flag = flag.next;
      }
   }
}
