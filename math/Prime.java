import java.util.*;
import java.io.*;

public class Prime {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter any no");
      int n = s.nextInt();

      if (n <= 1) {
         System.out.println(n + " neither prime or composite");
      } else {
         String check = "Prime";
         for (int i = 2; i < n; i++) {   // <=n/2  or <=Math.sqrt(n)
            if (n % i == 0) {
               check = "Composite";
               break;
            }

         }
         System.out.print(n + " is " + check);

      }

   }
}
