
import java.util.*;
class ArrayRot{
	public static void main(String[] args) {
	    
	   
	   int[] arr = {1,2,3,4,5,6};
	   int n = arr.length;
	   int k = 2; 
	   
	   System.out.print(Arrays.toString(solve2(arr, n, k)));
		
	}
	
	
	public void solve2(int[] nums,int n, int k) {		
		k = k%n;        
		reverse(nums,0,n-1);    // reverse whole arr
		reverse(nums,0,k-1);	// reverse first k elements
		reverse(nums,k,n-1);	// reverse rest elements
		return nums;
	   }
    
	public void reverse(int[] arr, int i,int j){
		while(i<j){
		    int temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		    i++; j--;
		}
   	}	

     public static int[] solve(int[] arr, int n, int k){
        int aux[] = new int[n]; 
        // {5,6,  1,2,3,4};
	     int idx = 0;
        for(int i=n-k; i<n; i++)
            aux[idx++]= arr[m];                  
              
        for(int i=0; i<n-k; i++)
           aux[idx++]= arr[i];         
    
         return aux;
    }
}







