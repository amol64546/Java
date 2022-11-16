import java.util.*;
import java.io.*;

public class PrimeSum {
   public static boolean isPrime(int n){   
     for(int i=2; i<=Math.sqrt(n); i++){      
        if(n%i==0) return false;
     }
    return true;
  }


   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);

      System.out.println("Enter any no");
      int n = s.nextInt();
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = s.nextInt();
      }

      int sum = 0;
      for (int i = 0; i < n; i++) {         
         if (isPrime(i) && arr[i]>1 ) {
            sum += arr[i];
         }
      }
      System.out.print(sum);

   }
}
