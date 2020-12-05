class BST {
   static class Node {
      Node left;
      Node right;
      int x;
      public Node(int x) {
         this.x = x;
      }
   }
   Node head;
   public void ins(int x) {
      head = insert(head,x);
   }
   private Node insert(Node root, int x) {
      if(root==null) 
         return new Node(x);
      if(x>root.x) 
         root.right = insert(root.right,x);
      if(x<root.x) 
         root.left = insert(root.left,x);
      return root; 
   }
   public static void main(String[] args) {
      BST obj = new BST();
      for(int i=0;i<10;++i) 
         obj.head = obj.ins(i);
   }
}
