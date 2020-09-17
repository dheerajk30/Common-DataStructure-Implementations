class Node{
    int val;
    Node next;
    
    Node(int val){
        this.val = val;
        this.next = null;
    }
}

class MyList{
    Node root;
    
    MyList(){}
    
    MyList(int rootValue){
        this.root = new Node(rootValue);
    }

    //O(1) Operation
    void addElementAtStart(int val){
        Node node = new Node(val); 
        node.next = this.root;
        this.root = node;
    }
    
    //O(n) Operation
    void addElementAtEnd(int val){
        Node node = new Node(val);
        Node temp = this.root;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }
    
    //O(n) Operation
    void addElementAtkthIndex(int val, int k){
        Node node = new Node(val);
        if(this.root == null){
            this.root = node;
            return;
        }
        Node temp = this.root;
        int counter = 0;
        while(counter < k-1 && temp.next != null){
            temp = temp.next;
            counter++;
        }
        if(temp.next!=null)
            node.next = temp.next;
        
        temp.next = node;
    }
    
    void deleteElementAtStart(){
        if(this.root != null){
            Node temp = this.root.next;
            this.root.next = null;
            this.root = temp;
        }
    }
    
    void deleteElementAtEnd(){
        if(this.root != null){
            Node curr = null;
            Node nxt = this.root;
            while(nxt.next != null){
                curr = nxt;
                nxt = nxt.next;
            }
            curr.next = null;
        }
    }
    
    void deleteElementAtkthIndex(int k){
        if(root!=null){
            if(k==0) {
                deleteElementAtStart(); 
                return;
            }
            int counter = 0;
            Node curr = null;
            Node nxt = this.root;
            while(nxt.next != null && counter < k){
                curr = nxt;     
                nxt = nxt.next; 
                counter++;
            }
            if(counter==k){
                curr.next = nxt.next;
                nxt.next = null;       
            }
        }    

    }
    
    //O(n) Operation
    void printList(){
        if(this.root == null) {
            System.out.println("--Empty List--");
            return;
        }
        Node temp = this.root;
        while(temp != null){
            System.out.print(" "+temp.val+" -->");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.printList();
        
        list.addElementAtStart(3);
        list.printList();   
        
        list.addElementAtEnd(4);
        list.printList();   
        
        list.addElementAtStart(2);
        list.printList();   
        
        list.addElementAtStart(1);
        list.printList();   
        
        list.addElementAtkthIndex(6, 2);
        list.printList();   
        
        list.addElementAtkthIndex(7, 2);
        list.printList();   
        
        list.addElementAtkthIndex(8, 3);
        list.printList();   
        
        list.addElementAtStart(10);
        list.printList(); 
        
        list.addElementAtEnd(15);
        list.printList(); 
        
        list.deleteElementAtStart();
        list.printList(); 
        
        list.deleteElementAtEnd();
        list.printList(); 
        
        list.deleteElementAtkthIndex(3);
        list.printList(); 
        
        list.deleteElementAtkthIndex(5);
        list.printList(); 
        
        list.deleteElementAtkthIndex(0);
        list.printList(); 
        
        list.deleteElementAtkthIndex(0);
        list.printList(); 
    }
}
