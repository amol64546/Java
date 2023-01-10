import java.io.*;
import java.util.*;

class Solution {
	void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	void downheapify(int[] arr, int pi,int limit){
		int lci = 2*pi + 1;
		int rci = 2*pi + 2;
		int maxi = pi;
		if(lci<limit && arr[maxi] < arr[lci]) maxi = lci;
		if(rci<limit && arr[maxi] < arr[rci]) maxi = rci;
		if(maxi != pi){
			swap(arr,maxi,pi);
			downheapify(arr,maxi,limit);
		}
		
	}
    void heapSort(int arr[], int n)
    {
		// build max heap
		for(int i=n-1; i>=0; i--){			
			downheapify(arr,i,n);
		}

		// sort
        for(int i=n-1; i>=0; i--){
			swap(arr,0,i);
			downheapify(arr,0,i);
		}
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.heapSort(arr1, n);
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
