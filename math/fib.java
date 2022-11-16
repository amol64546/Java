import java.util.*;
import java.io.*;

public class fib {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      long n1=0,n2=1,n3=0;
      // System.out.print(n1+" "+n2);
      for(int i=2; i<n; i++){
          n3=n1+n2;
         //  System.out.print(" "+n3);
          n1=n2;
          n2=n3;
      }
      System.out.print(n3);
      
      // long[] f = new long[n + 1];
      // f[0] = 0;
      // f[1] = 1;
      // for (int i = 2; i <= n; i++) {
      //    f[i] = f[i - 1] + f[i - 2];
      // }
      // System.out.print(f[n]);

     

   }
}
