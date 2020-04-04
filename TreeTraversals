  public class Trees
  {
    public static void main(String[] args)
    {
      Node root = new Node(10);
      // a tree is created with only one node which is 10
      // now we need to add child
      root.insertLeft(5);
      root.insertRight(15);
      
      root.left.insertLeft(20);
      root.left.insertRight(40);
      
      root.right.insertLeft(90);
      root.right.insertRight(100);
      
      System.out.println("Inorder traversal for current tree is");
      root.printInorder();
      System.out.println("\nPreorder traversal for current tree is");
      root.printPreorder();
      System.out.println("\nPosrorder traversal for current tree is");
      root.printPostorder();
    }
  }


  class Node {
      int value;
      Node left;
      Node right;
      
      Node(int value){
          this.value = value;
          this.left = null;
          this.right = null;
      }
      
      void insertLeft(int value){
          Node n = new Node(value);
          this.left = n;
      }
      
      void insertRight(int value){
          Node n = new Node(value);
          this.right = n;
      }
      
      void printInorder(){
          if(!(this.left==null)){
            this.left.printInorder();
          }
          System.out.print(this.value+", ");
          if(!(this.right==null)){
            this.right.printInorder();
          }
      }
      
      void printPreorder(){
          System.out.print(this.value+", ");
          if(!(this.left==null)){
            this.left.printPreorder();
          }
          if(!(this.right==null)){
            this.right.printPreorder();
          }
      }
      
      void printPostorder(){
          if(!(this.left==null)){
            this.left.printPostorder();
          }
          if(!(this.right==null)){
            this.right.printPostorder();
          }
          System.out.print(this.value+", ");
      }
      
  }
