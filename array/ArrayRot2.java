package array;
import java.util.*;
import java.io.*;

class ArrayRot2 {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int[] arr={1,2,3,4,5,6,7};
      int n = arr.length;
      int r=sc.nextInt();
      
      int newArr[] = new int[n]; 
      int k=2;  
      
        // Rotate the array to the left (counter-clockwise direction)   
       for(int i=r; i<n; i++,k++){
            newArr[k]= arr[i];
            
        }       
        for(int i=0; i<r; i++,k++){
           newArr[k]= arr[i];
          
        }
       
      
       // Rotate the array to the right (clockwise direction)
    //   for(int i=n-r; i<n; i++,k++){
    //       newArr[k]= arr[i];
    //       
    //   }       
    //   for(int i=0; i<n-r; i++,k++){
    //       newArr[k]= arr[i];
    //      
    //   }
      
      
       System.out.print(Arrays.toString(newArr));

    }
}
