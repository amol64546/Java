import java.util.*;
import java.io.*;
public class fib_last2digits {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      // after 300th fibonacci last two digits start repeating 
      long[] f = new long[300];
      f[0] = 0;
      f[1] = 1;
      for (int i = 2; i <= n; i++) {
         f[i] = (f[i - 1] + f[i - 2])%100;
      }
    if(f[n%300]/10>=1)      
         System.out.print(f[n%300]);
    else
         System.out.print("0"+f[n%300]);      
      
      
            
    //   long n1=0,n2=1,n3=0;    
    //   for(int i=2; i<=n; i++){
    //       n3=(n1+n2)%100;               
    //       n1=n2;
    //       n2=n3;
    //   }   
    //   String temp = String.format("%02d", n3);
     
   
   }
}
