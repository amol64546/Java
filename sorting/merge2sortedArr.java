import java.util.*;

public class merge2sortedArr
{
	public static void main (String[] args) throws java.lang.Exception
	{	
     
     // ********Merge two arrays in sorted form -> O(n+m)
     Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();	
	  int[] arr1=new int[n];
	  for(int i=0; i<n; i++){
		  arr1[i]=sc.nextInt();          
	  }
      Arrays.sort(arr1);
      int m = sc.nextInt();
      int[] arr2=new int[m];
       for(int i=0; i<m; i++){
		  arr2[i]=sc.nextInt();          
	  }     
      Arrays.sort(arr2);
      
      int[] mergedArr=new int[m+n];
      int i=0,j=0,k=0;
      
      while(i<n && j<m){
      
          if(arr1[i]<=arr2[j]){
              mergedArr[k++]=arr1[i++];             
          }else{
              mergedArr[k++]=arr2[j++];              
          }                   
      }
      
       // Store remaining elements of first array or second array 
        while (i < n) 
            mergedArr[k++] = arr1[i++]; 
        while (j < m) 
            mergedArr[k++] = arr2[j++]; 
      
      System.out.print(Arrays.toString(mergedArr));         
    }
}
