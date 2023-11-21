
package bubblegum;

import java.util.Arrays;


public class Bubblegum {

    
    public static void main(String[] args) {
      int[] array = {12,1,89,42,34,65};
        
        System.out.println("Original array:" +Arrays.toString (array));
        
        bubbleSort(array);
        System.out.println("Sorted array:" + Arrays.toString(array));
    }
    
    
    static void bubbleSort(int[]arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i - 1; j ++){
                if(arr[j] < arr[j+1]){
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] =temp;
                }
            }
            
        }
    }
}
