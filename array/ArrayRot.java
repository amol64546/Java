package array;
import java.util.*;
class ArrayRot{
	public static void main(String[] args) {
	    
	   
	   int[] arr = {1,2,3,4};
	   int n = arr.length;
	   int k = 2; 
	   
	   System.out.print(Arrays.toString(solve(arr, n, k)));
		
	}
	
	public static int[] solve(int[] arr, int n, int k){
	    int[] temp = new int[n];
	    for(int i=0; i<n; i++){
	       //int index = (i+k)%n;         // right circular rotation    // left to right       
	       int index = (i+(n-k))%n;      // left circular rotation	    // right to left
	       temp[index]=arr[i];
	    }
	    return temp;
	}
}


// two rotations
//0 1 2 3 4 5  
//2 3 4 5 0 1  // (i+(n-k))%n
//4 5 0 1 2 3  // (i+k)%n






