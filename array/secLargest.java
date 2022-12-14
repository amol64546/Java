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
            
        for(int val: arr){
            if(val>max){
                secMax=max;
                max=val;
            }
            else if(val!=max && val>secMax){
                secMax = val;
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
