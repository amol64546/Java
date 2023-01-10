import java.util.*;
import java.io.*;

public class fib {

    static long nthFibonacci(long n){       
        if(n<=1) return n;
        return nthFibonacci(n-1) +nthFibonacci(n-2) ;
    }

     static long nthFibonacci2(long n){       
        long f1=0,f2=1,f3=0;      
      for(long i=2; i<=n; i++){
          f3 = (f1 + f2) % 1000000007;       
          f1 = f2;
          f2 = f3;
      }
           return f3;
    }

   static void printFibonacci(long n){
          long[] f = new long[n + 1];
       f[0] = 0;
       f[1] = 1;
       for (long i = 2; i <= n; i++) {
          f[i] = f[i - 1] + f[i - 2];
      }
      System.out.print(Arrays.toString(f));
   }
     
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();  
      System.out.print(nthFibonacci2(n));

   }
}
