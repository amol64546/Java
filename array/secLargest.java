package array;
import java.util.*;
import java.lang.*;
import java.io.*;

public class secLargest
{
  	public static int getSecondLargest(int[] arr, int n){
    int max =Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
        if(n<2)
            return -1;
            
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }
            else if(arr[i]!=max && arr[i]>secMax){
                secMax = arr[i];
            }
        }
        
        if(secMax==Integer.MIN_VALUE)
            return -1;
        else
            return secMax;    
    }
  
	public static void main (String[] args) throws java.lang.Exception
	{		
      Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();	
	  int[] arr=new int[n];
	  for(int i=0; i<n; i++){
		  arr[i]=sc.nextInt();
	  }
      System.out.print(getSecondLargest(arr,n));      
	}
}
