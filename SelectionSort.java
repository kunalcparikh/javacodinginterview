import java.util.*;

public class SelectionSort{

     public static void main(String []args){
        System.out.println("Performing SelectionSort");
        SelectionSort.selectionSort();
        
     }
     
    private static void  selectionSort(){
        
        int[] arr = new int[]{64,25,12,22,11};
        System.out.println("\tInput Array :: " +Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            int min = arr[i];
            for(int k =i+1;k<arr.length;k++){
                if(arr[k] < min){
                    min = arr[k];
                    arr[k] = arr[i];
                    arr[i] = min;
                }
                
            }
        }
     System.out.println("\tOutput Sorted Array :: "+Arrays.toString(arr));    
     System.out.println("https://en.wikipedia.org/wiki/Selection_sort :: Time Complexity/Big O Notation = O(n2) - n square ");
     System.out.println("Thanks you https://www.tutorialspoint.com/ for providing free online IDE ");
      
        
    } 
}
