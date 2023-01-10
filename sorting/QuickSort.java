import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9,3,1,0,5};                
        quicksort(arr, 0, arr.length-1);                         
        System.out.println(Arrays.toString(arr));
    }


    static void quickSort(int arr[], int low, int high)
    {
        if(low>=high) return;
        int pi = partition(arr,low,high);
        quickSort(arr,low,pi-1);
        quickSort(arr,pi+1,high);
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot = arr[high];
        int i=low, j=low;
        while(i<=high){
            if(arr[i]<=pivot){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++; j++;
            }else{
                i++;
            }
        }
        return j-1;
    } 
}
