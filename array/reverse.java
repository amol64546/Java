package array;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
		
		// reverse elements
        // for (int i = n - 1; i >= 0; i--) {
        //     System.out.print(matrix[i] + " ");
        // }
		
		 // reverse elements
        for(int i=0; i<n/2; i++){
		  int temp=arr[i];
          arr[i]=arr[n-1-i];
          arr[n-1-i]=temp;
	    }
	  
      System.out.print(Arrays.toString(arr));      

    }
}
