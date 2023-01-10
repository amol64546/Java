
import java.util.*;
class ArrayRot{
	public static void main(String[] args) {
	    
	   
	   int[] arr = {1,2,3,4,5,6};
	   int n = arr.length;
	   int k = 2; 
	   
	   System.out.print(Arrays.toString(solve2(arr, n, k)));
		
	}
	
	public static int[] solve(int[] arr, int n, int k){
	    int[] temp = new int[n];
	    for(int i=0; i<n; i++){    
	       int index = (i+k)%n;         // {5,6,  1,2,3,4};    
	       //int index = (i+(n-k))%n;       // {3,4,5,6,  1,2};
	       temp[index]=arr[i];
	    }
	    return temp;
	}

     public static int[] solve2(int[] arr, int n, int k){
        int newArr[] = new int[n]; 
        // {5,6,  1,2,3,4};
        for(int i=0, m = n-k; m<n; i++,m++)
            newArr[i]= arr[m];                  
              
        for(int i=0, m=k; m<n; i++,m++)
           newArr[m]= arr[i];         
    
         return newArr;
    }
}







