
import java.util.*;
public class Sorting {
   static int arr[] = {8,5,9,7,1,5};
   static int n = arr.length;
   
   static void swap(int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
   }
    public static void main(String[] args) {
        // bubble();
        // selection();
        // insertion();
        // insertion2();
       
        System.out.println(Arrays.toString(arr));
       
    }

    static void  bubble(){
        for(int i=0; i<n-1; i++){
            boolean hasSwapped=false;
            for(int j=0; j<n-1-i; j++){                
                if(arr[j]>arr[j+1]){
                    hasSwapped=true;
                    swap(j, j+1);
                }         

            }
            if(!hasSwapped){
                return;
            }
        }
    }

    static void  selection(){
        for(int i=0; i<n-1; i++){
            int minIndex=i;
            // selecting min value index
            for(int j=i+1; j<n; j++){
                if(arr[minIndex]>arr[j])
                    minIndex = j;                
            }
            if(minIndex!=i)
                swap(i, minIndex);
        }
    }

 

       static void  insertion(){
        for(int i=1; i<n; i++){
            int temp = arr[i];
            int j=i;
            while(j>0 && temp<arr[j-1]){
                arr[j] = arr[j-1];   
                j--;           
            }
            arr[j]=temp;
        }

static void insertion2()
  {
     
      for(int i=0; i<n-1; i++){
          for(int j=i+1; j>0; j--){
              if(arr[j]<arr[j-1]){
                  int temp = arr[j];
                  arr[j] = arr[j-1];
                  arr[j-1] = temp;
              }else
                break;
          }
      }
      
      
  }
    }

    


    
}
