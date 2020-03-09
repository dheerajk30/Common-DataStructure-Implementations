import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //Input Data
        int[] initialData = new int[]{10, 15, 2, 100, 53};
        // create instance of Sorter
        DataSorter sorter = new DataSorter(initialData);
        System.out.println("\nModule 1: Selection Sort");
        System.out.println("Array to be sorted is(input):");
        sorter.printArray();
        // call selection sorting function which has the data
        sorter.sortUsingSelectionSort();
        System.out.println("Sorted Array is(output):"); 
        sorter.printArray();
        System.out.println("\nModule 2: Insertion Sort");
        sorter.setData(new int[]{5, 4, 1, 2, 3});
        System.out.println("Array to be sorted is(input):");
        sorter.printArray();
        // call insertion sorting function which has the data
        sorter.sortUsingInsertionSort();
        System.out.println("Sorted Array is(output):"); 
        sorter.printArray();
        System.out.println("\nModule 3: Bubble Sort");
        sorter.setData(new int[]{13, 19, 12, 2, 103});
        System.out.println("Array to be sorted is(input):");
        sorter.printArray();
        // call insertion sorting function which has the data
        sorter.sortUsingBubbleSort();
        System.out.println("Sorted Array is(output):"); 
        sorter.printArray();
        
        
        
    }
}

class DataSorter {
    int[] data;
    
    DataSorter(int[] data){
        this.data = data;
    }
    
    void setData(int[] data){
        this.data = data;
    }
    
    void printArray(){
     for(int val : this.data){
         System.out.print(val+" ");
     }
     System.out.println();
    }
    
    void sortUsingSelectionSort(){
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
    
    void sortUsingInsertionSort(){
       // k signifies last index of the sorted subarray
       int k=0,n=this.data.length;   
       while(k<n){
           int j=0;
           while(j<k){
               if(this.data[j]>this.data[k]){
                   int temp = this.data[j];
                   this.data[j]=this.data[k];
                   this.data[k]=temp;
               }
               j++;
           }
           k++;
       }
    }
    
    void sortUsingBubbleSort(){
        int i=0, n=this.data.length,j=0;
        while(i<n){
            j=0;
            while(j<n-1){
                int currElement = this.data[j];
                int nextElement = this.data[j+1];
                if(currElement > nextElement){
                    int temp = this.data[j];
                    this.data[j] = this.data[j+1];
                    this.data[j+1]=temp;
                }
                j++;
            }
            i++;    
        }

    }
}
