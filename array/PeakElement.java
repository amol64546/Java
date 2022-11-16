package array;
import java.util.*;
import java.lang.*;
import java.io.*;

public class PeakElement
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<n; i++){
          arr[i] = sc.nextInt();        
      }
    
        if(n==1 || arr[0]>arr[1]){
			System.out.print(0);
		      	return;
	      	}	        
      for(int i=1; i<n-1; i++){			    		 		
        if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
			System.out.print(i);
          return;
        }
      }
      if(arr[n-1]>arr[n-2]){
		  System.out.print(n-1);
			    return ;
		 }
  System.out.print(-1); 


//       int ans = -1;
//      for(int i=0; i<n; i++){
//        if((i-1<0 || arr[i]>arr[i-1]) && (i+1>n-1 || arr[i]>arr[i+1])){
//          ans=i;
//          break;
//        }
//      }  
        
  }
}
