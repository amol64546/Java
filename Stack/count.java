import java.util.*;


public class count
{
	public static void main (String[] args) throws java.lang.Exception
	{
	        Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();	
	         int[] arr=new int[n];
	       for(int i=0; i<n; i++){
		      arr[i]=sc.nextInt();
	       }    
           int[] count = smallOnLeft(arr,n);           
        //    int[] count = smallOnright(arr,n);
           for(int i=0; i<n; i++){
            System.out.print(count[i]+" ");
            }
    
	}

       
   
    
       public static int[]  smallOnLeft(int[] arr,int n){
           Stack<Integer> st = new Stack<>();
           int[] ans = new int[n];
           
           for(int i=0; i<n; i++){   // forward loop
                   int curr = arr[i];
               while(!st.empty() && curr>arr[st.peek()]){
                   st.pop();
               }               
               if(st.empty()){  // if we dont get any smaller element on left
                   ans[i] = i;  // count of greater on left
               }else{     // prev smaller element on left
                        // count of greater on left
                   ans[i] = i-st.peek()-1;  // curr>arr[st.peek()]
               }
               st.push(i);
           }           
           
           return ans;
       }
        
       public static int[]  smallOnright(int[] arr,int n){
           Stack<Integer> st = new Stack<>();
            int[] ans = new int[n];
           
           for(int i=n-1; i>=0; i--){    // backward loop
                   int curr = arr[i];
              while(!st.empty() && curr>arr[st.peek()]){
                   st.pop();
               }               
               if(st.empty()){   // if we dont get any smaller element on right
                   ans[i] = n-i-1;   // count of greater on right
               }else{  // next smaller element on right
                        // count of greater on right
                  ans[i]= st.peek()-i-1;   //curr>arr[st.peek()]
               }
               st.push(i); 
           }          
           
           return ans;
       }     
   


}
