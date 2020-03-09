import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //Input Data
        int[] data = new int[]{10, 15, 2, 100, 53};
        // create instance of Sorter
        SelectionSorter sorter = new SelectionSorter(data);
        System.out.println("Array to be sorted is(input):");
        sorter.printArray();
        // call sorting function which has the data
        sorter.sortUsingSelection();
        System.out.println("Sorted Array is(output):"); 
        sorter.printArray();
    }
}

class SelectionSorter {
    int[] data;
    
    SelectionSorter(int[] data){
        this.data = data;
    }
    
    void printArray(){
     for(int val : this.data){
         System.out.print(val+" ");
     }
     System.out.println();
    }
    
    void sortUsingSelection(){
        int k=0, n=this.data.length,min=Integer.MAX_VALUE;
        // start finding kth smallest element and replace it with kth indexed element
        while(k<n){
            int i=k, minIndex =0;
            min=Integer.MAX_VALUE;
            while(i<n){
                if(this.data[i] < min){
                    min=this.data[i];
                    minIndex = i;
                }
                i++;
            }
            int temp = this.data[k];
            this.data[k]=this.data[minIndex];
            this.data[minIndex]=temp;
            k++;
        }
    }
}
