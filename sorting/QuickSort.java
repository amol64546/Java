import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9,3,1,0,5};                
        quicksort(arr, 0, arr.length-1);                         
        System.out.println(Arrays.toString(arr));
    }


    public static void quicksort(int[] arr, int l, int r){
//        if(l>=r) return;  // base case
      if(l<r){
         int p = partition(arr, l, r);
        quicksort(arr, l, p-1);
        quicksort(arr, p+1, r);
      }
       
    }

    public static void swap(int[] arr, int a, int b){
        int k = arr[a];
        arr[a] = arr[b];
        arr[b] = k;
    }

    public static int partition(int[] arr, int l, int r){
        int mid = (l+r)/2;
        int pivot = arr[mid];
        int i=l, j=r;
        while(i<j){
            while(i<=r && arr[i]<=pivot)
                i++;            
            while(arr[j]>pivot)
                j--;
            if(i<j)
                swap(arr, i, j);        
        }
        swap(arr, j, mid);       

        return j;
    }
}
