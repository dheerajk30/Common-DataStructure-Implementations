  public class DynamicArrayImplementation
  {
    public static void main(String[] args)
    {
      int[] a = new int[3];  
      a[0] = 3;a[1] = 4;a[2] = 5;
      DynamicArray obj1 = new DynamicArray(a);
      System.out.println("at first step object is"+ obj1.toString());
      
      obj1.add(6);
      System.out.println("at second step object is"+ obj1.toString());
      
      obj1.removeLastElement();
      System.out.println("at third step object is"+ obj1.toString());
      
      obj1.add(7);
      System.out.println("at last step object is"+ obj1.toString());
    }
  }
  
  class DynamicArray {
      
      public int[] A;
      int initialLength;
      int currentCounter ;
      
      DynamicArray(int[] elements) {
          this.initialLength = elements.length; 
          this.A = new int[initialLength];
          this.A = elements;
          this.currentCounter = elements.length - 1;
      }
      
      public String toString() {
          String summer = "";
          for(int i = 0;i< this.initialLength;i++){
              summer = summer + this.A[i] + ((i==this.initialLength-1)?"":",");
              
          }
          return summer;
      }
      
      void add(int element) {
          // terminal case 
           if(this.currentCounter == (this.initialLength - 1))  {
               int[] temp = new int[this.initialLength+1];
               //copy all elements
               for(int i=0;i<this.initialLength;i++){
                   temp[i] = this.A[i];
               }
               
               this.A = temp;
               this.currentCounter+=1;
               this.A[this.currentCounter]=element;
            //   System.out.println("temp counter is", temp, "and ",this.A);
               this.initialLength =this.initialLength+1;
           }
           // non-terminal addition
           else {
               this.A[this.currentCounter++]=element;
           }
      }
      
      void removeLastElement() {
             int[] temp = new int[this.initialLength-1];
               //copy all elements
               for(int i=0;i<=this.currentCounter -1;i++){
                   temp[i] = A[i];
               }
               this.A = temp;
               this.currentCounter -=1;
               this.initialLength-=1;
      }
      
  }
