package array;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i=0, j=n-1;
        while(i<j){
           if(arr[i]!=arr[j]) {
               System.out.print("Not palindrome");
                  break;
             }
i            i++; j--;
        }
       System.out.print("palindrome");


    }
}
