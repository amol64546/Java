import java.util.*;

public class PrevMin {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        int[] ans = prevMin(arr,n);
        // int[] ans = prevMinDistance(arr,n);
        
        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }     

    }

    public static int[] prevMin(int[] arr, int n){
        Stack<Integer> st = new Stack<>();
        
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            while(!st.empty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.empty()){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return ans;

    }

    public static int[] prevMinDistance(int[] arr, int n){
        Stack<Integer> st = new Stack<>();
        
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            while(!st.empty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.empty()){
                ans[i]=-1;
            }else{
                ans[i]=i-st.peek();
            }
            st.push(i);
        }
        return ans;

    }
}
