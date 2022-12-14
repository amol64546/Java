package array;
import java.util.*;

public class secondLargestIndex {  
 
    public static int getSecondLargest(int[] arr, int n){
      int largest=0, res=-1;
      for(int i=1; i<n; i++){
        if(arr[i]>arr[largest]){
          res=largest;
          largest=i;          
        }else if(arr[i]!=arr[largest]){
          if(res==-1 || arr[i]>arr[res])
              res=i;
        }
      }
      return res;
    }
       
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int index = getSecondLargest(arr,n);
        System.out.print(index);
                     
    }    
}
