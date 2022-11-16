package array;
import java.util.*;
public class remove_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                       				     
        int[] A = {1, 2, 4, 5, 10, 6, 3};   
            
        // finding size for new array only containing odd elements           
        int size=0;        
        for(int value: A){
            if(value%2!=0){
                size++;
            }
        }
        
        // making new array to store odd elements only
		int[] B = new int[size];               
        for(int i=0, j=0; i<A.length; i++){
            if(A[i]%2!=0){    //  taking only odd elements
                B[j]=A[i];
                j++;
            }
        }        
        System.out.print(Arrays.toString(B));		
    }   
}
