
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
        insertion3();
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
            for(int j=i+1; j<n; j++){
                if(arr[minIndex]>arr[j])
                    minIndex = j;                
            }
            if(minIndex!=i)
                swap(i, minIndex);
        }
    }

    static void  insertion3(){
        for(int i=1; i<n; i++){
            int temp = arr[i];
            int j=i-1;
            while(j>=0 && temp<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    
    static void  insertion(){
        for(int i=1; i<n; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[j]<arr[j+1]){
                    swap(j, j+1);
                }else{
                    break;
                }
            }
        }
    }

    static void  insertion2(){
        for(int i=0; i<n-1; i++){
            for(int j=i; j>=0; j--){
                if(arr[j]>arr[j+1]){
                    swap(j, j+1);
                }else{
                    break;
                }
            }
        }
    }


    


    
}
