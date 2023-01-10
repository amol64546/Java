import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9,8,9,3,1,0,5,4};        
        divide(arr, 0, arr.length-1);                         
        System.out.println(Arrays.toString(arr));
    }
    
    public static void divide(int[] arr, int l, int r){
        if(l>=r) return;
        int mid=(l+r)/2;        
        divide(arr, l, mid);
        divide(arr, mid+1, r);
        mergeSort(arr, l, mid, r);
    }

    public static void mergeSort(int[] arr, int l, int m, int r){
       int[] temp = new int[r-l+1];
         int i=l, j=m+1;
         int k = 0;
         while(i<=m && j<=r){
             if(arr[i]<=arr[j])
                temp[k++] = arr[i++];
             else
                temp[k++] = arr[j++];
             
         }
          while(i<=m)
                temp[k++] = arr[i++];
         
          while(j<=r)
                temp[k++] = arr[j++];
            
        for(int p=l,t=0; p<=r; p++,t++){
            arr[p] = temp[t];
        }    
    }    
}
